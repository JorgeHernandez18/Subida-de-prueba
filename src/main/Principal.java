package main;
import operacion.Deposito;
import operacion.Operaciones;
import operacion.Retiro;
import java.util.Scanner;
import operacion.Consulta;

public class Principal {
    public static void main(String[] args) {
        Operaciones obRetiro = new Retiro();
        Operaciones obDeposito = new Deposito();
        Operaciones obCon = new Consulta();
        
        Scanner s = new Scanner(System.in);
        int x = 0;
        
        
        while(x != 4){
            System.out.println("Por favor seleccione una opcion: ");
            System.out.println("1. Consulta de saldo.");
            System.out.println("2. Retiro de efectivo.");
            System.out.println("3. Deposito de efectivo");
            System.out.println("4. Salir.");
                       
            x = s.nextInt();
            if(x == 4)
                System.out.println("Gracias, vuelva pronto");
            
            switch(x){
                case 1: obCon.consultaSaldo();
                    break;
                case 2: obRetiro.operacion();
                    break;
                case 3: obDeposito.operacion();
                    break;
                default: break;    
            }
        }
        System.out.println("Pertenezco a la rama prueba");
    }
}
