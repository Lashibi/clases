import java.util.Scanner;
/*
Fernando Flores Fierros
30/11/2018
Una tienda tiene etiquetados los precios de los productos que vende,
con el precio neto (con IVA incluido). La persona encargada de una tienda,
tiene muchos problemas a la hora de que los clientes le piden factura de
sus productos, ya que tiene que desglosar el IVA, por lo que desea un programa 
que pida el precio neto de un producto e imprima el subtotal y el IVA. La clase
principal deberá mandar llamar al método desglose, localizado en otra clase,
el cual recibirá el precio neto, calculará el subtotal y el IVA, e imprimirá
ambos resultados.
*/
public class Ejercicio10{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double price,act;
        System.out.println("Ingrese el precio del producto.");
        price=sc.nextDouble();
        CalculoIva ci=new CalculoIva();//SE NOMBRA CON EL NOMBRE DE LA CLASE.
        act=ci.desglose(price);//USE CI PARA LLAMAR EL VALOR QUE CALCULA EL METODO DESGLOSE DE LA CLASE CALCULOIVA.
    }
}