package Phone;

import java.util.Scanner;

public class Run {


	
    public static  void main(String args[]){
        Scanner sc= new Scanner(System.in);
        Phone phone = new Phone();

        boolean quit = false;
        int choice=0 ;

        instruction();
        while (quit==false) {
        	
        	System.out.println("enter your choice");
        	choice=sc.nextInt();
        	switch (choice) {

                case 0: 
                	instruction();
                    break;
                case 1:
                	phone.addContact();
                    break;
                case 2:
                	phone.updateContact();
                    break;
                case 3:
                	phone.removeContact();
                    break;
                case 4:
                	phone.searchByIndex();
                    break;
                case 5:
                	System.out.println("\nContact list : \n");
                	
                	phone.showAllContact();
                    break;
    
                case 6:
                	quit=true;
               
                    break;

            }

        }
    }
    
    
    

    public static  void instruction(){
        System.out.println("Enter 0 for see the instrusctions again");
        System.out.println("Enter 1 for adding contact");
        System.out.println("Enter 2 for updating contact");
 	    System.out.println("Enter 3 for removing every contact");
 	    System.out.println("Enter 4 to searching contact by index");
 	    System.out.println("Enter 5 for show all contacts");
 	    System.out.println("Enter 6 for  exiting\n");
    }
}


