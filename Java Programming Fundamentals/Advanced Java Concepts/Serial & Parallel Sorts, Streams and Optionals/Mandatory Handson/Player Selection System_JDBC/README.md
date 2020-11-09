# Player Selection System_JDBC

The state government organizes a sports meet to encourage the school students. The selection committee for this event receives a huge number of registrations. So to organize things better they are in a need of an application to categorize the students registered as players based on their height (in centimetres) and weight (in Kilograms).

You being their software consultant have been approached to develop an application which can be used for managing their requirement. You need to implement a Java program to view the list of player’s name based on their height and weight.

# Component Specification: Player(Model Class)

| Type(Class) | Attributes | Methods | 
| ----------- | ---------- | ------- |
| Player | int playerId<br><br>String playerName<br><br>double height<br><br>double  weight | 


## Note: 

Appropriate public getters, setters and a four argument constructor in the given order – playerId, playerName, height, weight are provided as a part of the code template.

## Requirement: 

Retrieve the list of player’s name based on their height and weight.

The application should retrieve the player’s names in ascending order, from the database based on the minimum height and maximum weight requirements. The shortlisted players should be within the range of the specified minimum height and the specified maximum weight (both inclusive).

# Component Specification: PlayerSelectionSystem

| Type (Class) | Methods | Responsibilities | 
| ------------ | ------- | ---------------- |
| PlayerSelectionSystem | **`public List<String> playersBasedOnHeightWeight(double minHeight, double maxWeight)`** | This method should accept minHeight and maxWeight as parameters and retrieve the player’s names who are within the range of minHeight and maxWeight (both inclusive) from the database. Return these player’s names in ascending order as a List of String. |

The player table is already created in the backend. The structure of the table is as shown below:

| Column Name | Data Type | 
| ----------- | --------- |
| playerId | int |
| playerName | varchar(30) | 
| height | double(6,2) |
| weight | double(6,2) |

Sample records available in the player table are as shown below:

| playerId | playerName | height | weight |
| -------- | ---------- | ------ | ------ | 
| 7507 | Savannah | 172 | 66 |
| 4588 | Julian | 152 | 50 |
| 324 | Jacob | 115 | 47 |
| 45 | Thomas | 164 | 65 |
| 7542 | Charles | 107 | 49 | 
| 565 | Maya | 125 | 50 | 
| 2458 | Natalie | 140 | 59 |
| 1237 | Daisy | 150 | 59 |


To connect to the database you are provided with the database.properties file and the DB.java file.

Create a class called Main with the main method and get the inputs like the minimum height and the maximum weight from the user.

Display the player’s names returned as `List<String>` from the method playersBasedOnHeightWeight  in the PlayerSelectionSystem class.

If no player is available in the list, the output should be “**`No players are with minimum height of <minHeight> and maximum weight of <maxWeight>`**”

> Sample Input 1:

    Enter the minimum height
    140
    Enter the maximum weight
    65

> Sample Output 1:

    Daisy
    Julian
    Natalie
    Thomas

---

> Sample Input 2:

    Enter the minimum height
    120
    Enter the maximum weight
    35

> Sample Output 2:

    No players are with minimum height of 120.0 and maximum weight of 35.0

---

> Sample Input 3:

    Enter the minimum height
    250
    Enter the maximum weight
    65

> Sample Output 3:

    No players are with minimum height of 250.0 and maximum weight of 65.0
