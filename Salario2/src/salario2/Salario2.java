package salario2;
import javax.swing.JOptionPane;
public class Salario2 {

    public static void main(String[] args) {
        int salario=1160000;
        int dias_mes=31;
        int valor_dia=0;
        int salario_dia=0;
        String nombre = JOptionPane.showInputDialog("Digite su nombre: ");
        int dias = Integer.parseInt(JOptionPane.showInputDialog("Digite los dias trabajados: "));
        valor_dia = salario / dias_mes;
        salario_dia = valor_dia *dias;
        
        JOptionPane.showMessageDialog( null, "susalario mensual es: "+ salario_dia);
        JOptionPane.showMessageDialog( null, "susalario mensual es: "+ valor_dia);
                                              
                
  
    }
    
}
