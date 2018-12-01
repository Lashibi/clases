import java.util.Scanner;
/*
Fernando Flores Fierros
27/11/2018
Crea un programa que pida la entrada de un año e indique si se trata 
de un año bisiesto o no. Un año es bisiesto si es múltiplo de 4 y no lo
es de 100, excepto los múltiplos de 400 que también son bisiestos.
*/
public class Ejercicio2{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num;
        System.out.println("Ingrese el año: ");
        num=sc.nextInt();
        validacion(num);
    }//FIN MAIN.
    public static void validacion(int num){
        Scanner sc=new Scanner(System.in);
        int n1,n2;
        if(num%4==0){
            if(num%100==0){
                if(num%400==0){
                    System.out.println("Es bisiesto");
                }else{
                System.out.println("No es bisiesto");
                }
            }else{
                System.out.println("Es bisiesto");
            }
        }else{//else de todo xdd
            System.out.println("No es bisiesto");
        }   
    }
}