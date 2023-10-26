package Contact;
import java.util.ArrayList;

public class Schedule {
    private ArrayList<Contact> contacts;

    public Schedule() {
        contacts = new ArrayList<Contact>();
    }

    // Métodos para adicionar, remover e listar contatos
    public void addContact(Contact contact) {
        contacts.add(contact);
    }

    public void removeContact(Contact contact) {
        contacts.remove(contact);
    }

    public ArrayList<Contact> listContacts() {
        return contacts;
    }
}


