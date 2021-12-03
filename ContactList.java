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
        ArrayList<String> namesSorted = new ArrayList<String>();
        for (int i = 0;i<contacts.size();i++){
            namesSorted.add(contacts.get(i).getName());
        }
        return null;
    }

    public String[] fetchAllPhoneNumbers() {
        return null;
    }
}
