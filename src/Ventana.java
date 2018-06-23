/**
 *
 * @author Jesus Ivan
 */
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class Ventana extends JFrame{
    private Circulo circulo;
    private Panel miPanel;
    private Container contenedor;
    private JTextArea calculos;
    private JButton bDibujar;
    
    public Ventana(){
        super("Viruz Blog: Cálculos del Circulo");
        contenedor = getContentPane();
        setSize(500, 600);
        contenedor.setBackground(Color.WHITE);
        setResizable(false);
        setLocationRelativeTo(null);
        
        addComponentes();
        addEventos();
        
        setVisible(true);
    }
       public void addComponentes(){
        miPanel = new Panel();
        calculos = new JTextArea("Cálculos");
        bDibujar = new JButton("Dibujar un círculo aleatoriamente");
        
         //muestra normal el JTextArea pero no permite escribir desde el teclado
        calculos.setEditable(false);
        
        miPanel.setBackground(Color.WHITE);
        contenedor.add(bDibujar, BorderLayout.NORTH);
        contenedor.add(miPanel, BorderLayout.CENTER);
        contenedor.add(calculos, BorderLayout.SOUTH);
       }
        
       public void addEventos(){
        bDibujar.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evento){
                dibujarCirculo();
                mostrarCalculos();
            }
        });
     }
       
       public void dibujarCirculo(){
        int x1 = (int)(Math.random() * 200);
        int y1 = (int)(Math.random() * 200);
        int radio = (int)(Math.random() * 100);
        
        circulo = new Circulo(x1, y1, radio);
        
        miPanel.dibujar(circulo);
    }
    
    public void mostrarCalculos(){
        String radio;
        String diametro;
        String area;
        String circunferencia;
        
        radio = "Radio: \t" + (circulo.calcularDiametro() / 2);
        diametro = "Diámetro: \t" + circulo.calcularDiametro();
        area = "Área: \t" + circulo.calcularArea();
        circunferencia = "Circunferencia: \t" + circulo.calcularCircunferencia();
        
        calculos.setText(": : Cálculos : :" + "\n" + radio + "\n" + diametro + 
                "\n" + area + "\n" + circunferencia);
    }
 }