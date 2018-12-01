/*
Fernando Flores Fierros
30/11/218
Calcula el precio, subtotal e iva de un producto.
*/
public class CalculoIva{
    public double desglose(double price){
        double subt,iva;
        System.out.println("Total: "+price);
        iva=price*.16;
        subt=price-iva;
        System.out.println("Subtotal: "+subt);
        System.out.println("Iva: "+iva);
        return subt;
    }
}