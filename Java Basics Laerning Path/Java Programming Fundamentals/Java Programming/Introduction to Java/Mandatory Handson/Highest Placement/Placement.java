import java.util.*;

public class Placement {
    private static class Department implements Comparable<Department> {
        private final String name;
        private final int placements;

        public Department(String name, int placements) {
            this.name = name;
            this.placements = placements;
        }

        public int getPlacements() {
            return placements;
        }


        @Override
        public int compareTo(Department other) {
            return Comparator.comparingInt(Department::getPlacements)
                    .compare(this, other);
        }

        @Override
        public String toString() {
            return name;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the no of students placed in CSE:");
        int cs = scanner.nextInt();
        System.out.println("Enter the no of students placed in ECE:");
        int ec = scanner.nextInt();
        System.out.println("Enter the no of students placed in MECH:");
        int me = scanner.nextInt();

        if (cs < 0 || ec < 0 || me < 0) {
            System.out.println("Input is Invalid");
        } else {
            Department cse = new Department("CSE", cs);
            Department ece = new Department("ECE", ec);
            Department mech = new Department("MECH", me);

            ArrayList<Department> departmentArrayList = new ArrayList<>(Arrays.asList(cse, ece, mech));
            TreeSet<Department> departmentSet = new TreeSet<Department>(Comparator.reverseOrder()) {
                {
                    add(cse);
                    add(ece);
                    add(mech);
                }
            };

            if (departmentSet.size() == 1) {
                System.out.println("None of the department has got the highest placement");
            } else {
                System.out.println("Highest placement");
                departmentArrayList.stream()
                        .filter(department -> department.placements == departmentSet.first().placements)
                        .forEach(System.out::println);
            }
        }
    }
}