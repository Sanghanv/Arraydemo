
package arraydemo;

import java.util.Scanner;

public class ArrayDemo {

    public static void main(String[] args) {
        
        System.out.print("Enter Word: ");
        Scanner input = new Scanner(System.in);
        String myWord = input.nextLine();
        
        char[] myLetters = new char[myWord.length()];
        
        for(int i = 0; i < myLetters.length ; i++){
            myLetters[i] = myWord.charAt(i);
            System.out.print(myLetters[i]);
        }
        
        for(int i = myLetters.length - 1; i >= 0; i--){
        
            System.out.print(myLetters[i]);
        }
        
    }
    
}

/*char[] myLetter = new char[9];
        myLetter[0] = 'V';
        myLetter[1] = 'A';
        myLetter[2] = 'I';
        myLetter[3] = 'B';
        myLetter[4] = 'H';
        myLetter[5] = 'A';
        myLetter[6] = 'V';
        
        for(int i = 0; i < myLetter.length - 1 ; i++){
            System.out.println(myLetter[i]);
        }*/