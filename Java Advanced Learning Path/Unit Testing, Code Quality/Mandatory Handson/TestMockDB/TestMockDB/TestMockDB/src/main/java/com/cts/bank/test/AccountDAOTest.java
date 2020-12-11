package com.cts.bank.test;

import com.cts.bank.dao.AccountDAO;
import com.cts.bank.exception.AccountTransactionException;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class AccountDAOTest {
    @Mock
    private DataSource ds;
    @InjectMocks
    private AccountDAO dao;
    @Mock
    private Connection con;
    @Mock
    private PreparedStatement ps;
    @Rule
    public ExpectedException exceptionRule = ExpectedException.none();

    @Before
    public void setUp() throws Exception {
        when(ps.executeUpdate()).thenReturn(1);
        when(con.prepareStatement("UPDATE ACCOUNT SET balance = balance + ? WHERE accNo = ?")).thenReturn(ps);
        when(ds.getConnection()).thenReturn(con);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test()
    public void testInvalidAccount() throws AccountTransactionException {
        exceptionRule.expect(AccountTransactionException.class);
        dao.deposit("", 123.45);
    }

    @Test()
    public void testNullAccount() throws AccountTransactionException {
        exceptionRule.expect(AccountTransactionException.class);
        dao.deposit(null, 123.45);
    }

    @Test()
    public void testInvalidAmount() throws AccountTransactionException {
        exceptionRule.expect(AccountTransactionException.class);
        dao.deposit("123", 0);
        dao.deposit("123", -1);
    }

    @Test()
    public void testMethodCall() throws SQLException, AccountTransactionException {
        dao.deposit("123", 123);

        verify(ps, times(1)).executeUpdate();
        verify(con, times(1)).prepareStatement(anyString());
        verify(ds, times(1)).getConnection();
    }
}
