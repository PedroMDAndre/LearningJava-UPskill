package Aula006_Classes;

public class Room {

    public static void main(String[] args) {
        // Define Students
        Student[] students = new Student[10];
        students[0] = new Student(1, "Pedro André", "Java");
        students[1] = new Student(2, "Jane Bird", "Java");
        students[2] = new Student(3, "José Pereira", "Java");
        students[3] = new Student(4, "Rogério Vides", "Java");
        students[4] = new Student(5, "Sierra Alta", "Python");
        students[5] = new Student(6, "Tiago Vidal", "Python");
        students[6] = new Student(7, "António Brito", "Python");
        students[7] = new Student(8, "Daniel Fernandes", "Python");
        students[8] = new Student(9, "Mariana Camelo", "C#");
        students[9] = new Student(10, "José Serra", "C#");


        // Create Rooms
        Room roomA = new Room(1, "A", 4);
        Room roomB = new Room(2, "A", 4);
        Room roomC = new Room(3, "B", 3);

        // Add students to rooms
        // room A
        System.out.println("Room nr. " + roomA.getRoom_nr());
        System.out.println(roomA.toString());
        System.out.println("--------------------------------");
        roomA.addStudent(students[0]);
        roomA.addStudent(students[0]);
        roomA.addStudent(students[2]);
        roomA.addStudent(students[1]);
        roomA.addStudent(students[3]);
        roomA.addStudent(students[4]);
        System.out.println("--------------------------------");
        roomA.listStudents(students);
        System.out.println("Room capacity: " + roomA.getCapacity());
        System.out.println("Room capacity available: " + roomA.getRemainCapacity());
        System.out.println("Is the room full? " + roomA.isFull());
        System.out.println("--------------------------------");

        // room B
        System.out.println();
        System.out.println("Room nr. " + roomB.getRoom_nr());
        System.out.println(roomB.toString());
        System.out.println("--------------------------------");
        roomB.addStudent(students[4]);
        roomB.addStudent(students[5]);
        roomB.addStudent(students[2]);
        roomB.addStudent(students[6]);
        roomB.removeStudent(students[2]);
        roomB.addStudent(students[7]);
        System.out.println("--------------------------------");
        roomB.listStudents(students);
        System.out.println("Room capacity: " + roomB.getCapacity());
        System.out.println("Room capacity available: " + roomB.getRemainCapacity());
        System.out.println("Is the room full? " + roomB.isFull());
        System.out.println("--------------------------------");

        // room C
        System.out.println();
        System.out.println("Room nr. " + roomC.getRoom_nr());
        System.out.println(roomC.toString());
        System.out.println("--------------------------------");
        roomC.addStudent(students[8]);
        roomC.addStudent(students[9]);
        System.out.println("--------------------------------");
        roomC.listStudents(students);
        System.out.println("Room capacity: " + roomC.getCapacity());
        System.out.println("Room capacity available: " + roomC.getRemainCapacity());
        System.out.println("Is the room full? " + roomC.isFull());
        System.out.println("--------------------------------");

    }

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
                System.out.println("Nr. " + x.std_number + " | " + x.getStd_name());
            }
        }
    }

    public String toString() {
        String text = "Room nr. " + room_nr + " from Block " + block + ", with a capacity for " +
                students.length + " students";
        return text;
    }
}
