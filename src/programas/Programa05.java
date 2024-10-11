package programas;
import java.util.Scanner;
public class Programa05 {
    public static void main(String[] args) {
    //declarar variables
    int i,j,k,numeroa,numerob;
    int[] a=new int[5];
    int[] b=new int[5];
    Scanner lectura=new Scanner(System.in);
    //entrada
        for (i = 0; i < a.length; i++) {
        System.out.print("Ingresar número " +(i+1)+" para los valores de a:");
        numeroa=lectura.nextInt();
        a[i]=numeroa;
        }
        for (j = 0; j < b.length; j++) {
        System.out.print("Ingresar número " +(j+1)+" para los valores de b:");
        numerob=lectura.nextInt();
        b[j]=numerob;
        }
        //salida 
        int[]c= 
        {a[0],b[0],a[1],b[1],a[2],b[2],a[3],b[3],a[4],b[4]};
        for ( k = 0; k < c.length; k++) {
            System.out.print(c[k]+" ");
        }
    }
}