/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.chatappprog;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class ChatAppProg {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        //Registration details :
        System.out.println("\n---- Registration ----");
        
        //User to enter their Name
        System.out.print("Enter your Name :");
        String Name = input.nextLine();
        
        //User to enter Surname
        System.out.print("Enter your Surname :");
        String Surname = input.nextLine();
        
        //User to enter Username
        System.out.print("Enter your Username :");
        String Username = input.nextLine();
        
        //Show results  of the username
        if(Username.contains("_") && Username.length() <= 5){
            System.out.println("Username successfully captured");
        }else{ System.out.println("Username is not correctly formatted ");
        }
        
        //User to enter password
        System.out.print("Enter yout password :");
        String Password = input.nextLine();
        
        //Show output of the user's Password
        if(Password.length() >= 8 ){
            System.out.println("Password successfully captured");
        }else{ System.out.println("Password is not correctly formatted ");
        }
        
        //User to enter Phone Number
        System.out.print("Enter Phone Number :+27");
        String Left = input.nextLine();
        String phone = "+27" + Left ;
        
        //Show phone number of user
        if(phone.startsWith("+27") && phone.length() <=13){
            System.out.println("Cell phone number successfully added");
        }else{ System.out.println("Cell phone number is not correctly formatted");
        }
        
        //Login
        System.out.println("\n ---- Login now ----");
        
        //User to enter their Username
        System.out.print("Enter Username : ");
        String UserCredentials = input.nextLine();
        
        
        //User to enter their Password 
        System.out.print("Enter Password :");
        String AccessPass = input.nextLine();
        
        //Show user's login output
        if(UserCredentials.equals(Username) && AccessPass.equals(Password)){
        System.out.print("Welcome " + Name + " " + Surname + " " + " , it is great to see you again ");
        }else{ System.out.print("Username or password incorrect");
        }
        //Close the Scanner
        input.close();
    }
        //Boolean test to check if Username is correctly formatted
        public boolean CheckUsername(String Username){
            return Username.contains("_") && Username.length() <= 5;
        }
        
        //Boolean test to check the accuracy of the pasword 
        public boolean CheckPasswordComplexity (String Password ){
            return Password.length() >= 8;
        }
        
        //Boolean to check if phone number is rightfully entered 
        public boolean checkCellPhoneNumber(String NumberPhone){
            return NumberPhone.startsWith("+27") && NumberPhone.length() <= 13 ;
        }
        
    }

