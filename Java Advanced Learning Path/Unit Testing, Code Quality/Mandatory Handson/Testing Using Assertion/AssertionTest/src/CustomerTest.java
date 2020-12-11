import org.junit.Test;

import static org.junit.Assert.*;

public class CustomerTest {
    @Test
    public void adhar_card_validation_test() {
        Customer customer = new Customer(
                "2012345678912345",
                "Ritam",
                "Chakraborty",
                "Midnapore",
                9876543210L,
                "ritam@gmail.com"
        );

        assertTrue(Customer.isValidAadharNo("201234567891"));
        assertFalse(Customer.isValidAadharNo("101234567891"));
    }

    @Test
        public void first_name_last_name_test() {
        Customer customer = new Customer(
                "2012345678912345",
                "Ritam",
                "Chakraborty",
                "Midnapore",
                9876543210L,
                "ritam@gmail.com"
        );

        assertNotEquals(customer.getFirstName(), customer.getLastName());
    }

    @Test
    public void email_not_null_test() {
        Customer customer = new Customer(
                "2012345678912345",
                "Ritam",
                "Chakraborty",
                "Midnapore",
                9876543210L,
                "ritam@gmail.com"
        );

        assertNotNull(customer.getEmailId());
    }
}
