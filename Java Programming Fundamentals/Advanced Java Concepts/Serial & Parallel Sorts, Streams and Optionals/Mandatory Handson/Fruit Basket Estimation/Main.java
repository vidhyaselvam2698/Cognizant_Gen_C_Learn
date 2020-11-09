import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FruitBasketUtility fruitBasketUtility = new FruitBasketUtility();
        int option;

        do {
            System.out.println("Select an option:\n1.Add Fruit to Basket\n2.Calculate Bill\n3.Exit");
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1: {
                    System.out.println("Enter the fruit name");
                    String fruitName = scanner.nextLine();
                    System.out.println("Enter weight in Kgs");
                    int weightInKgs = scanner.nextInt();
                    System.out.println("Enter price per Kg");
                    int pricePerKg = scanner.nextInt();

                    FruitBasket fbObj = new FruitBasket(fruitName, weightInKgs, pricePerKg);
                    fruitBasketUtility.addToBasket(fbObj);

                    break;
                }
                case 2: {
                    int total = fruitBasketUtility.calculateBill(fruitBasketUtility.getFruitBasketList().stream());
                    if (total == 0) {
                        System.out.println("Your basket is empty. Please add fruits.");
                    } else {
                        System.out.println("The estimated bill amount is Rs " + total);
                    }
                    break;
                }
                case 3:
                    System.out.println("Thank you for using the application.");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        } while (option != 3);
    }
}
