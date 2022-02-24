//import jdk.internal.icu.text.UnicodeSet;

import java.util.ArrayList;
import java.util.Scanner;


public class ArrayListMethods {



    public static ArrayList<Integer> numberList() {

        ArrayList<Integer> numList= new ArrayList<>();
        numList.add(0);
        numList.add(-5);
        numList.add(7);
        numList.add(12);
        numList.add(-1);
        numList.add(2,10);
        numList.set(1,9);
        numList.remove(4);




return numList;

    }



    public static ArrayList<Double> firstAndLast() {

        ArrayList<Double> num =new ArrayList<>();
        Scanner scan= new Scanner(System.in);
        while(true) {
            double next = scan.nextDouble();
            num.add(next);
            if (next == 0) {
                break;
            }

            ArrayList<Double> sarah = new ArrayList<>();
            sarah.add((double) num.size());
            sarah.add(num.get(0));
            sarah.add(num.get(num.size() - 1));


            return sarah;
        }

        return num;
    }




    public static boolean double23(ArrayList<Integer> nums) {
    ArrayList<Integer> boo= new ArrayList<>();









    //public static boolean commonEnd(ArrayList<Integer> a, ArrayList<Integer> b) {


    return true;


    }


}
