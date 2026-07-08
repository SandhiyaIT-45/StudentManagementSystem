import java.util.ArrayList;
public class StudentService {

    private ArrayList<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        System.out.println(searchStudent(student.getId()));
        if(searchStudent(student.getId())!=null){
                System.out.println("Student ID already exists!");
                return;
        }
        students.add(student);
        System.out.println("Student added successfully.");
    }
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

    public Student searchStudent(int id) {

        for (Student student : students) {
            if (student.getId() == id) {
                return student;
            }
        }

        return null;
    }

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