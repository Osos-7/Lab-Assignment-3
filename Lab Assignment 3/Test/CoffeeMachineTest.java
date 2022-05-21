import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.*;

public class CoffeeMachineTest {

    @Test
    public void TEST1() {
        CoffeeMachine c = new CoffeeMachine();
        assertEquals("Power On!" + "Lights On!", c.turnOnMachine());
    }

    @Test
    public void TEST2() {
        CoffeeMachine c = new CoffeeMachine();
        c.isPowerOn= true;
        assertEquals("Error!", c.turnOnMachine());
    }


    @Test
    public void TEST3() {
        CoffeeMachine c = new CoffeeMachine();
        assertEquals("Turn On the Machine First!", c.addMoney(50));
    }

    @Test
    public void TEST4() {
        CoffeeMachine c = new CoffeeMachine();
        c.turnOnMachine();
        assertEquals("Money has been added Successfully", c.addMoney(50));
    }

    @Test
    public void TEST5(){
        CoffeeMachine c = new CoffeeMachine();
        c.turnOnMachine();
        c.turnOffMachine();
        assertEquals("Turn On the Machine First!",c.addMoney(30));
    }
    @Test
    public void TEST6(){
        CoffeeMachine c = new CoffeeMachine();
        assertEquals("Power On!" + "Lights On!",c.turnOnMachine());
        assertEquals("Money has been added Successfully",c.addMoney(30));
    }

    @Test
    public void TEST7(){
        CoffeeMachine c = new CoffeeMachine();
        assertEquals("Power On!" + "Lights On!",c.turnOnMachine());
        assertEquals("Money has been added Successfully",c.addMoney(30));
        assertEquals("Lights Off!" + "Power Off!",c.turnOffMachine());
    }
    @Test
    public void TEST8(){
        CoffeeMachine c = new CoffeeMachine();
        assertEquals("Turn on the machine first!",c.makeCoffee(12));
    }
    @Test
    public void TEST9(){
        CoffeeMachine c = new CoffeeMachine();
        assertEquals("Power On!" + "Lights On!",c.turnOnMachine());
        assertEquals("Money has been added Successfully",c.addMoney(30));
        assertEquals(3+ " Cup Of coffee Made!",c.makeCoffee(3));
    }
    @Test
    public void TEST10(){
        CoffeeMachine c = new CoffeeMachine();
        assertEquals("Power On!" + "Lights On!",c.turnOnMachine());
        assertEquals("Money has been added Successfully",c.addMoney(30));
        assertEquals(3+ " Cup Of coffee Made!",c.makeCoffee(4));
    }
    @Test
    public void TEST11(){
        CoffeeMachine c = new CoffeeMachine();
        assertEquals("Power On!" + "Lights On!",c.turnOnMachine());
        assertEquals("Money has been added Successfully",c.addMoney(30));
        assertEquals(1+ " Cup Of coffee Made!",c.makeCoffee(1));
    }
    @Test
    public void TEST12(){
        CoffeeMachine c = new CoffeeMachine();
        assertEquals("Power On!" + "Lights On!",c.turnOnMachine());
        assertEquals("Money has been added Successfully",c.addMoney(30));
        assertEquals(2+ " Cup Of coffee Made!",c.makeCoffee(2));
        assertEquals("Lights Off!" + "Power Off!",c.turnOffMachine());
    }
}
