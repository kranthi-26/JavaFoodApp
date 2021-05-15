//program to generate password and enter password to order food in food app using java 
import java.util.Scanner;
class Main{
    public static void main(String args[]){
        System.out.println("Hello ! Welcome to food app");
        //user need to create password to place an order
        System.out.println("Please create your password");
        // to read password from the user
        Scanner scan = new Scanner(System.in);
        String password = scan.next();
        System.out.println("user password is: "+ password);
        System.out.println("enter your password: ");
        String checkpswd = scan.next();
        //check weather the user password matches with the entered password
        while(!checkpswd.equals(password)){
            System.out.println("This is not right password. Please try again !!!! ");
            //the user to try again, need to Write scan function again
            checkpswd = scan.next();
        }
        System.out.println("Access Granted !!!");
        //Ask user weather he/she is hungry
        System.out.println("Are you hungry ? 'yes' or 'no' ");
        //to store user answer
        String ans1 = scan.next();
        if(ans1.equals("yes")){
            System.out.println("Choose what you want to eat between 'Biriyani', 'Meals', 'Pizza' ");
            //to store answer for the above statement 
            String ans2 = scan.next();
            while( (!ans2.equals("Pizza")) && (!ans2.equals("Biriyani")) && (!ans2.equals("Meals")) ){
                System.out.println("Sorry we do not have it. what would you like between 'Biriyani', 'Meals', 'Pizza' ");
                //to repeatedly ask user to chhose among those three
                ans2 = scan.next();
            }
            if((ans2.equals("Pizza")) || (ans2.equals("Biriyani")) || (ans2.equals("Meals"))){
                System.out.println("Do you want something to dring yes or no");
                String ans3 = scan.next();
                while((!ans3.equals("yes")) && (!ans3.equals("no"))){
                    System.out.println("Wrong command !! try again ");
                    ans3 = scan.next();
                }
                if(ans3.equals("yes")){
                    System.out.println("what would you like to drink ? coke or juice");
                    String ans4 = scan.next();
                    while((!ans4.equals("coke")) && (!ans4.equals("juice"))){
                        System.out.println("Wrong command !! try again ");
                        ans4 = scan.next();
                }
                if((ans2.equals("coke"))||(ans2.equals("juice"))){
                    System.out.println("great you have ordered" + ans2 + " and" + ans4);
                }
                //Asking user to confirm password
                System.out.println("Please confirm your password");
                checkpswd = scan.next();
                while(!checkpswd.equals(password)){
                    System.out.println("This is not right password. Please try again !!!! ");
                    //the user to try again, need to Write scan function again
                    checkpswd = scan.next();
                }
                System.out.println("Thank you. Your order is on its way....!!!");
            }
            else{
                System.out.println("Your order is "+ ans2);
            //Asking user to confirm password
            System.out.println("Please confirm your password");
            checkpswd = scan.next();
            while(!checkpswd.equals(password)){
                System.out.println("This is not right password. Please try again !!!! ");
                //the user to try again, need to Write scan function again
                checkpswd = scan.next();
                }
            }
            }
        }
        else{
            System.out.println("Alright !! Have a good day");
        }
    }
}
************************************************
output:
Hello ! Welcome to food app
Please create your password
123
user password is: 123
enter your password: 
123
Access Granted !!!
Are you hungry ? 'yes' or 'no' 
yes
Choose what you want to eat between 'Biriyani', 'Meals', 'Pizza' 
Biriyani
Do you want something to dring yes or no
yes
what would you like to drink ? coke or juice
coke
Please confirm your password
123
Thank you. Your order is on its way....!!!
**************************************************
