/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cobajunit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Alfian Ramadhiansyah
 */
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
        System.out.println("sayHello");
        String name = "";
        Hello instance = new Hello();
        String expResult = "";
        String result = instance.sayHello(name);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
        
    public void testAnotherSayHello() {
        Hello hello = new Hello();
        String expectedResult = "Hello, Chyin!";
        String result = hello.sayHello("Chyin");
        assertEquals(expectedResult, result);
    

    }}
