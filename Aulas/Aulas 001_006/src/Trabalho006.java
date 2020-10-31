import Trabalho006_Classes.*;

public class Trabalho006 {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
        exercise4();
        exercise5();

    }

    public static void exercise1() {
        System.out.println("---------------------");
        System.out.println("Exercise 1 - Students");
        System.out.println("---------------------");

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

        System.out.println("Students List:");
        for(Student x: students) {
            System.out.println(x.getStd_name());
        }
        System.out.println();


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

    public static void exercise2() {
        System.out.println("---------------------");
        System.out.println("Exercise 2 - Playlist");
        System.out.println("---------------------");

        // List of musics
        Music[] music = new Music[3];
        music[0] = new Music("A", 3);
        music[1] = new Music("B", 2);
        music[2] = new Music("C", 2);

        // Create playlist
        Playlist queen = new Playlist(music);
        Music aa = new Music("Aa", 1);
        queen.addMusic(aa);
        queen.removeMusic(music[1]);

        // Show Playlist details
        queen.showPlaylist();
        System.out.println("Total duration: " + queen.totalDuration() + " min");
    }

    public static void exercise3() {
        System.out.println("-----------------------");
        System.out.println("Exercise 3 - Calculator");
        System.out.println("-----------------------");
        // Create a Calculator
        Calculator c1 = new Calculator();

        // Make operations
        System.out.println(c1.add(1,2));
        System.out.println(c1.multiply(2,2));
        System.out.println(c1.division(1,2));
        System.out.println(c1.divRemainder(1,2));
        System.out.println(c1.divRemainder(4,0));
        System.out.println(c1.division(1,0));
        System.out.println(c1.add(3,-1));
        System.out.println(c1.pow(3,-1));
        System.out.println(c1.subtract(3,2));
        System.out.println(c1.quadraticFormula(3,6, 2)[0] + " " + c1.quadraticFormula(3,6, 2)[1]);
        System.out.println(c1.quadraticFormula(3,3, 2)[0] + " " + c1.quadraticFormula(3,3, 2)[1]);
        System.out.println();

        // Get History
        System.out.println("All historic operations:");
        c1.printHistoric();

        System.out.println();
        int n = 5;
        System.out.println("Last " + n + " operations:");
        c1.printHistoric(n);
    }

    public static void exercise4() {
        System.out.println("----------------------------");
        System.out.println("Exercise 4 - Cars Simulation");
        System.out.println("----------------------------");

        // Create Persons
        Person personA = new Person("John", "Paul", 28);
        Person personB = new Person("Cardi", "Hel", 35);

        // Create Cars
        Car audi1 = new Car("Audi", "A3", 8.2, 45);
        Car audi2 = new Car("Audi", "A4", 8.5, 47);

        // Register the cars
        audi1.carRegistrarion(personA, "AA-01-45", 5, 2020, 10);
        audi2.carRegistrarion(personB, "23-VV-21", 5, 2019, 1);
        System.out.println(audi1);
        System.out.println(audi2);

        // Travel with car audi1
        audi1.turnOn();
        audi1.run(100);
        System.out.println("Tank level: " + audi1.getTankLevel());
        audi1.fillTank();
        audi1.run(100);
        System.out.println("Stop for a break.");
        System.out.println("Tank level: " + audi1.getTankLevel());
        audi1.turnOff();
        audi1.run(1000);
        System.out.println("The car made a total of " + (int) audi1.getTotalKm() + " km.");
        System.out.println(audi1.toString());
        System.out.println();
    }

    public static void exercise5() {
        System.out.println("------------------------");
        System.out.println("Exercise 5 - Credit Card");
        System.out.println("------------------------");

        // Create a credit card
        Person person1 = new Person("Jane", "Cat", 34);
        CreditCard card1 = new CreditCard(person1, 123456789123L, 12, 2020, 2000);
        System.out.println("Credit card created!");
        // Credit card details
        System.out.println("\n" + card1.toString());

        // Lets go shopping!
        System.out.println("\nOperations:");
        card1.gastar(100, "Clothes");
        System.out.println(card1.obterTalao());
        card1.gastar(10000, "Car");
        System.out.println(card1.obterTalao());
        card1.gastar(30, "Books");
        System.out.println(card1.obterTalao());
        card1.pagarCredito(1000);
        System.out.println(card1.obterTalao());


        System.out.println("\nCheck balance:");
        System.out.println(card1.saldo());
        System.out.println("\nCheck card history:");
        System.out.println(card1.getMovimentos());

        // Credit card details
        System.out.println("\n" + card1.toString());
    }
}
