package programas;
import java.util.Scanner;
public class Programa02 {
    public static void main(String [] args){
    //declarar variables
    int i,n;
    double ingreso,ingresop,ingresom,sueldos;
    Scanner lectura=new Scanner(System.in);
    //entrada
    System.out.print("Ingresar la cantidad de personas: ");
    n=lectura.nextInt();
    double[] aingresos=new double[n];
        for ( i = 0; i < n; i++) {
            System.out.print("Ingrese el "+(i+1)+"° ingreso: ");
            ingreso=lectura.nextDouble();
            aingresos[i]=ingreso;
    }
    //proceso
    ingreso=0.0;
    sueldos=0.0;
    ingresop=0.0;
    ingresom=0.0;
        for ( i = 0; i < n; i++) {
            if (aingresos[i]>ingresom) {
                ingresom=aingresos[i];
            }
            sueldos+=aingresos[i];
        }
        ingresop=sueldos/n;
        //salida
        System.out.println("El ingreso mayor es: "+ ingresom);
        System.out.println("El promedio de ingresos es: "+ ingresop);
    }
}
