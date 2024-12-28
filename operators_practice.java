public class operators_practice {
    public static void main(String[] args) {
        //Q1 : What's the output?
        int i = 1;
        i = i++ + ++i;
        System.out.println(i);
        // o/p = 4

        //Q2
        int x = 3;
        x += x -= x *= x;
        System.out.println(x);
        // op = -3

        //Q3
        System.out.println(10 + 20 + "Java");
        System.out.println("Java" + 10 + 20);

        //Q4 write code to check if a number is a power of 2 using bitwise operators.
        
        int n = 3;
        boolean isPowerofTwo = n > 0 && (n & (n-1)) == 0;
        System.out.println(isPowerofTwo);

    }
}
