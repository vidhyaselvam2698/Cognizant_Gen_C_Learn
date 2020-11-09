import java.util.Scanner;
import java.util.stream.Stream;


public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int option = 0;
        String participantName;
        String departmentName;
        String collegeName;
        ParticipantUtility viewObj = new ParticipantUtility();

        do {
            System.out.println("1.Add\n2.View\n3.Exit");
            option = sc.nextInt();
            sc.nextLine();
            switch (option) {
                case 1:
                    participantName = sc.nextLine();
                    departmentName = sc.nextLine();
                    collegeName = sc.nextLine();
                    Participant pObj = new Participant();
                    pObj.setParticipantName(participantName);
                    pObj.setDepartmentName(departmentName);
                    pObj.setCollegeName(collegeName);
                    viewObj.addParticipant(pObj);
                    break;
                case 2:
                    System.out.println("Enter department name");
                    departmentName = sc.nextLine();
                    System.out.println("Enter college name");
                    collegeName = sc.nextLine();

                    Stream<Participant> filteredParticipantStream = viewObj.viewAllParticipants(departmentName, collegeName);
                    filteredParticipantStream.forEach(System.out::println);

                    break;
                case 3:
                    System.out.println("Thank you for using the application");
                    break;
                default:
                    System.out.println("Please choose a correct option");
                    break;
            }
        } while (option != 3);

    }

}
