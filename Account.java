public abstract class Account
{
    protected double amount;
    protected String name,accNum,userPass;
    protected abstract void setAmount(double a);
    protected abstract void setName(String n);
    protected abstract void setAccNum(String a);
    protected abstract void setUserPass(String p);
    protected abstract String accountInfo();
    public String getName()
    {
        return name;
    }
    protected double getAmount()
    {
        return amount;
    }
    protected String getAccNum()
    {
        return accNum;
    }
}