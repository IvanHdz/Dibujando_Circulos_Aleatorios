/**
 *
 * @author Jesus Ivan
 */
import java.awt.Color;
import java.awt.Graphics;

public class Circulo {
    private int x1;
    private int y1;
    private int radio;
    private int diametro;
    private float area;
    private float circunferencia;
    
    public Circulo(int x1, int y1, int radio){
        cambiarUbicacion(x1, y1);
        cambiarTamaño(radio);
    }

    public void cambiarUbicacion(int x1, int y1){
        this.x1 = x1;
        this.y1 = y1;
    }
    
    public void cambiarTamaño(int radio){
        this.radio = radio;
    }
    
    public int calcularDiametro(){
        diametro = 2 * radio;
        return diametro;
    }
    
    public float calcularArea(){
        area = (float)(Math.PI * Math.pow(radio, 2));
        return area;
    }
    
    public float calcularCircunferencia(){
        circunferencia = (float)(Math.PI * calcularDiametro());
        return circunferencia;
    }
    
    public void dibujar(Graphics g){
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, 500, 500);
        
        g.setColor(Color.LIGHT_GRAY);
        g.fillOval(x1, y1, calcularDiametro(), calcularDiametro());
    }
}