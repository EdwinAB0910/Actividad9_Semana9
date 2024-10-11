package programas;
import java.util.Scanner;
public class Programa04 {
    public static void main(String[] args) {
    //declarar variables
    int i,pos;
    String nbus,mensaje,nombre;
    String[] anombres=new String[5];
    Scanner lectura=new Scanner(System.in);
    //entrada
    for (i = 0; i < anombres.length; i++) {
        System.out.print("Ingresar nombre " +(i+1)+":");
        nombre=lectura.next();
        anombres[i]=nombre;
    }
    System.out.print("Ingresar el nombre a buscar: ");
    nbus=lectura.next();
    //proceso
    mensaje="";
        for ( i = 0; i < anombres.length; i++) {
            if ( nbus.equals(anombres[i])) {
                mensaje="La persona existe";
                pos=i;
                break;
            }else{
                mensaje="La persona no existe";
            }
        }
        //salida
        System.out.println(mensaje);
        System.out.println("La posición del nombre es: "+(i+1)+"°");
    }
}
