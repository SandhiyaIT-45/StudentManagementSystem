import java.util.ArrayList;

public class StudentService {

    private ArrayList<Student> students = new ArrayList<>();

    // Add Student
    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Student added successfully.");
    }

    // View All Students
    public void viewStudents() {

        if (students.isEmpty()) {
            System.out.println("No student records found.");
            return;
        }

        System.out.println("\n----- Student List -----");

        for (Student student : students) {
            student.displayStudent();
        }
    }

    // Search Student by ID
    public Student searchStudent(int id) {

        for (Student student : students) {
            if (student.getId() == id) {
                return student;
            }
        }

        return null;
    }

    // Update Student
    public void updateStudent(int id, String name,
                              int age,
                              String department,
                              double marks) {

        Student student = searchStudent(id);

        if (student != null) {

            student.setName(name);
            student.setAge(age);
            student.setDepartment(department);
            student.setMarks(marks);

            System.out.println("Student updated successfully.");

        } else {

            System.out.println("Student not found.");

        }
    }

    // Delete Student
    public void deleteStudent(int id) {

        Student student = searchStudent(id);

        if (student != null) {

            students.remove(student);
            System.out.println("Student deleted successfully.");

        } else {

            System.out.println("Student not found.");

        }
    }
}