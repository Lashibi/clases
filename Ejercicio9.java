import java.util.Scanner;
/*
Fernando Flores Fierros
30/11/2018
Una empresa dedicada a vender teléfonos IP, desea un programa para calcular 
el costo de sus pedidos. Se requiere pedir al usuario la cantidad de teléfonos,
ésta se enviará como parámetro a un método llamado costo, el cual calculará el
costo del pedido e imprimirá el resultado. Cabe mencionar que si el cliente
pide más de 10 teléfonos, se le hará un 15% de descuento al pedido.
NOTAS: 
El método calcular se encuentra en otra clase.
El costo de cada teléfono es de $400.00
*/
public class Ejercicio9{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        final double PRICE=400;
        String a;
        int telca;
        double prrecio;
        costo ct = new costo();
        System.out.println("Ingrese la cantidad de telefonos vendidos.");
        telca=sc.nextInt();
        prrecio=ct.costo(PRICE,telca);
    }
}