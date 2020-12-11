# TestMockDB

## Important Instructions:

- Please read the document thoroughly before you code.
- Import the given skeleton code into your Eclipse.
- Do not change the Skeleton code or the package structure, method names, variable names, return types, exception clauses, access specifiers etc.
- You can create any number of private methods inside the given class.
- Use **Mockito** annotations to mock & injects instances.
- You are provided with a Main class with the main method to check the correctness of the test methods written.
- Having completed writing the test methods, execute the main method and identify the result.

## Assessment Coverage:

- Mocking DataSource, Connection, PreparedStatement, and mock injection
- JUnit annotations & exception rule

Given you an Bank Service application, which accepts amount to deposit in an account. If the account number is **null** / **empty**, it has to throw AccountTransactionException with message “**Invalid account number**”. If the amount is **negative**/**zero**, it has to throw **AccountTransactionException** with message “**Invalid amount**”. On the successful execution of deposit method, balance column in account table updated as deposit + amount.

You are required to write Junit test case using Mockito and check the correctness of the application developed.

## Skeleton:

### Functional Requirements:

The application has the below classes and methods implemented.

### **Component Specification**: AccountDAO (DAO Class)

| Class | Attribute(s) | Template Method(s) | 
| ----- | ------------ | ------------------ |
| AccountDAO | DataSource ds |  |

## Business Rule:

The below is the requirement implemented in the Utility class for which JUnit test cases are to be written and tested.

| Class | Method(s) | Responsibilities | Exception |
| ----- | --------- | ---------------- | --------- |
| AccountDAO | `boolean deposit(String accNo, double amount)` | Accepts accNo & amount as parameter.<br>If accNo & amount valid, it uses data source and add amount in ACCOUNT table balance column for the account_number accNo using prepared statement. | If accNo parameter is null or empty, it has to throw AccountTransactionException with message “Invalid account number”.<br>If amount parameter is less than or equal to 0, it has to throw AccountTransactionException with message “Invalid amount” | 

### Testing Scenarios:

You are provided with a class “AccountDAOTest” to do this testing. You are required to mock data source & dao class, and verify method call times & mock exception.

#### **Note**:

To perform testing, the AccountDAO should contain objects of DataSource.

The below are the test methods to be implemented in AccountDAOTest class.

<table>
<thead>
<tr>
<th>Test Cases / Methods</th>
<th>Scenarios / Responsibilities</th>
</tr>
</thead>
<tbody>
<tr>
<td>testInvalidAccount</td>
<td>This method should expect &amp; handle the AccountTransactionException &amp; message “Invalid account number” when deposit() method called with empty account number and some amount.</td>
</tr>
<tr>
<td>testNullAccount</td>
<td>This method should expect &amp; handle the AccountTransactionException &amp; message “Invalid account number” when deposit() method called with null as account number and some amount.</td>
</tr>
<tr>
<td>testInvalidAmount</td>
<td>This method should expect &amp; handle the AccountTransactionException &amp; message “Invalid amount” when deposit() method called with some account number with 0/negative number as amount.</td>
</tr>
<tr>
<td>testMethodCall</td>
<td>This method should verify whether the following methods called exactly 1 time<table>
<thead>
<tr>
<th>mocked instance</th>
<th>method to verify</th>
</tr>
</thead>
<tbody>
<tr>
<td>DataSource</td>
<td>getConnection()</td>
</tr>
<tr>
<td>Connection</td>
<td>prepareStatement()</td>
</tr>
<tr>
<td>PreparedStatement</td>
<td>executeUpdate()</td>
</tr>
</tbody>
</table>
<br>if deposit() method invoked with valid account number and amount and assert it returns true.</td>
</tr>
</tbody>
</table>


Implement the test methods and add the needed annotations to all the methods in AccountDAOTest class.


