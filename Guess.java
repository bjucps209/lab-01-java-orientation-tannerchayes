import java.util.*;

public class Guess {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);

        int secretNum = rand.nextInt(10) + 1;
        int numGuesses = 0;
        int guess = 0;

        while (guess != secretNum) {
            System.out.println("Enter your guess: ");
            guess = scan.nextInt();
            numGuesses++;

            if (guess < secretNum) {
                System.out.println("Your guess is too low.");
            } else if (guess > secretNum) {
                System.out.println("Your guess is too high.");
            }else {
                System.out.println("You got it!!");
            }
        }

        System.out.println("It took you " + numGuesses + " guesses.");
    }
}



// import random

// # generate secret number
// secretNum = random.randrange(1, 11)

// numGuesses = 0
// guess = 0
// while guess != secretNum:

//     guess = int(input("Enter your guess: "))
//     numGuesses += 1
    
//     # Give feedback on guess
//     if guess < secretNum:
//         print("Your guess is too low.")
//     elif guess > secretNum:
//         print("Your guess is too high.")
//     else:
//         print("You got it!!")

// print("It took you", numGuesses, "guesses.")  