import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class DonorRunner {

    public static ArrayList<Donor> donorList;

    public static void main(String[] args) throws IOException {
        donorList = new ArrayList<>();
        getDonorList("files/donors.txt");
        sortDonorList();
        System.out.println(donorList.get(0).getName()); // Should print out Hernandez
        System.out.println(donorList.get(donorList.size()-1).getName()); // Should print out Hall
        System.out.println(getDonatedAmount("Anderson")); // should print 1436.5
        System.out.println(getDonatedAmount("Roberts")); // should print 307.86
        System.out.println(getDonatedAmount("Wilkinson")); // should print 0.0

    }

    public static void getDonorList(String filename) throws IOException {
            Scanner input = new Scanner(new File(filename));

            while (input.hasNext()) {
                String name= input.next();
                Double amount= input.nextDouble();

                Donor nextDonor= new Donor(name, amount);

                donorList.add(nextDonor);

            }

            // Your code should go below here, and above the return statement.
        }

    public static void sortDonorList() {


        for(int i=0; i<donorList.size()-1; i++ ){
            int largest= i;
           for(int j=i+1; j<donorList.size();j++){
               if(donorList.get(j).getAmount()>donorList.get(largest).getAmount()){
                   largest=j;
               }
               Donor temp=donorList.get(i);
               donorList.set(i,donorList.get(largest));
               donorList.set(largest,temp);
           }
        }

    }

    public static double getDonatedAmount(String name) {
            int min = 0;
            int max = donorList.size() - 1;
            while (min <= max)
            {
                int mid = (min + max) / 2;
                if (donorList.get(mid).getName().compareTo(name) == 0)
                    return 0.0;
                else if (donorList.get(mid).getName().compareToIgnoreCase(name) > 0)
                    max = mid - 1;
                else
                    min = mid + 1;
            }


        return 0.0; // this is returned if the name is not found
    }
}
