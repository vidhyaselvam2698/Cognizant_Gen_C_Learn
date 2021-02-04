import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class EBBillTest {
    private EBBill ebBill;

    @Test
    public void test0() {
        ebBill = new EBBill(0);
        assertTrue(0 == ebBill.calculateBillAmount());
    }

    @Test
    public void test50() {
        ebBill = new EBBill(50);
        assertTrue(130 == ebBill.calculateBillAmount());
    }

    @Test
    public void test100() {
        ebBill = new EBBill(100);
        assertTrue(292.5 == ebBill.calculateBillAmount());
    }

    @Test
    public void test200() {
        ebBill = new EBBill(200);
        assertTrue(818.5 == ebBill.calculateBillAmount());
    }

    @Test
    public void test1000() {
        ebBill = new EBBill(1000);
        assertTrue(7018.5 == ebBill.calculateBillAmount());
    }

    @Test
    public void test5000() {
        ebBill = new EBBill(5000);
        assertTrue(47018.5 == ebBill.calculateBillAmount());
    }
}
