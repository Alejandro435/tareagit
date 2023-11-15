/*
 9. Realiza un programa que nos diga cuántos dígitos tiene un número introducido por teclado.
 */
import java.util.Scanner;
public class conteodigitos {
public static void main (String [] args){

    Scanner teclado = new Scanner(System.in);
    System.out.println("dime tu nombre");
    String nombre = teclado.nextLine();
    System.out.println("tu nombre es " + nombre);
    System.out.println("dime un número");
    int numero = teclado.nextInt();
    int cont = 0;
    System.out.println(numero);
while(numero>0)
{
    numero= numero/10;
    cont++;
}

    System.out.println("el numero de digitos es " + cont);













 }    
}
