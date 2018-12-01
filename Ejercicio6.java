import java.util.Scanner;
/*
Fernando Flores Fierros
30/11/2018
A un trabajador eléctrico le pagan según sus horas trabajadas y la tarifa 
está a un valor determinado por hora. Si la cantidad de horas trabajadas es
mayor a 40 horas, la tarifa por hora se incrementa en un 25% para las horas
extras. Calcular el salario del trabajador dadas las horas trabajadas y la
tarifa de horas extras. 
*/
public class Ejercicio6{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int horas,val;
        double pago;
        System.out.println("Ingrese las horas trabajadas.");
        horas=sc.nextInt();
        System.out.println("Valor por hora.");
        val=sc.nextInt();
        pago=horras(horas,val);
        System.out.println("Pago total: "+pago);
    }
    public static double horras(int horas,int val){
        double resultado;
        int hor;
        if(horas>40){
            hor=horas-40;
            resultado=((hor*val)*.25)+(40*val);
        }else{
            resultado=horas*val;
        }
        return resultado;
    }
}