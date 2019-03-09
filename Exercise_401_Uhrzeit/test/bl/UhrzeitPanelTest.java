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
    public void testRun() throws InterruptedException {
        System.out.println("run");
        UhrzeitPanel panel = new UhrzeitPanel(LocalTime.now());
        Thread thread = new Thread(panel);
        thread.start();
        boolean correct = true;
        
            UhrzeitLabel[] digits = panel.getDigits();
            int hour1 = LocalTime.now().getHour() / 10;
            int hour2 = LocalTime.now().getHour() % 10;
            int min1 = LocalTime.now().getMinute() / 10;
            int min2 = LocalTime.now().getMinute() % 10;
            int sec1 = LocalTime.now().getSecond() / 10;
            int sec2 = LocalTime.now().getSecond() % 10;
            
            thread.join(100);
            if (digits[0].getZiffer().getZiffer() != hour1 || digits[1].getZiffer().getZiffer() != hour2) {
                correct = false;
            }
            if (digits[2].getZiffer().getZiffer() != min1 || digits[3].getZiffer().getZiffer() != min2) {
                correct = false;
            }
            
        //Can't test seconds because they are never 100% correct.
        assertEquals("Time is wrong!", true, correct);
    }

    @Test
    public void testSetup() {
        System.out.println("setup");
        UhrzeitPanel panel = new UhrzeitPanel(LocalTime.now());
        panel.setup();
        boolean correct = true;

        for (int i = 0; i < panel.getDigits().length; i++) {
            if (panel.getDigits()[i].getZiffer() != Ziffern.ZERO) {
                correct = false;
            }
        }
        assertEquals("Array wasn't filled correctly!", true, correct);
    }
}