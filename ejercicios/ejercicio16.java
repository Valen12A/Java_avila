package ejercicios;
    import javax.swing.JOptionPane;
public class ejercicio16 {
  
    public static void main(String[] args) {
  
        String contraseña="valee";
   
        final int INTENTOS = 3;
        boolean acierto=false;
  
        String password;
        for (int i=0;i<3 && !acierto;i++){
            password=JOptionPane.showInputDialog("Introduce una contraseña");
                if (password.equals(contraseña)){
                System.out.println("Enhorabuena, acertaste");
                acierto=true;
            }
        }
    }
}
