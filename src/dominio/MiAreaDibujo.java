package dominio;

import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JLabel;

public class MiAreaDibujo extends JLabel{
    private ArrayList<ObjetoGrafico> objetosGraficos = new ArrayList<ObjetoGrafico>();
    public MiAreaDibujo(){
        
    }
    
    public void addObjetoGrafico(ObjetoGrafico objg) {
        objetosGraficos.add(objg);
    }
    
    public void removeAll(){
        objetosGraficos = new ArrayList<ObjetoGrafico>();
    }
    
    public ObjetoGrafico getUltimoObjetoGrafico(){
        return objetosGraficos.get(objetosGraficos.size()-1);
    }

    public void paint(Graphics g){
        super.paint(g);
        for (int i = 0; i < objetosGraficos.size(); i++) {
            ObjetoGrafico objg = objetosGraficos.get(i);
            if (objg instanceof ImagenGrafico){
                g.drawImage(((ImagenGrafico)objg).getImagen(), objg.getX(), objg.getY(), null);
            }
        } 
    }
    
}
