import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

public class ScrabbleDriver {
public static void main(String[] args) throws FileNotFoundException {
    ScrabbleHelper sangseob= new ScrabbleHelper();



    System.out.println(sangseob.getWordList().get(66349));

    Scanner scan= new Scanner(System.in);
    System.out.println("Enter a word to test: ");
    String s =scan.nextLine();
sangseob.foundWord(s);
    if(sangseob.foundWord(s)==true){
        System.out.println(s +" is a word!");

    }else{
        System.out.println(s +" is not a word! ");
    }
    ArrayList<String> stevie= sangseob.findMatches("sang");

    System.out.println(stevie);


    sangseob.sortWords(stevie);
    System.out.println(stevie);

    sangseob.scrabble("random");
    ArrayList<String> stat =sangseob.scrabble("random");
    System.out.println(stat);
sangseob.sortWords(stat);
sangseob.sortByScores(stat);
   System.out.println(stat);


    }



}





