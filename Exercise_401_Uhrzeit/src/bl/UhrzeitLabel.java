package bl;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class UhrzeitLabel extends JLabel {
    private Ziffern ziffer;

    public UhrzeitLabel() {
        this.setOpaque(true);
        this.setBackground(Color.white);
    }

    public void setZiffer(Ziffern ziffer) {
        this.ziffer = ziffer;
        this.setIcon(new ImageIcon(getClass().getResource("/icons/"+ziffer.getZiffer()+".png")));
    }
}