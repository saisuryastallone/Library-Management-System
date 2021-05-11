package emailapp;

import java.util.Random;
import java.util.Scanner;

public class EmailApp {
    private String firstName;
    private String secondName;
    private String password;
    private String department;
    private String email;
    private String alternateEmail;
    
    //Constructor to receive the first name and last name
    public EmailApp(String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
        System.out.println("Email Created!");
        
        //Call a method asking for the department which returns a department
        this.department = setDepartment();
        System.out.println("Department: "+department);
        //Call a method that returns a random password
        this.password = randomPassword();
        System.out.println("Your Password is "+password);
        
        //Combine elements to generate email
        if(!department.equals("None")){
        email = firstName.toLowerCase()+"."+secondName.toLowerCase()+"@"+department.toLowerCase()+".company.com";
        }
        else{
        email = firstName.toLowerCase()+"."+secondName.toLowerCase()+"@"+"company.com";
        }
        System.out.println("Your Email is "+email); 
        
        
        
        
        
    }

    
    // Ask for the department
    private String setDepartment(){
        System.out.println("Department Codes:\n1. Sales\n2. Development\n3. Accounting\n0. None\nEnter the department:");
        Scanner sc = new Scanner(System.in);
        String[] department = {"None","Sales","Development","Accounting"};
        return department[sc.nextInt()];
    }
    
    //Generate a random password
    private String randomPassword(){
        String passwordSet="ABCDEFGHIJKLMONPQRSTUVWXYZ0123456789!@#$%^&*()";
        char[] password = new char[10];
        for(int i=0;i<password.length;i++){
            int rand = (int)(Math.random()*passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }
    
    
    //Set the alternate email
    public void alternateEmail(String s){
        this.email = s;
        System.out.println("Your email is successfully updated!");
        
    }
    
    //Change the password
    public void changePassword(String s){
        this.password = s;
        System.out.println("Your password is successfully updated!");
    }
    
    //Display all the info
    public void showInfo(){
        System.out.println("DISPLAY NAME: "+firstName+" "+secondName+"\n"+"COMPANY EMAIL: "+email);
    }
        
}
