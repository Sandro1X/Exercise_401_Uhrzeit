package bl;

import java.awt.GridLayout;
import javax.swing.JPanel;

public class UhrzeitPanel extends JPanel{

    private UhrzeitLabel[] digits = new UhrzeitLabel[6];
    
    public UhrzeitPanel() {
        this.setLayout(new GridLayout(1,6));
        for (int i = 0; i < digits.length; i++) {
            digits[i] = new UhrzeitLabel();
            digits[i].setZiffer(Ziffern.ZERO);
            this.add(digits[i]);
        }
    }
}