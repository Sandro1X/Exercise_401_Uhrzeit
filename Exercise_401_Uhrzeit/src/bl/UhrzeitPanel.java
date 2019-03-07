package bl;

import java.awt.Color;
import java.awt.GridLayout;
import java.time.LocalTime;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class UhrzeitPanel extends JPanel implements Runnable {

    private UhrzeitLabel[] digits = new UhrzeitLabel[6];
    private LocalTime time;

    public UhrzeitPanel(LocalTime time) {
        this.time = time;
        setup();
    }

    public void setup() {
        this.setLayout(new GridLayout(1, 8));
        for (int i = 0; i < digits.length; i++) {
            digits[i] = new UhrzeitLabel();
            digits[i].setZiffer(Ziffern.ZERO);
            this.add(digits[i]);

            if (i % 2 != 0 && i < 4) {
                JLabel label = new JLabel(":");
                label.setOpaque(true);
                label.setBackground(Color.white);
                label.setFont(label.getFont().deriveFont(25.0f));
                this.add(label);
            }
        }
    }

    @Override
    public void run() {
        while (true) {
            Ziffern[] ziffern = Ziffern.values();

            int hour1 = time.getHour() / 10;
            int hour2 = time.getHour() % 10;
            int min1 = time.getMinute() / 10;
            int min2 = time.getMinute() % 10;
            int sec1 = time.getSecond() / 10;
            int sec2 = time.getSecond() % 10;

            digits[0].setZiffer(ziffern[hour1]);
            digits[1].setZiffer(ziffern[hour2]);
            digits[2].setZiffer(ziffern[min1]);
            digits[3].setZiffer(ziffern[min2]);
            digits[4].setZiffer(ziffern[sec1]);
            digits[5].setZiffer(ziffern[sec2]);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(UhrzeitPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
            time = time.plusSeconds(1);
        }
    }
}
