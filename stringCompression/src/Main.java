import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        stringCompression compString = new stringCompression();

        String word = inp.nextLine();
        compString.printCompString(word);
    }
}

class stringCompression {
    void printCompString(String inpWord){
        String compWord = "";
        boolean isSame = false;
        int count = 1;

        for (int i = 0; i < inpWord.length(); i++){
            final char letter = inpWord.charAt(i);

            if(i < inpWord.length() - 1){
                final char nextLetter = inpWord.charAt(i+1);
                if(letter == nextLetter){
                    count++;
                    isSame = true;
                }
                else if(isSame){
                    compWord += String.valueOf(letter) + count;
                    count = 1;
                    isSame = false;
                }
                else{
                    compWord += String.valueOf(letter) + count;
                }
            }
            else{
                compWord += String.valueOf(letter) + count;
            }

        }
        System.out.println(compWord);
    }
}
