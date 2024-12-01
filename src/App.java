
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        //Prompt the user to input their chosen letter
        System.out.print("Enter a letter: ");
        String s= input.nextLine();
        char ch = s.charAt(0);
 
        //Determine if the entered letter is a vowel
 
        if (Character.isLetter(ch))
            {
            switch(Character.toUpperCase(ch))
            {
             case 'A', 'E', 'I', 'O', 'U' -> System.out.print(ch + " is a vowel.");
             default -> System.out.print(ch + " is a consonant.");
            }
            }
        else
            System.out.print(ch + " is an invalid input.");
    }
}
