/*
autor jhon freddy
Fecha: 2021-07-10
Pedir un número, comprobar si es primo y preguntar si quiere introducir más
 */
import java.util.Scanner;
public class Sueldo{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int count=0;
        System.out.print("Ingrese un numero: ");
        int num=input.nextInt();
        for(int i=2;i<num;i++){
            if(num%i==0){count++;}
        }
        if(num>1&count==0){
            System.out.print("\nNo es un numero primero");
        }
        else{
            System.out.print("\nEs un numero primo.");
        }
    }
}


