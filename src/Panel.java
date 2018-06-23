/**
 *
 * @author Jesus Ivan
 */
import java.awt.Graphics;
import javax.swing.JPanel;

public class Panel extends JPanel{
        private Circulo circulo;
    
    public Panel(){
        circulo = new Circulo(0, 0, 0);
    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        circulo.dibujar(g);
    }
    
    public void dibujar(Circulo circulo){
        this.circulo = circulo;
        repaint();
    }
}