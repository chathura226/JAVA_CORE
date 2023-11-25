package org.chathura.FinalJavaChallenge;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static ArrayList<Contact> contacts;
    private static Scanner scanner;
    private static int id=0;
    public static void main(String[] args) {
        contacts=new ArrayList<>();
        System.out.println("Welcome to my world of programming!");
        showInitialOptions();
    }

    private static void showInitialOptions(){
        System.out.println("Please select one:"+
                "\n\t1. Manage Contacts"+
                "\n\t2. Messages"+
                "\n\t3. Quit");

        scanner =new Scanner(System.in);
        int choice=scanner.nextInt();
        switch (choice){
            case 1:
                manageContacts();
                break;
            case 2:
                manageMessages();
                break;
            default:
                break;
        }
    }

    private static void manageMessages() {
        System.out.println("Please Select One: "+
                "\n\t1. Show all messages"+
                "\n\t2. Send a new message"+
                "\n\t3. Go back");

        int choice= scanner.nextInt();
        switch (choice){
            case 1:
                showAllMessages();
                break;
            case 2:
                sendNewMessage();
                break;
            default:
                showInitialOptions();
                break;
        }
    }

    private static void sendNewMessage() {
        System.out.println("Who are you going to send the message: ");
        String name=scanner.next();
        if(name.equals("")){
            System.out.println("Please enter valid info");
            sendNewMessage();
        }else{
            boolean doesExist=false;
            for(Contact c:contacts){
                if(c.getName().equals(name)){
                    doesExist=true;
                }
            }
            if(doesExist){
                System.out.println("What is the message: ");
                String text= scanner.next();
                if(text.equals("")){
                    System.out.println("Please eneter a valid message");
                    sendNewMessage();
                }else{
                    id++;
                    Message newMessage=new Message(text,name,id);
                    for(Contact c:contacts){
                        if(c.getName().equals(name)){
                            ArrayList<Message> newMessages=c.getMessages();
                            newMessages.add(newMessage);
                            Contact currentContact=c;
                            currentContact.setMessages(newMessages);
                            contacts.remove(c);
                            contacts.add(currentContact);
                            break;

                        }
                    }
                }
            }else{
                System.out.println("Theres no such contact");
            }

        }
        showInitialOptions();
    }

    private static void showAllMessages() {
        ArrayList<Message> allMessages=new ArrayList<>();
        for (Contact c:contacts){
            allMessages.addAll(c.getMessages());
        }

        if(!allMessages.isEmpty()){
            for (Message m: allMessages) {
                m.getDetails();
                System.out.println("************");
            }
        }else{
            System.out.println("You dont have any messages");
        }

        showInitialOptions();
    }

    private static void manageContacts(){
        System.out.println("Please Select One: "+
                "\n\t1. Show all contatcs"+
                "\n\t2. Add a new Contact"+
                "\n\t3. Search for a contact"+
                "\n\t4. Delete a contact"+
                "\n\t5. Go back");
        int choice=scanner.nextInt();//dont have to initialize scanner because we habve initialized a static scanner befor
        switch (choice){
            case 1:
                showAllContacts();
                break;
            case 2:
                addNewContact();
                break;
            case 3:
                searchForContact();
                break;
            case 4:
                deleteContact();
                break;
            default:
                showInitialOptions();
                break;
        }
    }

    private static void deleteContact() {
        System.out.println("Please eneter the contact name: ");
        String name=scanner.next();
        if(name.equals("")){
            System.out.println("Please enter valid info");
            deleteContact();
        }else{
            boolean doesExist=false;
            for(Contact c:contacts){
                if(c.getName().equals(name)){
                    doesExist=true;
                    contacts.remove(c);
                }
            }
            if(!doesExist){
                System.out.println("Theres no such contact");
            }
            showInitialOptions();
        }
    }

    private static void searchForContact() {
        System.out.println("Please eneter the contact name: ");
        String name=scanner.next();
        if(name.equals("")){
            System.out.println("Please enter valid info");
            searchForContact();
        }else{
            boolean doesExist=false;
            for(Contact c:contacts){
                if(c.getName().equals(name)){
                    doesExist=true;
                    c.getDetails();
                    break;
                }
            }

            if(!doesExist){
                System.out.println("Theres no such contact");
            }

            showInitialOptions();
        }
    }

    private static void addNewContact() {
        System.out.println("Adding a new contact"+
                "\nPlease enter a contact name:");
        String name=scanner.next();
        System.out.println("Please enter the contact number: ");
        String number=scanner.next();
        System.out.println("Please enter the contacts email: ");
        String email=scanner.next();

        if(name.equals("")||number.equals("")||email.equals("")){
            System.out.println("Please enter valid info");
            addNewContact();
        }else{
            boolean doesExist=false;
            for(Contact c:contacts){
                if(c.getName().equals(name)){
                    doesExist=true;
                }
            }
            if(doesExist){
                System.out.println("We already have a contact in this name");
                addNewContact();
            }else {
                Contact contact = new Contact(name, number, email);
                contacts.add(contact);
                System.out.println("Contact added successfully.");
                showInitialOptions();
            }
        }

    }

    private static void showAllContacts() {
        if(contacts.isEmpty()){
            System.out.println("No contacts!");
        }else {
            for (Contact c : contacts) {
                c.getDetails();
                System.out.println("*************");
            }
        }
        showInitialOptions();
    }
}
