import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        SavingsAccount a1=new Transaction();
        System.out.println("Please set your full name");
        a1.setName(input.nextLine());
        System.out.println("You can set your own desired account number. Please set your account number");
        a1.setAccNum(input.nextLine());
        System.out.println("Please set your Password");
        a1.setUserPass(input.nextLine());
        System.out.println("You have to deposit some amount to open an account. How much you want to deposit?");
        a1.setAmount(input.nextDouble());
        System.out.println("Congratulations you have created your account at CityBank! You can withdraw money anytime from our CityBank ATM booth using our AMEXX card. \nThank you for choosing CityBank!");
        System.out.println("\nWelcome to CityBank ATM booth\nif you want to withdraw money press '0' or if you want to check your information press '1' or if you want to do both press'2'");
        int x=input.nextInt();
        if(x==0)
        {
            System.out.println("Enter the amount you want to withdraw. [For security purpose you have to enter your User Password]");
            a1.withDraw(input.nextDouble());
        }else if(x==1)
        {
            System.out.println("Enter the User Password and you can see your information.");
            System.out.println(a1.accountInfo());
        }else if(x==2)
        {
            System.out.println("Enter the amount you want to withdraw. [For security purpose you have to enter your User Password]");
            a1.withDraw(input.nextDouble());  
            System.out.println("Enter the User Password and you can see your information.");
            System.out.println(a1.accountInfo());
        }
    }
}