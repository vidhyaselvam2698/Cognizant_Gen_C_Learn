import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Customer {
    private static Pattern aadhaarPattern = Pattern.compile("^[2-9]{1}[0-9]{11}$");
    private String aadharCardNo;
    private String firstName;
    private String lastName;
    private String address;
    private long mobileNo;
    private String emailId;

    public Customer(String aadharCardNo, String firstName, String lastName, String address, long mobileNo, String emailId) {
        this.aadharCardNo = aadharCardNo;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.mobileNo = mobileNo;
        this.emailId = emailId;
    }

    public static Pattern getAadhaarPattern() {
        return aadhaarPattern;
    }

    public static void setAadhaarPattern(Pattern aadhaarPattern) {
        Customer.aadhaarPattern = aadhaarPattern;
    }

    public String getAadharCardNo() {
        return aadharCardNo;
    }

    public void setAadharCardNo(String aadharCardNo) {
        this.aadharCardNo = aadharCardNo;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(long mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public static boolean isValidAadharNo(String name) {
        Matcher matcher = aadhaarPattern.matcher(name);
        return matcher.find();
    }
}
