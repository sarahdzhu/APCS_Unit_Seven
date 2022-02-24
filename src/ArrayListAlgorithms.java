import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListAlgorithms {


    public static ArrayList<Integer> fileDuplicates(String file1, String file2) throws FileNotFoundException {

            Scanner input = new Scanner(new File(file1));
            ArrayList<Integer> firstFile = new ArrayList<>();
            while (input.hasNext()) {
                firstFile.add(input.nextInt());
            }

            Scanner input2 = new Scanner(new File(file2));
            ArrayList<Integer> secondFile = new ArrayList<>();
        while (input2.hasNext()) {
            secondFile.add(input2.nextInt());
        }

        int counter = 0;
        ArrayList<Integer> last = new ArrayList<>();
        for (int i=0; i<firstFile.size(); i++) {
            for (int j=0; j<secondFile.size(); j++) {
                if (firstFile.get(i) == secondFile.get(j)) {
                    if (counter == 0) {
                        last.add(firstFile.get(i));
                        counter++;
                    }
                    else if (counter > 0 && firstFile.get(i) != secondFile.get(counter-1)) {
                        last.add(firstFile.get(i));
                        counter++;
                    }
                }
            }
        }
        return last;



        // public static ArrayList<String> removeDuplicates(String filename)throws FileNotFoundException {

    //}



    // public static ArrayList<Integer> orderedList()throws FileNotFoundException {

   // }



}}
