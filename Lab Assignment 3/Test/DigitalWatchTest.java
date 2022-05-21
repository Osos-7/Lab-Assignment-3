import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;
public class DigitalWatchTest {
    @Test
    public void test1(){
        DigitalWatch d = new DigitalWatch();
        Assert.assertEquals("Turned On!", d.turnOn());
    }
    @Test
    public void test2(){
        DigitalWatch d = new DigitalWatch();
        Assert.assertEquals("Turned On!", d.turnOn());
        Assert.assertEquals("Already turned on", d.turnOn());
    }
    @Test
    public void test3(){
        DigitalWatch d = new DigitalWatch();
        Assert.assertEquals("Turned On!", d.turnOn());
        Assert.assertEquals("Already turned on", d.turnOn());
        Assert.assertEquals("Turned off", d.turnOff());
    }
    @Test
    public void test4(){
        DigitalWatch d = new DigitalWatch();
        Assert.assertEquals("Turned On!", d.turnOn());
        Assert.assertEquals("Timer set", d.setTimer(10));
    }
    @Test
    public void test5(){
        DigitalWatch d = new DigitalWatch();
        Assert.assertEquals("Turned On!", d.turnOn());
        Assert.assertEquals("Timer set", d.setTimer(10));
        Assert.assertEquals("Wait for timer to end", d.Interrupt());
    }
    @Test
    public void test6(){
        DigitalWatch d = new DigitalWatch();
        Assert.assertEquals("Turned On!", d.turnOn());
        Assert.assertEquals("Timer set", d.setTimer(10));
        d.isTimer = false;
        Assert.assertEquals("Accepted", d.Interrupt());
    }
    @Test
    public void test7(){
        DigitalWatch d = new DigitalWatch();
        Assert.assertEquals("Turned On!", d.turnOn());
        Assert.assertEquals("Timer set", d.setTimer(10));
        d.isTimer = false;
        Assert.assertEquals("Accepted", d.Interrupt());
        Assert.assertEquals("Turned off", d.turnOff());
    }
    @Test
    public void test8(){
        DigitalWatch d = new DigitalWatch();
        Assert.assertEquals("Turned On!", d.turnOn());
        Assert.assertEquals("Timer set", d.setTimer(10));
        d.isTimer = false;
        Assert.assertEquals("Accepted", d.Interrupt());
        d.isTurnedOn = false;
        Assert.assertEquals("Error", d.turnOff());
    }
}