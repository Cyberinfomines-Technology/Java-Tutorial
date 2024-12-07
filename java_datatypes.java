import java.util.Scanner;

public class java_datatypes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Primitive Data Type
        System.out.println("Enter Student Id::");
        int StudentId = scanner.nextInt();

        System.out.println("Enter Student Age :: ");
        byte age = scanner.nextByte();

        System.out.println("Enter GPA :: ");
        double GPA = scanner.nextDouble();

        System.out.println("Enter Grade :: ");
        char grade = scanner.next().charAt(0);

        System.out.println("Is student active ? ");
        boolean isActive = scanner.nextBoolean();

        //Display PRIMITIVE DATA TYPES

        System.out.println("\nPrimitive data types");
        System.out.println("Student Id : " + StudentId);
        System.out.println("Age :"+age);
        System.out.println("GPA :"+GPA);
        System.out.println("Grade :"+ grade);
        System.out.println("Is Active ? "+ isActive);

        scanner.close();
    }
}
