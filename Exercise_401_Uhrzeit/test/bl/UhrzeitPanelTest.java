package bl;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class UhrzeitPanelTest {
    
    public UhrzeitPanelTest() {
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
    
    @Test
    public void testSetup() {
        System.out.println("setup");
        UhrzeitPanel instance = null;
        instance.setup();
        fail("The test case is a prototype.");
    }
    
    @Test
    public void testRun() {
        System.out.println("run");
        UhrzeitPanel instance = null;
        instance.run();
        fail("The test case is a prototype.");
    }
}
