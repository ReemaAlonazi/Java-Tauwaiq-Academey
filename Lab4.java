import java.util.Scanner;

public class Lab4 {
    public static void main(String[] args) {
        int [] grade = {50,60,40,10,38,65,87,56,90,100,66,80,88,40,98};//Exercise 1
        for(int i=0; i< grade.length; i++) {
            if(grade[i]>=90){
                System.out.println(grade[i]+" A");
            }
            else if(grade[i]>=80){
                System.out.println(grade[i]+" B");
            }
            else if(grade[i]>=70){
                System.out.println(grade[i]+" C");
            }
            else if(grade[i]>=60){
                System.out.println(grade[i]+" D");
            }
            else {
                System.out.println(grade[i]+" F");

            }
        }System.out.println();//to print new line



        String [] name = {"Shaza","Mohamed","Asmaa","Anfal","Yousra","Amin","Radwa","Yasmeen"};//Exercise 2
        for(int i=0; i< name.length; i++){
            if(name[i].startsWith("A")){
                System.out.println(name[i]);
            }
        }System.out.println();//to print new line



        int [] numbers ={50,60,40,10,38,65,87,56,90,100,66,80,88,40,98};//Exercise 3
        for(int i=0; i< numbers.length; i++){
            if(numbers[i]>50){
                System.out.println(numbers[i]);
            }
        }System.out.println();//to print new line



        Scanner input = new Scanner(System.in);//Exercise 4
        int[] intNum = {2,13,4,7,80,99,20,11,55,9,99,19,5};
        int check;
        System.out.println("Enter a number: ");
        check=input.nextInt();
        for(int i=0; i< intNum.length; i++){
            if (check==intNum[i]){
                System.out.println("The array contains " +check+" as an element.");
            }

        }
    }
}