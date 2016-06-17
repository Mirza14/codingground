
import java.util.Scanner;
public class HelloWorld{

    // creating a class
    public static void main(String args[]) { //main func
        int a;
        Scanner in = new Scanner(System.in); //scanner class
        System.out.println("Enter the integer please?");
        a = in.nextInt(); //takes variables' integer value
        if (a % 2 == 0) {
            System.out.println("The number is even");
        } else {
            System.out.println("The numner is odd");
        }
    } }
