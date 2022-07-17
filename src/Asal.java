import java.util.Scanner;
public class Asal {
    public static void main(String[] args) {
        int number,counter=0;
        Scanner input = new Scanner(System.in);

        System.out.println("Please give a number: ");
        number= input.nextInt();
        if (number<100 && number>0){
            for (int i = 2; i < number; i++){
                if (number % i ==0) {
                    counter++;

                }
            }if (counter == 0){
                System.out.println("Bu bir asal sayıdır.");
            }else {
                System.out.println("Bu bir asal sayı değildir.");
            }

}}}

