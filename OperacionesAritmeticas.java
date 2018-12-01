import java.util.Scanner;
/*AUTOR:
FECHA:
DESCRIPCIÓN: Programa que realiza las operaciones aritméticas
básicas utilizando métodos
*/
public class OperacionesAritmeticas{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int op, resultado;
        double p1, p2, div1, div2, result;
        do{
            System.out.println("1.SUMA\n2.RESTA"
                    + "\n3.PRODUCTO\n4.DIVISIÓN\n5.SALIR");
            System.out.print("Ingrese la opción: ");
            op=sc.nextInt();
            switch(op){        
                case 1: //SUMA
                    suma();
                    break;
                case 2: //RESTA
                    resultado=resta();
                    System.out.println("El resultado de la resta"
                            + " es: "+resultado);
                    break;
                case 3: //PRODUCTO
                    System.out.print("Valor 1: ");
                    p1=sc.nextDouble();
                    System.out.print("Valor 2: ");
                    p2=sc.nextDouble();
                    producto(p1,p2);
                    break;
                case 4: //DIVISIÓN
                    System.out.print("Dividendo: ");
                    div1=sc.nextDouble();
                    System.out.print("Divisor: ");
                    div2=sc.nextDouble();
                    result=division(div1, div2);
                    System.out.println("Resultado de la "
                            + "división "+result);
                    break;
                case 5:
                    System.out.println("Adios");
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        }while(op!=5);
    }//fin main
    
    //NO RECIBE Y NO REGRESA
    public static void suma(){
        Scanner sc = new Scanner(System.in);
        int n1, n2, res;
        System.out.print("Ingrese el primer valor: ");
        n1=sc.nextInt();
        System.out.print("Ingrese el segundo valor: ");
        n2=sc.nextInt();
        res=n1+n2;
        System.out.println("El resultado de la suma "
                +"es: "+res);
    }//fin suma
    
    //No recibe y regresa
    public static int resta(){
        Scanner sc = new Scanner(System.in);
        int n1, n2, res;
        System.out.print("Valor 1: ");
        n1=sc.nextInt();
        System.out.print("Valor 2: ");
        n2=sc.nextInt();
        res=n1-n2;
        return res;
    }//fin resta
    
    //no regresa y si recibe
    public static void producto(double p1, double p2){
        double res;
        res=p1*p2;
        System.out.println("El resultado de la multiplicación"
                + " es "+res);
    }
    
    //regresa y recibe
    public static double division(double div1, double div2){
        double res;
        res=div1/div2;
        return res;
    }
}//fin class