package Aula006_Classes;

public class Student {

    public static void main(String[] args) {
        Student[] students = new Student[10];
        students[0] = new Student(1, "Pedro André", "Java");
        students[1] = new Student(2, "Jane Bird", "Java");
        students[2] = new Student(3, "José Pereira", "Java");
        students[3] = new Student(4, "Rogério Vides", "Java");
        students[4] = new Student(5, "Sierra Alta", "Java");
        students[5] = new Student(6, "Tiago Vidal", "Python");
        students[6] = new Student(7, "António Brito", "Python");
        students[7] = new Student(8, "Daniel Fernandes", "Python");
        students[8] = new Student(9, "Mariana Camelo", "Python");
        students[9] = new Student(10, "José Serra", "Python");
        for(Student x: students) {
            System.out.println(x.std_name);
        }
    }

    // Attributes
    int std_number;
    String std_name;
    String std_course;

    // Constructors
    public Student(int number, String name, String course) {
        this.std_number = number;
        this.std_name = name;
        this.std_course = course;
    }

    // Methods


    public int getStd_number() {
        return std_number;
    }

    public String getStd_name() {
        return std_name;
    }

    public String getStd_course() {
        return std_course;
    }

    public void setStd_number(int std_number) {
        this.std_number = std_number;
    }

    public void setStd_name(String std_name) {
        this.std_name = std_name;
    }

    public void setStd_course(String std_course) {
        this.std_course = std_course;
    }

    public String toString() {
        String text = "Student nr:\t" + std_number + "\nName:\t\t" + std_name + "\nCourse:\t\t"+ std_course;
        return text;
    }

}
