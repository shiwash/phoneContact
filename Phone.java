package Phone;

import java.util.ArrayList;
import java.util.Scanner;

public class Phone {

    Scanner scanner = new Scanner(System.in);
    ArrayList <Contact> contacts = new ArrayList<Contact>();
    static int state =0;        //?




    public  void   addContact(){

        contacts.add(new Contact());

    }
    
    
    
    public  int  findPosition(String name){
        int index =-1;
        for (int i=0;i<contacts.size();i++){

            if(contacts.get(i).toString().equals(name)){   //?

                index=i+1;
            }
        }
        return index;
    }
    
    
    
    
    public  void   updateContact(){
       
        	System.out.println("enter the name for edit");
        	String  name=scanner.nextLine();
        	int index = findPosition(name);
            if (index < 0) {
            	System.out.println(" name  not exist");
            
            }
            else {
                contacts.set(index-1 , new Contact());
            }
         }
    
       
    
    public  void   removeContact(){

        if(contacts.size()>0) {
        	
        	System.out.println("enter the name for removeing");
        	String name = scanner.nextLine();
        	int index = findPosition(name);
        		if (index < 0) {
               System.out.println("This name is not found !");
                
            }
            else {
                contacts.remove(index-1);
       
            }
        }
        else
        	System.out.println("the list is empty.");
    }
    
    
    
    
    public  void   searchContact(){ 
    	
        if (contacts.size()>0) {
        	System.out.println("Whom you want to Show");
        	String name = scanner.nextLine();
            int index = findPosition(name);
            if (index < 0) {
               System.out.println("This name is not found!");
            } 
            else {
                state = 1;
                System.out.println(contacts.get(index-1));
                state = 0;   ///?
            }
        }
        else {

        	System.out.println("Sorry  the list is empety !");
        }
    }
    
 
    
    public  void   showAllContact(){
        if(contacts.size()>0) {
            state = 1;
            String temp="";
            for (int i = 0; i < contacts.size(); i++) {
             System.out.println("Name: "+contacts.get(i).name + "\nPhone Number: " + contacts.get(i).phoneNumber+"\nEmail: "+contacts.get(i).Email+"\n");
            state = 0;
            }
        }
        else
           System.out.println("Sorry  the list is empety !");
    
    }
    
    

    
    
    
 
    public  void   searchByIndex(){
        System.out.println("please enter the name for search : ");
        String name=scanner.nextLine();
        
        int index =findPosition(name);
        
        state=1;

        System.out.println(contacts.get(index-1));
        state=0;
        
    }




}

		

