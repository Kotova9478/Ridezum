package helper;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Random;

public class UserMassives {
    private ArrayList<String> firstName;
    private ArrayList<String> lastName;

    public UserMassives(){
        firstName = new ArrayList<String>();

        firstName.add("Vanya");
        firstName.add("Jekki");
        firstName.add("Slon");
        firstName.add("Debora");
        firstName.add("Nina");
    }

   // public ArrayList<String> getFirstName() {
      //  return firstName;
   // }
    public String randomFirstName(){
        int size = firstName.size() - 1;
        Random random = new Random();
        int index = random.nextInt(size);
        firstName.get(index);
        String name = firstName.get(index);
        return name;
    }
}
