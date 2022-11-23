package Amine;

import java.util.Scanner;

public class BinarySearchStrin {
    public static void main(String[] args) {

        String [] lista= {"corral", "amine", "kevin"};
        int posicion = -1;
        String busca;
        Scanner sc =new Scanner(System.in);
        System.out.println("¿que nombre quieres buscar ");
        busca=sc.next();
        
        posicion = buscar(lista, busca);
        
        imprimir(posicion);

    }

    private static void imprimir(int posicion) {
        if (posicion == -1 ) {
            System.out.println("elemento buscas esta");
        }
        else {
            System.out.println("el elemento que estas buscando esta " +posicion);
        }
    }

    private static int buscar(String[] lista, String busca) {
        int posicion = 0;
        for (int i=0;i<lista.length;i++){
            if (busca.equals(lista[i])){
                posicion=i;
            }
        }
        return posicion;
    }
}
