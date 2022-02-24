import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class ArrayListAlgorithms_Tests {


    @Test
    public void fileDuplicatesTest() throws FileNotFoundException{
        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(5);
        expected.add(9);
        expected.add(22);
        expected.add(-4);
        expected.add(3);
        ArrayList<Integer> actual = ArrayListAlgorithms.fileDuplicates("files/set1.txt", "files/set2.txt");
        assertEquals(expected, actual);
    }

    @Test
    public void fileDuplicatesTestTwo() throws FileNotFoundException {
     ArrayList<Integer> expected = new ArrayList<>();
     expected.add(2);
     expected.add(3);
     expected.add(5);
     expected.add(9);
     ArrayList<Integer> actual = ArrayListAlgorithms.fileDuplicates("files/set3.txt", "files/set4.txt");
     assertEquals(expected, actual);
    }






/*
    @Test
    public void removeDuplicatesTest() throws FileNotFoundException {
        Scanner inputFileOne = new Scanner(new File("files/names2.txt"));
        ArrayList<String> expected = new ArrayList<>();
        while (inputFileOne.hasNext()) {
            expected.add(inputFileOne.nextLine());
        }
        ArrayList<String> actual = ArrayListAlgorithms.removeDuplicates("files/names.txt");
        assertEquals(expected, actual);
    }

 */


/*
    @Test
    public void orderedListTest() throws FileNotFoundException {
     Scanner inputFileOne = new Scanner(new File("files/ordered_set.txt"));
     ArrayList<Integer> expected = new ArrayList<>();
     while (inputFileOne.hasNext()) {
      expected.add(inputFileOne.nextInt());
     }
     ArrayList<Integer> actual = ArrayListAlgorithms.orderedList();
     assertEquals(expected, actual);
    }

 */




 }
