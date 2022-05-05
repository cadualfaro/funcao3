/*
Atividade 3

Criar uma função que recebe 3 parâmetros
min
max
passo
A função deve contar de ‘min’ até ‘max’, espaçando a contagem com ‘passo’
 */
package funcao3;
import java.util.Scanner;
public class Funcao3 {
    static void minmax(int a, int b){
       
        for(int i=a;i<b;i=i+2){
           System.out.println(i);
        }
    }
    public static void main(String[] args) {
        Scanner my_scan = new Scanner(System.in);
        
        System.out.print("Digite o valor minimo: ");
        int min = my_scan.nextInt();
        System.out.println("");
        
        System.out.print("Digite o valor maximo: ");
        int max = my_scan.nextInt();
        System.out.println("");
        
        minmax(min,max);
    }
}
        