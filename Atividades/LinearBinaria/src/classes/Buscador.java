package classes;

public class Buscador {
    
    public static int linear(int[] vetor, int valor){
        for(int i =0; i<vetor.length; i++){
            if (vetor[i] == valor) {
                return i;
            }
        }
        return -1;
    }

    public static int binario(int[] vetor, int valor){

        int inicio = 0 ;
        int fim = vetor.length - 1; 

        while (inicio <= fim) {
            int meio = (inicio + fim) / 2;
                        
            if (vetor[meio] == valor) {
                return meio;
            }
            else if (vetor[meio] < valor ) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }
        return -1;
    }
}
