import java.util.ArrayList;
import java.util.Scanner;

public class MobilePhone {

    private Scanner scanner = new Scanner(System.in);
    private ArrayList<Contact> contactList = new ArrayList<>();



    public void addContact(Contact contact){
        contactList.add(contact);

    }

    public void modifyContact(String currentContact, String newContact){
        int position = findItem()

    }

    public void removeGroceryItem(int position) {
        contactList.remove(position);
    }

    public int findItem(String searchItem) {
        return contactList.indexOf(searchItem);
    }




}
