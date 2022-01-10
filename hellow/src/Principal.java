import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
        System.out.println("Hello world!");
        int[] lista = new int[] {0, 2, 3, 4, 5};

        atividade1(lista);
    }

    public static void atividade1(int[] lista){
        int ausente = -1;
        int n = lista.length;
        System.out.println(n);
        int[] numeros = new int[n+1];
        for(int i = 0; i < n + 1; i++) {
            numeros[i] = i;
            //System.out.println(Arrays.toString(numeros));
        }
        int count = 0;
        for(int j = 0; j < numeros.length; j++){
            for(int k = 0; k < lista.length; k++) {
                if(numeros[j] == lista[k]){
                    numeros[j] = -1;
                }
            }
        }

        for(int l = 0; l < numeros.length; l++){
            if(numeros[l] != -1){
                ausente = l;
            }
        }
        System.out.println(ausente);
    //Scanner scanner = new Scanner(System.in);
    //String linha = scanner.nextLine();

    }
}
