package ejercicios;
import javax.swing.JOptionPane;

public class ejercicio13 {
 
    public static void main(String[] args) {
        String texto=JOptionPane.showInputDialog("Introduce el número de ventas");
        int numVentas=Integer.parseInt(texto);
        int sumaVentas=0;
        
        for (int i=0;i<numVentas;i++){

            texto=JOptionPane.showInputDialog("Introduce el precio de la venta"+(i+1));
            int venta=Integer.parseInt(texto);

            sumaVentas=sumaVentas+venta;
        }
        System.out.println(sumaVentas);
    }
}

