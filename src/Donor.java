import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Donor {

    private String name;
    private double amount;

    public Donor(String n, Double amt){
      this.name=n;
      this.amount=amt;

    }

    public double getAmount() {
        return amount;
    }

    public String getName() {
        return name;
    }



}


