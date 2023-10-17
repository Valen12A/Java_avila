package ejercicios;
import javax.swing.JOptionPane;
public class ejercicio7 {
    public static void main (String [] args){
        String texto=JOptionPane.showInputDialog("Introduce un codigo d la tabla ASCII");
        int codigo=Integer.parseInt(texto);
        
        char caracter=(char)codigo;
        
        System.out.println(caracter);
        
    }
}
