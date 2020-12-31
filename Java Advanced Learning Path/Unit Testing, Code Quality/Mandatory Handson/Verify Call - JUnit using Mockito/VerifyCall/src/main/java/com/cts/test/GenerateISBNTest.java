package com.cts.test;


import com.cts.utility.Book;
import com.cts.utility.GenerateISBN;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GenerateISBNTest {
    @Mock
    Book book;

    @InjectMocks
    GenerateISBN service;
    
    @Rule
    public ExpectedException exceptionRule = ExpectedException.none();

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testSuccess() {
        String correctISBN = "ISBN1111";
        service.assignISBN(correctISBN);

        verify(book, times(1)).setIsbn(correctISBN);
    }

    @Test
    public void testFailed() {
        exceptionRule.expect(RuntimeException.class);

        String incorrectISBN = "ISBN111";
        service.assignISBN(incorrectISBN);

        verify(book, times(0)).setIsbn(incorrectISBN);
    }

    @Test
    public void testException() {
        exceptionRule.expect(RuntimeException.class);
        exceptionRule.expectMessage("Invalid Code");

        String incorrectISBN = "ISBN111";
        service.assignISBN(incorrectISBN);

        verify(book, times(0)).setIsbn(incorrectISBN);
    }
}
