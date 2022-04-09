package day09_IfElseStatements;

import java.util.Scanner;

public class PatientInformation {
    public static void main(String[] args) {
        //Enter your code here
        Scanner scan = new Scanner(System.in);
        String firstName, lastName, fullName, email, street, state,city, address, contacts;
        int age, zipcode;
        double height, weight;
        long workPhoneNumber,personalPhoneNumber;
        boolean isMarried;


        // this part is already provided DO NOT CHANGE
        System.out.println("Welcome to the patient portal!");
        System.out.println("Please enter your personal information");
        System.out.println("Enter your first name");
        firstName= scan.nextLine();
        System.out.println("Enter your last name");
        lastName= scan.nextLine();
        System.out.println("Enter your email: ");
        email = scan.next();
        scan.nextLine();//to capture Enter key press
        System.out.println("Enter your street");
        street = scan.nextLine();
        System.out.println("Enter your City");
        city = scan.nextLine();
        System.out.println("Enter your State");
        state = scan.nextLine();
        System.out.println("Enter your zip code");
        zipcode = scan.nextInt();
        System.out.println("Enter your Work Phone Number");
        workPhoneNumber= scan.nextLong();
        System.out.println("Enter your Personal Phone Number");
        personalPhoneNumber= scan.nextLong();
        System.out.println("Enter your age");
        age = scan.nextInt();
        System.out.println("Enter your height");
        height= scan.nextDouble();
        System.out.println("Enter your weight");
        weight=scan.nextDouble();
        System.out.println("Are you married?");
        isMarried=scan.nextBoolean();
        fullName=lastName+", "+firstName;

        System.out.println("Patient personal information"+ "\nFull name: "+fullName+ " \nAddress:  " + street+ ","+ city + "," +state + ","+ zipcode +
                "\nContacts: work phone number -" + workPhoneNumber + ","+ "\npersonel phone number -"+ personalPhoneNumber+ ","+ "\nemail:"+email+ "\nAge: "+ age+"\nHeight: "+ height+ "\nWeight: "+weight+" pounds"+"\nMarried: "+isMarried);

        /*
        Patient personal information
Full name: Tyson, Mike
Address: 7911 Westpark Dr, McLean, VA 22102
Contacts: work phone number - 7896542315, personal phone number - 2406542315, email: miketyson@gmail.com
Age: 45
Height: 6.1
Weight: 175.2 pounds
Married?: false


        contacts = "Contacts: work phone number -" + workPhoneNumber + ","+ "\npersonel phone number -"+ personalPhoneNumber+ ","+ "\nemail:"+email;
        fullName = firstName + ", "+ lastName;
        address = street + ", "+ city + ", "+state+ ", "+ zipcode;
        System.out.println("Patient personal information "+ fullName+ "\nAddress: "+ address+ "\nContacts: "+contacts+ "\nAge: "+ age +
        " Height: "+height+ " Weight: "+weight+ " pounds"+ "\nMarried?: "+ isMarried);
         */

        /*System.out.println("Patient personal information Full name: " + firstName + " , " + lastName+
                " \nAddress:  " + street+ ","+ city + "," +state + ","+ zipcode + ","
                + " \nContacts : " + " Work Phone Number : "+ workPhoneNumber + ",\nPersonal Phone Number: " + ", \nemail" + email+
                "\nAge: " + age + " Height: " + height + " Weight: " + weight + " pounds" + "\nMarried?: " + isMarried);

         */



    }
}
/*
Welcome to the patient portal!
Please enter your personal information
Enter your first name
James
Enter your last name
May
Enter your email
jamesmay@gmail.com
Enter your street
7925 Jones Branch Dr
Enter your city
McLean
Enter your state
VA
Enter your zip code
22102
Enter your work phone number
7896542314
Enter your personal phone number
2406542314
Enter your age
35
Enter your height
5.10
Enter your weight
173.2
Are you married?
true
Patient personal information Full name: May, James
Address: 7925 Jones Branch Dr, McLean, VA 22102
Contacts: work phone number - 7896542314,
personal phone number - 2406542314,
email: jamesmay@gmail.com
Age: 35 Height: 5.1 Weight: 173.2 pounds
Married?: true
 */