package programas;
import java.util.Scanner;
public class Programa03 {
    public static void main(String [] args){
    //declarar variables
    int i,n;
    double precio,preciop,preciomay,preciomen,precios;
    Scanner lectura=new Scanner(System.in);
    //entrada
    System.out.print("Ingresar la cantidad de personas: ");
    n=lectura.nextInt();
    double[] aprecios=new double[n];
        for ( i = 0; i < n; i++) {
            System.out.print("Ingrese el valor de compra de la persona "+(i+1)+": ");
            precio=lectura.nextDouble();
            aprecios[i]=precio;
        }
    //proceso
    preciomay=aprecios[0];
    preciomen=aprecios[0];
    precios=0.0;
        for ( i = 0; i < n; i++) {
            if (aprecios[i]>preciomay) {
                preciomay=aprecios[i];
            }
            if (aprecios[i]<preciomen) {
                preciomen=aprecios[i];
            }
            precios+=aprecios[i];
        }
        preciop=precios/n;
        //salida
        System.out.println("La compra mayor es de: "+ preciomay);
        System.out.println("La compra menor es de: "+ preciomen);
        System.out.println("La suma de compras es de: "+ precios);
        System.out.println("El promedio de compras es de: "+ preciop);
    }
}
