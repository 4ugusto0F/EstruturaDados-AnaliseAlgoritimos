package application;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*   
        
        
        
        
        RESPOSTAS DAS PERGUNTAS NO README ( APAGUE ESTE COMENTARIO APÓS VER! )






        */
        //Decidindo o tamanho do vetor
        System.out.println("Tamanho do Vetor \n[1] - 1.000.000 \n[2] - 10.000.000 \n[3] Quero informar um valor proprio");
        int tamVetor = sc.nextInt(); sc.nextLine();
        if ( tamVetor == 1 ) {
            tamVetor = 1000000;
        }
        else if(tamVetor == 2 ){ 
            tamVetor = 10000000;
        }
        else{
            System.out.print("\nQual e o tamanho: ");
            tamVetor = sc.nextInt(); sc.nextLine();
        }
        // Vetor com o tamanho decidido, preenchendo de 0 até o limite solicitado
        int[] vetor = new int[tamVetor];
        for (int i = 0; i <vetor.length; i++) {
            vetor[i] = i;
        }
        //Escolhendo o alvo
        System.out.println("\nQuer escolher um alvo? \n[S] sim [N] não");
        String resposta = sc.nextLine();
        char decisãoAlvo = Character.toLowerCase(resposta.charAt(0));
        int alvo;
        if (decisãoAlvo == 's') {
            System.out.print("\nQual numero sera o alvo: ");
            alvo = sc.nextInt(); sc.nextLine();
            //Testando se o alvo e maior que o vetor!
            if (alvo>(vetor.length-1)) {
                System.out.println("Error alvo maior que o vetor!!!!");
                System.exit(0);
            }
        }
        else  {
            alvo = tamVetor - 1;
            System.out.println("\nO alvo sera o "+ (tamVetor-1) + ", este e o ultimo item da lista/vetor");
        }
        //Escolhendo o tipo de buscador
        System.out.println("\nQual tipo de busca você deseja testar \n[1] Linear \n[2] Binario \n[3] Ambos");
        int tipoDeBuscador = sc.nextInt();
        if (tipoDeBuscador == 1) {
            long inicio = System.nanoTime();
            int resultado = classes.Buscador.linear(vetor, alvo);
            long fim  = System.nanoTime();
            long tempoDeExecução = fim - inicio ;
            //Teste em execução
            if (resultado != -1) {
                System.out.println("\n\nAlvo: "+alvo+"\nEncontrado na posição: "+ resultado+"\nTempo de execução: "+tempoDeExecução+" nanosegundos");
            }
            else{
                System.out.println("\n\nAlvo: "+alvo+" não encontrado");
            }

        }
        else if (tipoDeBuscador == 2) {
            long inicio = System.nanoTime();
            int resultado = classes.Buscador.binario(vetor, alvo);
            long fim  = System.nanoTime();
            long tempoDeExecução = fim - inicio ;
            //Teste em execução
            if (resultado != -1) {
                System.out.println("\n\nAlvo: "+alvo+"\nEncontrado na posição: "+ resultado+"\nTempo de execução: "+tempoDeExecução+" nanosegundos");
            }
            else{
                System.out.println("\n\nAlvo: "+alvo+" não encontrado");
            }
        }
        else {
            
            long inicioL = System.nanoTime();
            int resultadoL = classes.Buscador.linear(vetor, alvo);
            long fimL  = System.nanoTime();
            long tempoDeExecuçãoL = fimL - inicioL ;

            long inicioB = System.nanoTime();
            int resultadoB = classes.Buscador.binario(vetor, alvo);
            long fimB  = System.nanoTime();
            long tempoDeExecuçãoB = fimB - inicioB ;
            
            if (resultadoL != -1 && resultadoB != -1) {
                System.out.println("\n\nAlvo: "+alvo+"\n\nEncontrado nas posições: \n["+resultadoL+" - Linear]\n["+resultadoB+" - Binario]\n\nTempo de execução: \n["+tempoDeExecuçãoL+" nanosegundos - Linear]\n["+tempoDeExecuçãoB+" nanossegundos - Binario]");
            }
            else{
                System.out.println("\n\nAlvo: "+alvo+" não encontrado");
            }
        }


        sc.close();
    }
}