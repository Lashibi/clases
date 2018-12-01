import java.util.Scanner;
/*
Fernando Flores Fierros
30/11/2018
Hacer un programa que contenga dos clases. Desde la clase principal mande
llamar a un método (el cual va a estar localizado en la otra clase) que pedirá
las calificaciones de los tres exámenes parciales de una materia, calculará
la calificación final y la devolverá a la clase principal, donde será impreso. 
NOTA: La calificación final tiene las siguientes ponderaciones: examen del 
primer parcial, 25%; examen del segundo parcial, 35%; y el examen del
tercer parcial, 40%.
*/
public class Ejercicio7{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double c1,c2,c3,res;
        ClaseCalif cc=new ClaseCalif();
        System.out.println("Ingrese calificacion 1.");
        c1=sc.nextDouble();
        System.out.println("Ingrese calificacion 2.");
        c2=sc.nextDouble();
        System.out.println("Ingrese calificacion 3.");
        c3=sc.nextDouble();
        res=cc.calcalif(c1, c2, c3);
        System.out.println(res);
    }
}