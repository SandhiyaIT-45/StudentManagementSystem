import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StudentService service = new StudentService();

        int choice;

        do {
            System.out.println("\n===== STUDENT MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    if (service.searchStudent(id)!=null){
                        System.out.println("Student ID already exists!");
                        break;
                    }

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Age: ");
                    int age = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Department: ");
                    String department = sc.nextLine();

                    System.out.print("Enter Marks: ");
                    double marks = sc.nextDouble();

                    Student student = new Student(id, name, age, department, marks);
                    service.addStudent(student);
                    break;

                case 2:
                    service.viewStudents();
                    break;

                case 3:
                    System.out.print("Enter Student ID: ");
                    int searchId = sc.nextInt();

                    Student s = service.searchStudent(searchId);

                    if (s != null) {
                        s.displayStudent();
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter Student ID to Update: ");
                    int updateId = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter New Name: ");
                    String newName = sc.nextLine();

                    System.out.print("Enter New Age: ");
                    int newAge = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter New Department: ");
                    String newDepartment = sc.nextLine();

                    System.out.print("Enter New Marks: ");
                    double newMarks = sc.nextDouble();

                    service.updateStudent(updateId, newName, newAge, newDepartment, newMarks);
                    break;

                case 5:
                    System.out.print("Enter Student ID to Delete: ");
                    int deleteId = sc.nextInt();

                    service.deleteStudent(deleteId);
                    break;

                case 6:
                    System.out.println("Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 6);

        sc.close();
    }
}
