import java.util.*;   

public class Person {
	
    // Add instance variables here
    ArrayList<String> phoneNumbers;
    String name;
	
	public Person(String name, ArrayList<String> pnArray) {
        this.name = name;
        phoneNumbers = pnArray;
	}
	
    public String getName() {
        return name;
    }

    public boolean addPhoneNumber(String pn) {
        if (phoneNumbers.contains(pn)){
            return false;
        }
        phoneNumbers.add(pn);
        return true;
    }

    public ArrayList<String> getPhoneNumbers() {
        Collections.sort(phoneNumbers);
        return phoneNumbers;
    }

    public boolean deletePhoneNumber(String pn) {
        if (!phoneNumbers.contains(pn)){
            return false;
        }if (phoneNumbers.size()==1){
            throw new IllegalArgumentException();
        }phoneNumbers.remove(pn);
        return true;
    }
}
