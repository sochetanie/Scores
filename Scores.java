import java.util.*;

public class Scores {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfScores = 5;

        int arrayOfNames[] = new int[numberOfScores];
        System.out.println("Enter 5 Scores.");

        for(int i=0; i<arrayOfNames.length; i++){
            System.out.println("Enter a score " + (i+1) + ":");
            arrayOfNames[i] = sc.nextInt();

        }

        int largest = arrayOfNames[0];

        for(int i=1; i<arrayOfNames.length; i++){
            if(arrayOfNames[i] > largest)
                largest = arrayOfNames[i];
        }

        System.out.println("The Highest Score is: " + largest);
        System.out.println("The scores are:");

        for(int i=0; i<arrayOfNames.length; i++){
            System.out.println(arrayOfNames[i] + " Differs from the max by " + (largest - arrayOfNames[i]));
        }
    }
}