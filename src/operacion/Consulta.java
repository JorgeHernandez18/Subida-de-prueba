package operacion;

public class Consulta extends Operaciones{
    
    @Override
    public void operacion(){
        System.out.println("Tu saldo actual es: "+getSaldo());
    }
}
