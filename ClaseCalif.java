/*
Fernando Flores Fierros
30/11/2018
Calcula el promedio de las califs.
*/
public class ClaseCalif{
    public double calcalif(double c1,double c2,double c3){
        double ca1,ca2,ca3,suma,tot;
        suma=c1+c2+c3;
        ca1=c1*.25;
        ca2=c2*.35;
        ca3=c3*.4;
        tot=ca1+ca2+ca3;
        return tot;
    }
}