package unit.testing;

import org.testng.Assert;

public class TestCalculator {
    public static void main(String[] args) {
        Calculator cal = new Calculator();

        Assert.assertEquals(cal.addition(10,20), 30);
        Assert.assertEquals(cal.substraction(30,10), 20);
        cal.setName("Bob");
        Assert.assertSame(cal.getName(),"Bobby", "We are waiting for Bobby." );
    }
}
