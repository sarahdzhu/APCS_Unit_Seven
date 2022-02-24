import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOError;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

public class ScrabbleHelper {
    private ArrayList<String> wordList = new ArrayList<>();
    public ScrabbleHelper() throws FileNotFoundException {
        Scanner s = new Scanner(new File("files/enable.txt"));

        while (s.hasNext()) {
            wordList.add(s.next());
        }
        s.close();

    }

public boolean foundWord(String s){
        int min = 0;
        int max = wordList.size() - 1;
        while (min <= max)
        {
            int mid = (min + max) / 2;
            if (wordList.get(mid).compareTo(s) == 0)
                return true;
            else if (wordList.get(mid).compareToIgnoreCase(s) > 0)
                max = mid - 1;
            else
                min = mid + 1;
        }
        return false;
    }

    public ArrayList<String> findMatches(String phrase) {
        ArrayList<String> korean = new ArrayList<>();
        for (int i = 0; i < wordList.size() - 1; i++) {
            if (wordList.get(i).indexOf(phrase) >= 0) {
                korean.add(wordList.get(i));

            }

        }

        return korean;
    }

public void sortWords(ArrayList<String> korean){
        for(int i=0; i<korean.size()-1; i++){
            int smallest= i;
            for(int j= i+1; j<korean.size();j++){
                if(korean.get(j).length()< korean.get(smallest).length()){
                    smallest=j;
                }
                String temp=korean.get(i);
                korean.set(i,korean.get(smallest));
                korean.set(smallest, temp);


            }

    }



}

public ArrayList<String> scrabble(String tile){
    ArrayList<String> res = new ArrayList<>();
    for (int i = 0; i < wordList.size(); i++) {
        boolean canMakeWord = true;
        ArrayList<Character> shoe = new ArrayList<>();
        for (int j = 0; j < tile.length() - 1; j++) {
            shoe.add(tile.charAt(j));

        }
        String w= wordList.get(i);
        for (int x = 0; x < w.length(); x++) {
            Character letter = w.charAt(x);
            if (shoe.contains(letter)) {
                shoe.remove(letter);
            }
            else {
                canMakeWord = false;
            }

        }

        if (canMakeWord) {
            res.add(w);
        }

    }

    return res;

}


    public int getScores(String word) {
        int score = 0;
        int[] scores = new int[]{1, 3, 3, 2, 1, 4, 2, 4, 1, 8, 5, 1, 3, 1, 1, 3, 10, 1, 1, 1, 1, 4, 4, 8, 4, 10};
        for (int i = 0; i < word.length(); i++) {
            char letter = word.charAt(i);
            int index = letter - 'a';
            score += scores[index];
        }
        return score;
    }

    public void sortByScores(ArrayList<String> possibleWords) {
        for (int i = 1; i < possibleWords.size(); i++) {
            String temp= possibleWords.get(i);
            int j = i;
           while(j>0 && getScores(temp)>getScores(possibleWords.get(j-1))){
               possibleWords.set(j,possibleWords.get(j-1));
               j--;


           }
           possibleWords.set(j,temp);
        }
    }


    public ArrayList<String> getWordList() {
        return wordList;
    }







        }



