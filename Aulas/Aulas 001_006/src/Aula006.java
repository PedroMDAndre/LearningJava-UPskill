import Aula006_Classes.*;

public class Aula006 {

        public static void main(String[] args){
            // Test class Person
            testPersonClass();

            // Test class Rectangle
            testRectangleClass();
         }

        public static void testPersonClass(){
            // Test class Person
            Person primeira = new Person("Maria", "Silva", 20);
            primeira.setNationality("Portuguesa");

            Person segunda = new Person("João", "Santos", 30);
            segunda.setAddress("Benfica");

            System.out.println("Person Nationality: " + primeira.getNationality());
            System.out.println("Person Address:     " + primeira.getAddress());
            System.out.println("Person Nationality: " + segunda.getNationality());
            System.out.println("Person Address:     " +segunda.getAddress());

            System.out.println(primeira);
            System.out.println();
        }

        public static void testRectangleClass() {
            Rectangle a = new Rectangle(2,3);
            Rectangle b = new Rectangle(3);
            System.out.println("Area of rectangle a:     " + a.getArea());
            System.out.println("Is rectangle b a square? " + b.isSquare());
            System.out.println("Diagonal of rectangle b: " + b.getDiagonal());
        }

}
