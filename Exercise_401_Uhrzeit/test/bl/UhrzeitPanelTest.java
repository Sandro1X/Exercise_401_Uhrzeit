package bl;

import java.time.LocalTime;
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
    public void testRun() {
        System.out.println("run");
        UhrzeitPanel panel = new UhrzeitPanel(LocalTime.now());
        new Thread(panel).start();
        fail("The test case is a prototype.");
    }
    
    @Test
    public void testSetup() {
        System.out.println("setup");
        UhrzeitPanel panel = new UhrzeitPanel(LocalTime.now());
        panel.setup();
        boolean ok = true;
        
        for(int i = 0; i < panel.getDigits().length; i++){
            if(panel.getDigits()[i].getZiffer() != Ziffern.ZERO){
                ok = false;
            }
        }
        assertEquals("Array wasn't filled correctly!", true, ok);
    }
}
