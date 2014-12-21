package CobaUnit;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class HelloTest {
    public HelloTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {

    }
    
    @AfterClass
    public static void tearDownClass() {

    }
@Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of sayHello method, of class Hello.
     */
    @Test
    public void testSayHello() {
        Hello hello = new Hello();
        String expectedResult = "Hello, Bro!";
        String result = hello.sayHello("Bro");
        assertEquals(expectedResult, result);
    }
    @Test
    public void testAnotherSayHello() {
        Hello hello = new Hello();
        String expectedResult = "Hello, Chyin!";
        String result = hello.sayHello("Chyin");
        assertEquals(expectedResult, result);
    }
    @Test
    public void testNotNullParamSayHello() {
        Hello hello = new Hello();
        String expectedResult = "Please input your name!";
        String result = hello.sayHello(null);
        assertEquals(expectedResult, result);
    }


}
