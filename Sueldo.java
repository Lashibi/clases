import java.util.Scanner;
/*
Fernando Flores Fierros
28/11/2018
Programa que calcula el promedio de sueldo de un trabajador,
utilizando 2 clases y metodos
CLASE PRINCIPAL.
*/
public class Sueldo{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double s1,s2,s3,s4,prom;
        Calculos c = new Calculos();
        System.out.println("Ingrese el sueldo 1");
        s1=sc.nextDouble();
        System.out.println("Ingrese el sueldo 2");
        s2=sc.nextDouble();
        System.out.println("Ingrese el sueldo 3");
        s3=sc.nextDouble();
        System.out.println("Ingrese el sueldo 4");
        s4=sc.nextDouble();
        prom=c.calcularPromedio(s1, s2, s3, s4);//Guarda el proceso en prom. C:
        System.out.println(prom);
    }
}