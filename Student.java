public class Student {
    // Instance Variables
    private int id;
    private String name;
    private int age;
    private String department;
    private double marks;
    private char grade;
    // Default Constructor
    public Student() {
    }
    // Parameterized Constructor
    public Student(int id, String name, int age,
                   String department, double marks) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.department = department;
        this.marks = marks;
        calculateGrade();
    }
    // Calculate Grade
    private void calculateGrade() {

        if (marks >= 90)
            grade = 'A';

        else if (marks >= 80)
            grade = 'B';

        else if (marks >= 70)
            grade = 'C';

        else if (marks >= 60)
            grade = 'D';

        else
            grade = 'F';
    }
    // Getters
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getDepartment() {
        return department;
    }
    public double getMarks() {
        return marks;
    }
    public char getGrade() {
        return grade;
    }
    // Setters
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public void setMarks(double marks) {
        this.marks = marks;
        calculateGrade();
    }
    // Display Student Details
    public void displayStudent() {
        System.out.println("--------------------------------");
        System.out.println("ID         : " + id);
        System.out.println("Name       : " + name);
        System.out.println("Age        : " + age);
        System.out.println("Department : " + department);
        System.out.println("Marks      : " + marks);
        System.out.println("Grade      : " + grade);
        System.out.println("--------------------------------");
    }
}