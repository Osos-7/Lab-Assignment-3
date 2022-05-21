import org.junit.Assert;
import org.junit.Test;
public class ATM_MachineTest {
    @Test
    public void test1(){
        ATM_Machine a = new ATM_Machine();
        a.isValidatedCard = false;
        Assert.assertEquals("Invalid Card", a.enterCard());
    }
    @Test
    public void test2(){
        ATM_Machine a = new ATM_Machine();
        Assert.assertEquals("Valid Card", a.enterCard());
    }
    @Test
    public void test3(){
        ATM_Machine a = new ATM_Machine();
        Assert.assertEquals("Logged In Successfully", a.enterPassword());
    }
    @Test
    public void test4(){
        ATM_Machine a = new ATM_Machine();
        Assert.assertEquals("Valid Card", a.enterCard());
        a.isValidPassword = false;
        Assert.assertEquals("Wrong password", a.enterPassword());
    }
    @Test
    public void test5(){
        ATM_Machine a = new ATM_Machine();
        Assert.assertEquals("Valid Card", a.enterCard());
        Assert.assertEquals("Logged In Successfully", a.enterPassword());
        Assert.assertEquals("Not enough balance", a.withdraw(10));
    }
    @Test
    public void test6(){
        ATM_Machine a = new ATM_Machine();
        Assert.assertEquals("Valid Card", a.enterCard());
        Assert.assertEquals("Logged In Successfully", a.enterPassword());
        Assert.assertEquals("Enter a valid amount", a.deposit(20));
        Assert.assertEquals("Not enough balance", a.withdraw(10));
    }
    @Test
    public void test7(){
        ATM_Machine a = new ATM_Machine();
        Assert.assertEquals("Valid Card", a.enterCard());
        Assert.assertEquals("Logged In Successfully", a.enterPassword());
        Assert.assertEquals("Successful deposit", a.deposit(50));
        Assert.assertEquals("Successful withdraw", a.withdraw(10));
    }
    @Test
    public void test8(){
        ATM_Machine a = new ATM_Machine();
        Assert.assertEquals("Valid Card", a.enterCard());
        Assert.assertEquals("Logged In Successfully", a.enterPassword());
        Assert.assertEquals("Successful deposit", a.deposit(1000));
        Assert.assertEquals("Successful withdraw", a.withdraw(10));
    }
    @Test
    public void test9(){
        ATM_Machine a = new ATM_Machine();
        Assert.assertEquals("Valid Card", a.enterCard());
        Assert.assertEquals("Logged In Successfully", a.enterPassword());
        Assert.assertEquals("Enter a valid amount", a.deposit(50001));
        Assert.assertEquals("Not enough balance", a.withdraw(10));
    }
    @Test
    public void test10(){
        ATM_Machine a = new ATM_Machine();
        Assert.assertEquals("Valid Card", a.enterCard());
        Assert.assertEquals("Logged In Successfully", a.enterPassword());
        Assert.assertEquals("Successful deposit", a.deposit(1000));
        Assert.assertEquals("Successful withdraw", a.withdraw(500));
        Assert.assertEquals("Successful withdraw", a.withdraw(500));
    }
    @Test
    public void test11(){
        ATM_Machine a = new ATM_Machine();
        Assert.assertEquals("Valid Card", a.enterCard());
        Assert.assertEquals("Logged In Successfully", a.enterPassword());
        Assert.assertEquals("Successful deposit", a.deposit(1000));
        Assert.assertEquals("Successful withdraw", a.withdraw(500));
        Assert.assertEquals("Not enough balance", a.withdraw(501));
    }
    @Test
    public void test12(){
        ATM_Machine a = new ATM_Machine();
        Assert.assertEquals("Valid Card", a.enterCard());
        Assert.assertEquals("Logged In Successfully", a.enterPassword());
        Assert.assertEquals("Successful deposit", a.deposit(3000));
        Assert.assertEquals("Successful withdraw", a.withdraw(1000));
        Assert.assertEquals("Not enough balance", a.withdraw(4000));
        Assert.assertEquals("Successful withdraw", a.withdraw(2000));
    }
}