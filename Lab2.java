import java.util.Scanner;

public class Lab2 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);//exercise 1
        System.out.println("Enter a number: ");
        int num = read.nextInt();
        if(num>0){
            System.out.println(num+" is a positive number.");
        }
        else if (num<0){
            System.out.println(num+" is a negative number.");
        }
        else {
            System.out.println(num+" is equal to zero.");
        }
        System.out.println();



        System.out.println("Enter a word: ");//exercise 2
        String stringWord = read.next();
        System.out.println("Enter a character: ");
        String letter = read.next();
        System.out.println("Is the word "+stringWord+" contains "+letter+" ? "+stringWord.contains(letter)+".");
        System.out.println();



        System.out.println("Enter a word");//exercise 3
        String word = read.next();
        System.out.println("Enter a number");
        int intNum = read.nextInt();
        System.out.println("The character in the index "+intNum+" is: "+word.charAt(intNum)+".");
        System.out.println();



        System.out.println("What is the largest number ?");//exercise 4
        System.out.println("---------------------------");
        System.out.println("Enter the first number: ");
        int num1 = read.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = read.nextInt();
        System.out.println("Enter the third number: ");
        int num3 = read.nextInt();
        if (num1>num2 && num1>num3){
            System.out.println(num1+" is the largest number.");
        }
        else if (num2>num1 && num2>num3){
            System.out.println(num2+" is the largest number.");

        }
        else {
            System.out.println(num3+" is the largest number.");

        }










    }
}