import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       
        Scanner inputData = new Scanner(System.in);
        Counter myCount = new Counter(); // Skapar ett objekt av klassen så att vi kan använda den.

        // myCount = namnet på objektet.

        
        

        int keepTrack = 0;

        boolean run = true;
        System.out.println("Welcome to this program");

        do {
            System.out.println("Enter a number");
            keepTrack = inputData.nextInt();

            myCount.setCounter(keepTrack);
            System.out.println("Counter in counter class is " + myCount.getCounter());
            if (myCount.getCounter() > 10) {
                run = false;
            }

         } while (run);

    }
}
