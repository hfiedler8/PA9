import java.util.*;   

public class ContactList {
	
	// Add instance variables here
    private ArrayList<Person> contacts = new ArrayList<>();
	
    public boolean createContact(Person person) {
        for (int i = 0; i<contacts.size();i++){
            if (contacts.get(i).getName()== person.getName()){
                return false;
            }
        }contacts.add(person);
        return true;
    }

    public boolean lookupContact(String name) {
        for (int i = 0;i<contacts.size();i++){
            if (contacts.get(i).getName()==name){
                return true;
            }
        }
        return false;
    }

    public Person getContact(String name) {
        for (int i = 0;i<contacts.size();i++){
            if (contacts.get(i).getName()==name){
                return contacts.get(i);
            }
        }
        return null;
    }

    public Person[] getContactByRange(String start, String end) {
        return null;
    }

    public boolean deleteContact(String name) {
        for (int i = 0;i<contacts.size();i++){
            if (contacts.get(i).getName()==name){
                contacts.remove(contacts.get(i));
                return true;
            }
        }
        return false;
    }

    public int size() {
        return contacts.size();
    }

    public String[] fetchAllNames() {
        String[] namesSorted = new String[contacts.size()];
        for (int i = 0;i<contacts.size();i++){
            namesSorted[i]=contacts.get(i).getName();
        }
        Arrays.sort(namesSorted);
        return namesSorted;
    }

    public String[] fetchAllPhoneNumbers() {
        ArrayList<String> numbersSorted = new ArrayList<String>();

        for (int i = 0; i<contacts.size();i++){
            for (String num : contacts.get(i).getPhoneNumbers()){
                    numbersSorted.add(num);

            }
        }
        Collections.sort(numbersSorted);
        String[] numsSorted = new String[numbersSorted.size()];
        Set<String> set = new HashSet<>(numbersSorted);
        numsSorted = set.toArray(numsSorted);
        return numsSorted;
    }
}
