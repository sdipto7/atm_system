import java.util.Scanner;
public class Transaction extends SavingsAccount
{
    public double withDraw(double c)
    {
        int count=0;
        Scanner input=new Scanner(System.in);
        do{
            System.out.println("Can you tell me what was your UserPassword?\nif you can please type it down below");
            String givenPass=input.nextLine();
            if(givenPass.equals(userPass))
            {
                count=4;
                cash=c;
                if(amount>cash)
                {
                    System.out.println("Woo hooo!! Transaction Successfull!\nTake your card back. Thank you for choosing CityBank!\n====================================="); 
                    double newAmount=amount-cash;
                    setAmount(newAmount);
                    return cash;
                }
                else
                {
                    System.out.println("You do not have sufficient balance");
                    cash=0.0;
                    return cash;
                }
            }
            else
            {
                count++;
                System.out.println("You cannot withdraw money from this account! this account does not belong to you");
                System.out.println("You have entered wrong Password!\nyou have tried "+count+"times. you can try "+(3-count)+" more times");
                return 0.0;
            }
    }while (count<=3);
    }
}
