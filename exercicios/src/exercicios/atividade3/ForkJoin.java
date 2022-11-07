package exercicios.atividade3;
import java.util.concurrent.ForkJoinPool;
import java.util.*;

public class ForkJoin {
    public static void main(String[] args) {
        //cria um pool de threads Fork/Join
        ForkJoinPool pool = new ForkJoinPool();
        
        //array que será ordenado
        int[] A = {5, 2, 7, 6, 2, 1, 0, 3, 9, 4};
        
        //imprime o vetor desordenado
        System.out.println("A (desordenado) = " + Arrays.toString(A));
        //***TESTA O QUICKSORT DE HOARE***
        //gera um novo array
        A = new int[]{5, 2, 7, 6, 2, 1, 0, 3, 9, 4};
        //tarefa ForkJoin para ordenar o vetor A
        QuicksortForkJoinHoare quicksortTaskHoare = new QuicksortForkJoinHoare(A);
        //executa a tarefa utilizando o pool
        pool.invoke(quicksortTaskHoare);
        System.out.println("A (ordenado com Quicksort de Hoare) = " +  Arrays.toString(A));
        
    }
}

