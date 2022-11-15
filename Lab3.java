public class Lab3{
    public static void main(String[] args) {

        for(int i=1; i<100;i++){ // Exercise 1
            if(i%2==0){
                continue;}
            System.out.println(i);
        } System.out.println();//to print new line


        for(int i=1; i<=10;i++){// Exercise 2
            if(i==4){
                continue;}
            System.out.println(i);
        }System.out.println();//to print new line


        for(int i=1; i<=100;i++){// Exercise 3
            if(i%2==0){
                System.out.println("الرقم زوجي "+i);
            }
            else {
                System.out.println(i);
            }
        }System.out.println();//to print new line



        String stringName = "Reema";// Exercise 4
        int length= stringName.length();
        for (int i=0; i<length;i++){
            System.out.println(stringName.charAt(i));
        }System.out.println();//to print new line



        String name = "Reema";// Exercise 4
        int intLength = name.length()-1;
        for (int i=intLength; i>=0;i--){

            System.out.println(name.charAt(i));
        }
    }

}