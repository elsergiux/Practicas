package practica1;

import java.util.Scanner;

public class Practica1 {

    public static void main(String[] args) {
       
 Scanner sc = new Scanner(System.in);
 String nombre, numero;
 double tipo, importe;

 //se crea objeto cuenta1 sin parámetros
 //se ejecuta el constructor por defecto
 Practica1 cuenta1 = new Practica1();

 System.out.print("Nombre : ");
 nombre = sc.nextLine();
 System.out.print("Número de cuenta : ");
 numero = sc.nextLine();
 System.out.print("Tipo de interes : ");
 tipo = sc.nextDouble();
 System.out.print("Saldo: ");
 importe = sc.nextDouble();

 cuenta1.setNombre(nombre);
 cuenta1.setNumeroCuenta(numero);
 cuenta1.setTipoInteres(tipo);
 cuenta1.setSaldo(importe);

 //se crea el objeto cuenta2 con los valores leidos por teclado
 //se ejecuta el constructor con parámetros
 Practica1 cuenta2 = new Practica1("Juan Ferrández Rubio", "12345678901234567890", 1.75, 300);                       

 //se crea cuenta3 como copia de cuenta1
 //se ejecuta el constructor copia
 Practica1 cuenta3 = new Practica1(cuenta1);

 //mostrar los datos de cuenta1
 System.out.println("Datos de la cuenta 1");
 System.out.println("Nombre del titular: " + cuenta1.getNombre());
 System.out.println("Número de cuenta: " + cuenta1.getNumeroCuenta());
 System.out.println("Tipo de interés: " + cuenta1.getTipoInteres());
 System.out.println("Saldo: " + cuenta1.getSaldo());
 System.out.println();
       
 //se realiza un ingreso en cuenta1
 cuenta1.ingreso(4000);
     
 //mostrar el saldo de cuenta1 después del ingreso
 System.out.println("Saldo: " + cuenta1.getSaldo());
     
 //mostrar los datos de cuenta2
 System.out.println("Datos de la cuenta 2");
 System.out.println("Nombre del titular: " + cuenta2.getNombre());
 System.out.println("Número de cuenta: " + cuenta2.getNumeroCuenta());
 System.out.println("Tipo de interés: " + cuenta2.getTipoInteres());
 System.out.println("Saldo: " + cuenta2.getSaldo());
 System.out.println();
     
 //mostrar los datos de cuenta3
 System.out.println("Datos de la cuenta 3");
 System.out.println("Nombre del titular: " + cuenta3.getNombre());
 System.out.println("Número de cuenta: " + cuenta3.getNumeroCuenta());                                         
 System.out.println("Tipo de interés: " + cuenta3.getTipoInteres());
 System.out.println("Saldo: " + cuenta3.getSaldo());
 System.out.println();
     
 //realizar una transferencia de 10€ desde cuenta3 a cuenta2
 cuenta3.transferencia(cuenta2, 10);
     
 //mostrar el saldo de cuenta2
 System.out.println("Saldo de la cuenta 2");
 System.out.println("Saldo: " + cuenta2.getSaldo());
 System.out.println();
     
 //mostrar el saldo de cuenta3
 System.out.println("Saldo de la cuenta 3");
 System.out.println("Saldo: " + cuenta3.getSaldo());
 System.out.println();
}

    private Practica1(Practica1 cuenta1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private Practica1(String juan_Ferrández_Rubio, String string, double d, int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private Practica1() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setNombre(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setNumeroCuenta(String numero) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setTipoInteres(double tipo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setSaldo(double importe) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private String getNombre() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private String getNumeroCuenta() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private String getTipoInteres() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private String getSaldo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void ingreso(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void transferencia(Practica1 cuenta2, int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
