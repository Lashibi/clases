import java.util.Scanner;
/*
Fernando Flores Fierros
30/11/2018
Crea un programa que calcule el costo de permanecer en un estacionamiento
de un aeropuerto de modo que las tres primeras horas se cobran a 2.50 dólares
y las siguientes a 1.30 hasta llegar a un tope de 28 dólares para 24 horas.
Si permanece estacionado más de un día se cobrarían 28 dólares al día y 1.30
las horas siguientes. El usuario deberá especificar la cantidad de horas que 
permaneció estacionado.
*/
public class Ejercicio4{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int horas;
        System.out.println("Ingrese las horas.");
        horas=sc.nextInt();
        comp(horas);
    }
    public static void comp(int horas){
        double precio = 0;
        if(horas<=3){
            precio=horas*2.5;
        }
        if(horas>3&&horas<24){
            precio=((horas-3)*1.3)+7.5;
        }
        if(horas>=24){
            precio=((horas-24)*1.3)+28;
        }
        System.out.println("Costo total: "+precio);
    }
}