package programas;
import java.util.Scanner;
public class Programa01 {
    public static void main(String[] args) {
    //declarar variables
    int i,n;
    double peso,sp,pp;
    Scanner lectura=new Scanner(System.in);
    //entrada
    System.out.print("Ingresar la cantidad de personas: ");
    n=lectura.nextInt();
    double[] apeso=new double[n];
    
    for (i = 0; i < n; i++) {
        System.out.print("Ingresar el peso de la " +(i+1)+"° persona:");
        peso=lectura.nextDouble();
        apeso[i]=peso;
    }
    //proceso
    sp=0.0;
    pp=0.0;
    for (i = 0; i < n; i++) {
        sp+=apeso[i];    
    }
    pp=sp/n;
    //salida
    System.out.println("El promedio de los pesos es: "+pp);
    }
}
