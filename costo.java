/*
Fernando Flores Fierros
30/11/2018
Una empresa dedicada a vender teléfonos IP, desea un programa para calcular 
el costo de sus pedidos. Se requiere pedir al usuario la cantidad de teléfonos,
ésta se enviará como parámetro a un método llamado costo, el cual calculará el
costo del pedido e imprimirá el resultado. Cabe mencionar que si el cliente
pide más de 10 teléfonos, se le hará un 15% de descuento al pedido.
*/
public class costo{
    public double costo(final double PRICE,double telca){
        double precio;
        if(telca<=10&&telca>0){
        precio=telca*PRICE;
        }else{
            precio=((telca*PRICE)*.15)+(telca*PRICE);
        }
        System.out.println("Precio total: "+precio);
        return precio;
    }
}