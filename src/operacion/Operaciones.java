package operacion;


/**
 * 1. Consulta de saldo 2. Retiro de efectivo 3. Deposito de efectivo 4. Salir
 *
 * @author herla
 */
public abstract class Operaciones {

    protected int saldo;

    public void consultaSaldo(){
        System.out.println("Tu saldo actual es: "+saldo);
    }
    
    public abstract void operacion();

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    

}
