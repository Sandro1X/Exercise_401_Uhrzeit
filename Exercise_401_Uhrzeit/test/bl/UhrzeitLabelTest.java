package bl;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class UhrzeitLabelTest {
    
    public UhrzeitLabelTest() {
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
    public void testSetZiffer() {
        System.out.println("setZiffer");
        Ziffern ziffer = Ziffern.FIVE;
        UhrzeitLabel label = new UhrzeitLabel();
        label.setZiffer(ziffer);
        
        assertEquals("Digits wasn't set successful!", ziffer, label.getZiffer());
    }
}