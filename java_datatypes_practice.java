public class java_datatypes_practice {
    public static void main(String[] args) {
        
        //Q1 Write code to declare and initialize an array of student’s grade.

        int[] marks = {12,90,60,55,20,33,42};
        System.out.println(marks[0]);
        
        //Q2 How would you cast a String representation of a number to an integer?

        String str = "10";
        int x = Integer.parseInt(str);
        System.out.println(x);

        //Q3 Write a program to print the size, maximum and minimum value of primitive data type.

        System.out.println("Size of Byte " + Byte.SIZE + "Minimum value of Byte is "+ Byte.MIN_VALUE + "Maximum vakue of Byte is " + Byte.MAX_VALUE );
        System.out.println("Size of Integer " + Integer.SIZE + "Minimum value of Integer is "+ Integer.MIN_VALUE + "Maximum vakue of Integer is " + Integer.MAX_VALUE );
       
        //Q4 Write a program to update the value of a variable.

       int v = 20;
       System.out.println("Before " + v);
       v = 21;
       System.out.println("After " + v);
    }
}
