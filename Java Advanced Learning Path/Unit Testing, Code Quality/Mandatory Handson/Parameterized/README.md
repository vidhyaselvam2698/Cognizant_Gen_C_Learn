# Parameterized

Rainbow Jewellers, decodes how prices are calculated by jewellery shops which help the customers calculate the approximate cost of the jewellery. They have developed an application for the above purpose. The details of the various functions supported by the system are provided in this case study.

You are required to write Junit test case and check the correctness of the application developed.

## Functional Requirements:

The application has the below classes and methods implemented.

You are provided with a Main class RainbowJewellers

### **Component Specification**: RainbowJewellers (Main Class)

| Type(Class) | Methods | Responsibilities | 
| ----------- | ------- | ---------------- |
| RainbowJewellers | `public static void main(String[] args)` | Create scanner object to get the grams from the customer.<br>Create ranibowJewellersService object to call calculategoldprice method.It will return total gold price. |

 

### **Component Specification**: RainbowJewellersService(Service Class)

The below are the requirements  implemented in the Utility class for which JUnit test cases are to be written and tested.

| Component Name | Type(Class) | Methods | Responsibilities | 
| -------------- | ----------- | ------- | ---------------- |
| Calculate gold price | RainbowJewellersService | `public double calculategoldprice(double gram)` | This method used to calculate gold price based on the argument gram.<br>The price of gold listed by the jeweller is Rs. 44,500 for 10 grams of 22KT gold. Suppose, if you wish to purchase a gold chain of 9.6 grams, then price will be calculated as:<br><ol><li>Price of 1 gram of gold =   Rs 44,500 divided by 10 = Rs. 4,450</li><li>Price of 9.60 grams' gold chain = Rs 4,450 times 9.60 grams = Rs 42,720</li><li>Add making charges, suppose 10%, which comes to Rs 4,272.00 (10% of Rs 42,720)
Add 3% GST ,1409.76(3% of Rs 46992)</li><li>Total price of 9.60 gram gold jewel(Rs.48,401.76)</li></ol><br>Final price of the jewellery = Price of (22 KT or 18 KT) gold X (Weight in grams) + Making charges + GST at 3% on (Price of jewellery + making charges) |

You need to write Junit test for the RainbowJewellersService class.

## Testing Scenarios:

You are provided with a class  “RainbowJewellersParameterizedTest”  to do parameterized testing. 

### Note:

First create Parameterized test class named as RainbowJewellersParameterizedTest.

Create below attributes.

| Type(Class) | Attributes |
| ----------- | ---------- |
| RainbowJewellersParameterizedTest | double gram<br>double expectedgoldprice |

Create a constructor that stores the test data.

Create a static method that generates and returns test data.

The below are the test methods to be implemented in RainbowJewellersParameterizedTest class.

| Test Method | Scenarios / Responsibilities |
| ----------- | ---------------------------- |
| testCalculateGoldPrice | This method is used to test calculategoldprice method in RainbowJewellersService class.<br>Pass an input value and an expected value to the test method.<br>Compute the actual result with different input values.<br>Test sample inputs like 9.6 gram,56 gram,24.5 gram,0 gram,-1 gram as input and find the gold price using parameterized test.<br>Assert That the actual value with the expected value. |

 

Implement the test method and provide the needed annotation to the parameterized test methods in RainbowJewellersParameterizedTest class.

You need to write Parameterized test for the RainbowJewellersService class to find estimate gold price based on the input grams given in the sample.