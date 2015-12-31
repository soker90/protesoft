package dominio;

import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Imagen extends javax.swing.JPanel {
    int x, y;
    String imagen;

    public Imagen(int x, int y, String imagen) {
        this.x = x;
        this.y = y;
        this.setSize(x, y);
        this.imagen = imagen;
    }

    @Override
    public void paint(Graphics g) {
        ImageIcon Img = new ImageIcon(this.imagen);
        g.drawImage(Img.getImage(), 0, 0, x, y, null);
    }    

}
