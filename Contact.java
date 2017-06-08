package Phone;

import java.util.Scanner;

public class Contact {
	

    Scanner scanner = new Scanner(System.in);

    	String name;
    	String phoneNumber;
    	String Email;

	public  Contact ( ){
    	System.out.println("enter name");
    	name=scanner.nextLine();
    	
    	scanner.nextLine();
    	
    	System.out.println("enter phone number");
    	phoneNumber=scanner.nextLine();
    	
    	scanner.nextLine();
    	
    	System.out.println("enter Email ");
    	Email=scanner.nextLine();
    	
    }
	
	
    public  String toString( ){
        if(Phone.state==1) {
            return "Name : " + name + "\nPhone number :" + phoneNumber+"\nEmail :"+Email+"\n";
        }
        else if(Phone.state==2) {
            return phoneNumber;
        }
        else if(Phone.state==3) {
            return Email;
        }
        return name;
    }


}

