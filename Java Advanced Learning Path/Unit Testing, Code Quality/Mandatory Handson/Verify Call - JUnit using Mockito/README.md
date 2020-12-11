# Verify Call - JUnit using Mockito

<p align="center"><b>Mockito – Verify Method Call</b></p>

## Important Instructions:

- Please read the document thoroughly before you code.
- Import the given skeleton code into your Eclipse.
- Do not change the Skeleton code or the package structure, method names, variable names, return types, exception clauses, access specifiers etc.
- You can create any number of private methods inside the given class.
- Use Mockito annotations to mock & injects instances.
- You are provided with a Main class with the main method to check the correctness of the test methods written.
- Having completed writing the test methods, execute the main method and identify the result.

## Assessment Coverage:

- Mockito annotations & verify methods
- JUnit annotations & exception handling rules

Given you an application, which assign the valid ISBNs to books. If the ISBN is invalid, it has to throw **RuntimeException** with message “**Invalid Code**”.

You are required to write Junit test case using Mockito and check the correctness of the application developed.

## Functional Requirements:

The application has the below classes and methods implemented.

You are provided with a model class Book

### **Component Specification**: Book (Model Class)

| Class | Attribute(s) | Template Method(s) |
| ----- | ------------ | ------------------ |
| Book | String name<br>String isbn | Necessary getters, setters and constructors provided as part of skeleton |

By default the book objects created with name using single argument constructor. setIsbn() method need to be used to assign ISBN.

### **Component Specification**: GenerateISBN (Utility Class)

| Class | Attribute(s) | Template Method(s) |
| ----- | ------------ | ------------------ | 
| GenerateISBN | Book book | Constructor provided to inject book object in class |

## Business Rule:

The below is the requirement implemented in the Utility class for which JUnit test cases are to be written and tested.

| Class | Method(s) | Responsibilities | Exception |
| ----- | --------- | ---------------- | --------- |
| GenerateISBN | Book assignISBN(String isbn) | If the isbn parameter maches ISBN[4digits] (e.g., ISBN0000) then invoke book object’s setIsbn(isbn) only once and return book object. | if isbn parameter doesn’t match business rule, throw RuntimeException with message “Invalid Code” |

## Testing Scenarios:

You are provided with a class “GenerateISBNTest” to do this testing. You are required to mock model & utility classes, and verify method call times & mock exception.

### **Note**:

To inject and perform testing, the GenerateISBN should contain objects of Book.

The below are the test methods to be implemented in GenerateISBNTest class.

| Test Cases / Methods | Scenarios / Responsibilities |
| -------------------- | ---------------------------- |
| testSuccess | This method should verify the setIsbn() method call, whether it has invoked only once for valid ISBN and no exceptions thrown |
| testFailed | This method should verify that the setIsbn() method never called (times 0) if Invalid ISBN passed as parameter.<br>Note: Handle exception to avoid test abortion. |
| testException | This method should verify that the assignISBN() method throws RuntimeException with message “Invalid Code” if isbn code is not compliance with business rule. |

Implement the test methods and provide the needed annotation to all the methods in GenerateISBNTest class.

