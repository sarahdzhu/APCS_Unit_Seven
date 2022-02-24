import java.sql.Array;
import java.util.ArrayList;

public class Merge {


    public static ArrayList<Integer> mergeLists(ArrayList<Integer> listOne, ArrayList<Integer> listTwo) {
        ArrayList<Integer> comboList = new ArrayList();
        while (listOne.size() != 0 && listTwo.size() != 0) {

            if (listOne.get(0) < listTwo.get(0)) {
                comboList.add(listOne.get(0));
                listOne.remove(0);
            }
            else {
                comboList.add(listTwo.get(0));
                listTwo.remove(0);
            }
        }
        while (listOne.size() != 0) {
            comboList.add(listOne.get(0));
            listOne.remove(0);
        }
        while (listTwo.size() != 0) {
            comboList.add(listTwo.get(0));
            listTwo.remove(0);
        }
        return comboList;

    }}
