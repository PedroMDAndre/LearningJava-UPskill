package Trabalho006_Classes;

public class Room {
    // Attributes
    private int capacity;
    private String block;
    private int room_nr;
    private Student[] students;


    // Constructors
    public Room(int room_nr, String block, int capacity) {
        this.room_nr = room_nr;
        this.block = block;
        this.capacity = capacity;
        this.students = new Student[capacity];
    }


    // Methods
    public int getRoom_nr() {
        return room_nr;
    }

    public String getBlock() {
        return block;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getRemainCapacity() {
        int remainCapacity = 0;
        for (Student x : students) {
            if (x == null) {
                remainCapacity += 1;
            }
        }
        return remainCapacity;
    }

    public boolean isFull() {
        return (getRemainCapacity() == 0);
    }

    public boolean isStudentinRoom(Student student) {
        for (Student x : this.students) {
            if (x == student) {
                return true;
            }
        }
        return false;
    }

    public int emptyPosition() {  // <----------------------------
        for (int i = 0; i < students.length; i++) {
            if (this.students[i] == null) {
                return i;
            }
        }
        return -1; // (?) Could this be implemented in a different way?


    }

    public Student[] getStudents() {
        return students;
    }

    public void addStudent(Student student) {
        if (this.isFull()) {
            System.out.println("Room nr. " + this.getRoom_nr() + " is full!");
        } else if (isStudentinRoom(student)) {
            System.out.println("Student already in the room.");
        } else {
            students[emptyPosition()] = student;
        }
    }

    public void removeStudent(Student student) {
        if (!isStudentinRoom(student)) {
            System.out.println("Student cannot be removed. It wasn't in the room.");
        } else {
            for (int i = 0; i < students.length; i++) {
                if (students[i] == student) {
                    students[i] = null;
                }
            }
        }
    }


    public boolean removeStudent(int student_nr) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null && students[i].getStd_number() == student_nr) {
                students[i] = null;
                return true;
            }
        }
        return false;
    }

    public void listStudents(Student[] students) {
        System.out.println("List of students for room nr. " + this.room_nr);
        for (Student x : this.students) {
            if (x != null) {
                System.out.println("Nr. " + x.getStd_number() + " | " + x.getStd_name());
            }
        }
    }

    public String toString() {
        String text = "Room nr. " + room_nr + " from Block " + block + ", with a capacity for " +
                students.length + " students";
        return text;
    }
}
