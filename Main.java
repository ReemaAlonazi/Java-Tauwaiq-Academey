import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try{ //exercise 1
        int [] numbers = {2,4,6,8,10,12};
        System.out.println(numbers[9]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Error: Array index out of bound");
        }
        System.out.println();//to print new line




        input();//invoke method of exercise 2
    }
    public static void input(){//exercise 2
        try {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num= sc.nextInt();
        if (num==1 || num==2 || num==3){
            throw new InputMismatchException("valid input");
        }

        }
        catch (InputMismatchException e){
            System.out.println(e.getMessage());


        }
    }
}