import java.util.Scanner;
public abstract class SavingsAccount extends Account
{
    public double cash;
    protected void setName(String n)
    {
        name=n;
    }
    protected void setAccNum(String an)
    {
        accNum=an;
    }
    protected void setAmount(double a)
    {
        amount=a;
    }
    protected void setUserPass(String p)
    {
        userPass=p;
    }
    public abstract double withDraw(double c);
    public String accountInfo()
    {
        int count=0;
        Scanner input=new Scanner(System.in);
        do{
            System.out.println("Can you tell me what was your UserPassword?\nif you can please type it down below");
            String givenPass=input.nextLine();
            if(givenPass.equals(userPass))
            {
                count=4;
                return this.toString();
            }else
            {
                count++;
                System.out.println("You have entered wrong Password!\nyou have tried "+count+" times. you can try "+(3-count)+" more times");
                return "This account does not belong to you!!";
            }
    }while(count<=3);
    }
    public String toString()
    {
        return "Name: "+getName()+"\n"+"Account Number: "+getAccNum()+"\n"+"Current balance: "+getAmount()+"\n"+"Amount withdrawed: "+cash+"\n"+"Previous balance: "+(getAmount()+cash);
    }
}