package suma;
import java.util.Scanner;
public class Suma {

    public static void main(String[] args) {
        int numero1=0;
        int numero2=0;
        int numero3=0;
        int suma =0;
        int multiplicacion=0;
        int division=0;
        
        Scanner teclado =new Scanner (System.in);
        
        System.out.println("Digite el primer numero");
        numero1 =teclado.nextInt();
        System.out.println("Usted digito el numero " + numero1);
        System.out.println("Digite el segundo numero");
        numero2 =teclado.nextInt();
        System.out.println("Usted digito el numero " + numero2);
        System.out.println("Digite el tercer numero");
        numero3 =teclado.nextInt();
        System.out.println("Usted digito el numero " + numero3);
        suma = numero1 + numero2 + numero3;
        System.out.println("La suma de los numero digito es: " + suma);
        multiplicacion =numero1 * numero2 * numero3;
        System.out.println("La multiplicacion de los numero digito es: " + multiplicacion);
        division = numero1 / numero2 / numero3;
        System.out.println("La division de los numero digito es: " + division);
        
    }
    
}
