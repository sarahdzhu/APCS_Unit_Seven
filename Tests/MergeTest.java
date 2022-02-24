import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class MergeTest {

    @Test
    public void testMerging() throws IOException {
        Scanner nums = new Scanner(new File("files/mergeNums.txt"));
        ArrayList<Integer> listOne = new ArrayList<>();
        ArrayList<Integer> listTwo = new ArrayList<>();
        ArrayList<Integer> mergeOneTwo = new ArrayList<>();
        ArrayList<Integer> listThree = new ArrayList<>();
        ArrayList<Integer> listFour = new ArrayList<>();
        ArrayList<Integer> mergeThreeFour = new ArrayList<>();
        ArrayList<Integer> listFive = new ArrayList<>();
        ArrayList<Integer> listSix = new ArrayList<>();
        ArrayList<Integer> mergeFiveSix = new ArrayList<>();

        for (int a=0; a<4; a++)
            listOne.add(nums.nextInt());

        for (int b=0; b<4; b++)
            listTwo.add(nums.nextInt());

        for (int c=0; c<8; c++)
            mergeOneTwo.add(nums.nextInt());

        for (int d=0; d<5; d++)
            listThree.add(nums.nextInt());

        for (int e=0; e<5; e++)
            listFour.add(nums.nextInt());

        for (int f=0; f<10; f++)
            mergeThreeFour.add(nums.nextInt());

        for (int g=0; g<6; g++)
            listFive.add(nums.nextInt());

        for (int h=0; h<6; h++)
            listSix.add(nums.nextInt());

        for (int i=0; i<12; i++)
            mergeFiveSix.add(nums.nextInt());

        assertEquals(mergeOneTwo, Merge.mergeLists(listOne, listTwo));
        assertEquals(mergeThreeFour, Merge.mergeLists(listThree, listFour));
        assertEquals(mergeFiveSix, Merge.mergeLists(listFive, listSix));
    }




}