# Search for Trains - JDBC

Indian Railways Department wants to automate a process in their system. The train details are available in the database. The user should have a facility to search and view the trains based on a particular coach type available in the train which starts from a particular source place and ends in a particular destination place. A train can have various coach types among AC1, AC2, AC3, Sleeper and Seater.

You being their software consultant have been approached by them to develop an application which can be used for managing their business. You need to implement a Java program to view all the train which runs between a source and a destination with a particular coach type. Display the trains in a sorted order based on train number.

## Component Specification: Train (Model Class)

| Type(Class) | Attributes | Methods |
| ----------- | ---------- | ------- 
| Train | int trainNumber<br><br>String trainName<br><br>String source<br><br>String destination<br><br>int ac1<br><br>int ac2<br><br>int ac3<br><br>int sleeper<br><br>int seater |


### Note: 

Appropriate public getters,setters and a nine argument constructor in the given order – **trainNumber, trainName, source, destination, ac1, ac2, ac3, sleeper, seater** are provided as a part of the code template.

## Requirement: 

Retrieve all the trains between source and destination with the required coach type

The user should have a facility to search and view the trains which runs between a source and a destination with a particular coach type. Hence the system should fetch all the train details for the given source and destination which contains the given coach type, from the database.

There can be more than one train which suits for the given requirement. So, the train details should be retrieved in a sorted order based on train number. Add all those train details into an ArrayList and return the same.

## Component Specification: TrainManagementSystem

| Component Name | Type (Class) | Methods | Responsibilities |
| -------------- | ------------ | ------- | ---------------- |
| Retrieve all the trains between source and destination with the given coachType  | TrainManagementSystem | `public ArrayList<Train> viewTrain(String coachType, String source, String destination)` | This method should accept a coachType, source and destination as parameters and retrieve all the trains with the given coach type that runs between the source and destination from the database in ascending order based on train number. Return these details as `ArrayList<Train>`. |

The train table is already created at the backend. The structure of train table is:

| Column Name | Data Type | train_number |
| ----------- | --------- | ------------ |
| int | train_name | 
| varchar(30) | source | 
| varchar(30) | destination |
| varchar(30) | ac1 | 
| int | ac2 |
| int | ac3 | 
| int | sleeper | 
| int | seater | 

### Sample records available in train table are: 

| train_number | train_name | source | destination | ac1 | ac2 | ac3 | sleeper | seater |
| ------------ | ---------- | ------ | ----------- | --- | --- | --- | ------- | ------ |
| 13005 | "Dehradun Mail" | "Howrah" | "Dehradun" | 3 | 0 | 3 | 5 | 0 |
| 13009 | "Doon Express" | "Howrah" | "Dehradun" | 5 | 5 | 10 | 0 | 0 |
| 22119 | "Pune Express" | "Mumbai" | "Pune" | 3 | 0 | 0 | 10 | 5 |
| 12123 | "Deccan Queen" | "Mumbai" | "Pune" | 0 | 7 | 0 | 5 | 0 |
| 15635 | "Dwarka Express" | "Okha" | "Guwahati" | 0 | 0 | 0 | 11 | 6 |
| 51422 | "Mumbai Pune Passenger" | "Mumbai" | "Pune" | 0 | 0 | 0 | 0 | 21 |
| 14645 | "Shalimar Express" | "Delhi" | "Jammu Tawi" | 0 | 8 | 7 | 0 | 2 |

To connect to the database you are provided with database.properties file and DB.java file. 

Create a class called **Main** with the main method and get the inputs like **source, destination and coachType** from the user. The coachType should be any one among AC1, AC2, AC3, Sleeper and Seater (Case In-sensitive). If coachType is valid, then call viewTrain method in **`TrainManagementSystem`** class. Otherwise, display the output as **“Invalid Coach Type”**.

Display the details of train such as trainNumber and trainName for all the trains returned as `ArrayList<Train> `from the method viewTrain in TrainManagementSystem class.

If no train is available as per the requirement, the output should be “**No trains found**”.

> Sample Input 1:

    Enter the source
    Howrah
    Enter the destination
    Dehradun
    Enter the coach type
    AC2

> Sample Output 1:

    13009  Doon Express

---

> Sample Input 2:

    Enter the source
    Mumbai
    Enter the destination
    Pune
    Enter the coach type
    sleeper

> Sample Output 2:

    12123  Deccan Queen
    22119  Pune Express

--- 

> Sample Input 3:

    Enter the source
    Okha
    Enter the destination
    Guwahati
    Enter the coach type
    AC

> Sample Output 3:

    Invalid Coach Type

---

> Sample Input 4:

    Enter the source
    Okha
    Enter the destination
    Guwahati
    Enter the coach type
    AC1

> Sample Output 4:

    No trains found

