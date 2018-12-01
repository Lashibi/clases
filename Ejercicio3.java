import java.util.Scanner;
/*
Fernando Flores Fierros
26/11/2018
convierte una cantidad ingresada de pesos a dolares o euros utilizando metodos.
*/
public class Ejercicio3{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double cantidad,conversion,cambio;
        final double DOLAR=20.41;
        final double EURO=23.15;
        int op;
        System.out.println("Ingrese la cantidad de dinero a convertir.");
        cantidad=sc.nextInt();
        System.out.print("1.Dolares   2.Euros."
                + "\nSeleccione: ");
        op=sc.nextInt();
        switch(op){
            case 1:
                cambioDivisa(cantidad,DOLAR,op);//Le mandamos las cosas.        Siempre revisar el orden de las variables que envie c:
                break;
            case 2:
                cambioDivisa(cantidad,EURO,op);//
                break;
            default:
                System.out.println("Opcion no valida.");
        }
    }//fin main
    //public static siempre va
    //void no regresa, si regresa va a tener el tipo de valor (Double, int, etc).
    //nombre
    //Cosas entre parentesis si recibe, si no se quedan vacios.
    public static void cambioDivisa(double cantidad, double cambio, double op){
        double conversion;
        String moneda;
        conversion=cantidad/cambio;
        if(op==1)
            moneda="Dolar";
        else
            moneda="Euro";
        System.out.println("Pesos: "+cantidad+
                "\nTIPO CAMBIO $"+cambio+"\nMoneda: "+moneda+
                "\nTotal: $"+conversion);
    }
}