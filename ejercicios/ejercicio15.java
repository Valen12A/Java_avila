
package ejercicios;
import javax.swing.JOptionPane;
public class ejercicio15 {
    public static void main(String[] args){
        int codigo;
        do{
            String texto =JOptionPane.showInputDialog("Introduce un numero mayor de 0");
           codigo=Integer.parseInt(texto);
        }while(codigo<=0);
        System.out.println(codigo);
    }
    
}
