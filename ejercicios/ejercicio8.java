package ejercicios;
import javax.swing.JOptionPane;
public class ejercicio8 {
    public static void main (String[] args){
        String texto=JOptionPane.showInputDialog("Introduce un aracter ASCII");
        char caracter=texto.charAt(0);
        int codigo=(int)caracter;
        
        System.out.println(codigo);
    }
}
