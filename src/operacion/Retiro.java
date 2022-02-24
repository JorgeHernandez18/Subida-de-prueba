package operacion;
import java.util.Scanner;
/**
 *
 * @author herla
 */
public class Retiro extends Operaciones {
    Scanner s = new Scanner(System.in);
    
    @Override
    public void operacion(){
        int retiro = 0;
        System.out.println("Digite el valor a retirar: ");
        retiro = s.nextInt();
        
        setSaldo(getSaldo() - retiro);
        System.out.println("Retiraste: "+retiro);
        consultaSaldo();
    }
}
