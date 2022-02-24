package operacion;
import java.util.Scanner;

/**
 *
 * @author herla
 */
public class Deposito extends Operaciones {
    Scanner s = new Scanner(System.in);
    
    @Override
    public void operacion(){
        int deposito = 0;
        System.out.println("Digite el valor a depositar: ");
        deposito = s.nextInt();
        
        setSaldo(getSaldo() + deposito);
        System.out.println("Depositaste: "+deposito);
        consultaSaldo();
    }
}
