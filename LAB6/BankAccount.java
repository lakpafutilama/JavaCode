/**
 *  Design a class to represent a bank account. Include the following members:
    Fields/Data members
    Name of the depositor
    Account number
    Type of account
    Balance amount in the account
    Methods
    Constructor(s)
    To assign initial values
    To deposit an amount
    To withdraw an amount after checking balance
    To display the name and balance.
    Test the bank account class by performing all actions defined in BankAccount class.

 *
 * @author (Lakpa Futi Lama)
 * @version (3)
 */
public class BankAccount
{
    String depositor;
    long accountno;
    String account_type;
    int amount;
    
    public BankAccount()
    {
        depositor="Lakpa";
        accountno=1234567890;
        account_type="Saving";
        amount=500000;
    }
    
    public BankAccount(String a, long b, String c, int d)
    {
        depositor=a;
        accountno=b;
        account_type=c;
        amount=d;
    }
    
    public void setAmount(int a)
    {
        amount+=a;
    }
    
    public String displayNB()
    {
        return "Dear "+depositor+", your current balance is Rs."+amount;
    }
}