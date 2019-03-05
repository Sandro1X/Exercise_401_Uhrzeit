package bl;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class UhrzeitLabel extends JLabel {
    private Ziffern ziffer;

    public UhrzeitLabel(Ziffern ziffer) {
        this.ziffer = ziffer;
    }

    public void setZiffer(Ziffern ziffer) {
        this.ziffer = ziffer;
        this.setIcon(new ImageIcon(getClass().getResource("/icons/"+ziffer.getZiffer()+".png")));
    }
}