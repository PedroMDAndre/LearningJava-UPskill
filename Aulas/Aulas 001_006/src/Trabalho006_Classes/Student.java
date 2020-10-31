package Trabalho006_Classes;

public class Student {
    // Attributes
    private int std_number;
    private String std_name;
    private String std_course;


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

    @Override
    public String toString() {
        String text = "Student nr:\t" + std_number + "\nName:\t\t" + std_name + "\nCourse:\t\t"+ std_course;
        return text;
    }

}
