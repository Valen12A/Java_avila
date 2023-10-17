package ejercicios;
import javax.swing.JOptionPane;
public class ejercicio6 {
    public static void main(String[] args) {
        String texto=JOptionPane.showInputDialog("Introduce un numero");
        int numero=Integer.parseInt(texto);
        
        if (numero%2==0){
            System.out.println("El número" + numero + "es divqisibles entre 2");
            
        }else{
            System.out.println("El numero"+ numero + " no es divisibe entre 2");
        }
    }
}
