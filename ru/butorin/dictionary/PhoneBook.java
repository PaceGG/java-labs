package ru.butorin.dictionary;
import java.util.Map;
import java.util.HashMap;

public class PhoneBook {
    private final Map<String, String> contacts = new HashMap<>();

    public void addContact(String phoneNumber, String name){
        contacts.put(name, phoneNumber);
    }
    public String removeContact(String name){
        return contacts.remove(name);
    }

    public String getPhone(String name){
        return contacts.get(name);
    }
    public String getName(String phoneNumber){
        return contacts.get(phoneNumber);
    }

    public boolean hasPhone(String phoneNumber){
        return contacts.containsValue(phoneNumber);
    }
    public boolean hasName(String name){
        return contacts.containsKey(name);
    }

    public int getSize(){
        return contacts.size();
    }

    public String[] getNames(){
        String[] names = new String[contacts.size()];
        int i = 0;
        for (Map.Entry<String, String> contact: contacts.entrySet()){
            names[i] = contact.getKey();
            i++;
        }
        return names;
    }
    public String[] getPhoneNumbers(){
        String[] numbers = new String[contacts.size()];
        int i = 0;
        for (Map.Entry<String, String> contact: contacts.entrySet()){
            numbers[i] = contact.getValue();
            i++;
        }
        return numbers;
    }
    public String[] getContacts(){
        String[] list = new String[contacts.size()];
        int i = 0;
        for (Map.Entry<String, String> contact: contacts.entrySet()){
            list[i] = contact.getValue() + " - " + contact.getKey();
            i++;
        }
        return list;
    }

    public String[] search(String searchString){
        return contacts.keySet().stream().filter(name -> name.startsWith(searchString)).toArray(String[]::new);
    }

    public String toString(){
        String list = "";
        for (Map.Entry<String, String> contact: contacts.entrySet()){
            list += contact.getValue() + " - " + contact.getKey() + "\n";
        }
        return list;
    }
}
