import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int guess = 0;
        int val = rand.nextInt(10) + 1;

        System.out.println("Enter your guess(1-10): ");
        if(sc.hasNextInt()){
            guess = sc.nextInt();
            if(guess > 10 || guess < 1){
                System.out.println("Your guess is not within the bounds.");
                System.exit(0);
            }
        }else{
            System.out.println("Invalid Input. Please re-run the program and enter a valid input");
            System.exit(0);
        }

        System.out.print("The random number was " + val + ". Your guess was ");
        if(guess == val){
            System.out.println("ON THE MONEY! :D");
        }else if(guess > val){
            System.out.println("Too High :(");
        }else{
            System.out.println("Too Low :(");
        }
    }
}