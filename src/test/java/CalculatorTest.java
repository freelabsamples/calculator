import junit.framework.TestCase;

/**
 * Created by rohit on 16-02-2017.
 */
public class CalculatorTest extends TestCase {


    public void testAdd()
    {
        System.out.println(" testing addition ");
        assertEquals(Calculator.add(2,2),4);
    }
    public void testSubtract()
    {
        System.out.println(" testing subtraction ");
        assertEquals(Calculator.subtract(10,4),6);
    }
}
