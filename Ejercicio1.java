import java.util.Scanner;
/*
Fernando Flores Fierros
27/11/2018
Crea un programa que nos calcule el área de un círculo,
cuadrado o triángulo. Pediremos la figura a la que queremos calcular
su área y según lo introducido se solicitarán los valores necesarios
para calcular el área. Crea un método para calcular el área de cada
figura con diferente implementación.
*/
public class Ejercicio1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int op,lsqr,lt,bt;
        double res;
        System.out.println("(1)Circulo  (2)Cuadrado  (3)Triangulo.");
        System.out.println("Ingrese la opcion de la que desea calcular el area.");
        op=sc.nextInt();
        switch (op){
            case 1:
                circulo();
                break;
            case 2:
                System.out.println("***Cuadrado***\nIngrese el lado del cuadrado.");
                lsqr=sc.nextInt();
                res=cuadrado(lsqr);
                System.out.println(res);
                break;
            case 3:
                System.out.println("***Triangulo***\n"
                        + "Ingrese la base del triangulo.");
                bt=sc.nextInt();
                System.out.println("Ingrese la altura del triangulo.");
                lt=sc.nextInt();
                triangulo(bt,lt);
                break;
            default:
                System.out.println("Ingrese una opcion valida.");
        }
    }//FIN MAIN.
    public static void circulo(){
        Scanner sc=new Scanner(System.in);
        int rad;
        double res;
        System.out.println("**Circulo**");
        System.out.println("Ingrese el radio.");
        rad=sc.nextInt();
        res=Math.PI*Math.pow(rad, 2);
        System.out.println("Area del circulo: "+res);
    }//fin
    public static double cuadrado(int l){
        double tot;
        tot=Math.pow(l, 2);
        return tot;
    }//fin
    public static void triangulo(int bt, int lt){
        Scanner sc=new Scanner(System.in);
        double rest;
        rest=(bt*lt)/2;
        System.out.println("El area es: "+rest);
    }
}