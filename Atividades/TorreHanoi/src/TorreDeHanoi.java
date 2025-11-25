import java.util.Stack;

public class TorreDeHanoi {
    //Torres
    private Stack<Integer> A =  new Stack<>();
    private Stack<Integer> B =  new Stack<>();
    private Stack<Integer> C =  new Stack<>();

    //Limitação par quantidade de discos na torre
    private final Integer LIMITE = 3;
    private int numeroDeMovimentos = 0;
    //Inicializando a torre já com os disco em ordem na primeira torre!
    public TorreDeHanoi(){
        A.push(3);
        A.push(2);
        A.push(1);
        this.numeroDeMovimentos = 0;
        this.imprimir();
    }

 //Metodo que aceita char como entrada, e entra em contato com o metodo interno que move os discos
    public void moverDisco(char origemChar, char destinoChar) {
        Stack<Integer> torreOrigem = getTorreFromChar(origemChar);
        Stack<Integer> torreDestino = getTorreFromChar(destinoChar);

        if (torreOrigem == null || torreDestino == null) {
            System.out.println("Nome de torre inválido. Use A, B ou C.");
            return;
        }

        moverDiscoInterno(torreOrigem, torreDestino);
    }

    private void moverDiscoInterno(Stack<Integer> torreOrigem, Stack<Integer> torreDestino) {
        if( torreOrigem.isEmpty() ){
            System.out.println("A torre de origem está vazia");
            return;
        }
        if ( torreDestino.size() >= LIMITE){
            System.out.println("A torre de destino está cheia");
            return;
        }
        
        if (verificadorDeDisco(torreOrigem, torreDestino)) {
            int temporario = torreOrigem.pop();
            torreDestino.push(temporario);
            System.out.println("\n--- Movimento " + (numeroDeMovimentos + 1) + ": " + getNomeDaTorre(torreOrigem) + " -> " + getNomeDaTorre(torreDestino) + " ---");
            imprimir();
            numeroDeMovimentos++;
            if (Winner()){
                System.out.println("\nVocê finalizou o jogo, parabéns!");
                System.out.println("Movimentos Utilizados: " + numeroDeMovimentos);
            }
        }
        else {
            System.out.println("Movimento inválido: Não pode colocar o disco " + torreOrigem.peek() + " sobre o disco " + torreDestino.peek());
        }
    }

    //Regra que um disco maior não vai em um disco menor
    private boolean verificadorDeDisco(Stack<Integer> torreOrigem, Stack<Integer> torreDestino) {
        if (torreDestino.isEmpty() || torreOrigem.peek() < torreDestino.peek()) {
            return true;
        }
        return false;
    }

    public boolean Winner(){
        return this.A.isEmpty() && this.B.isEmpty();
    }

    public void imprimir(){
        for (int i = 0; i < LIMITE; i++) {
            String torreA = "[ | ]";
            String torreB = "[ | ]";
            String torreC = "[ | ]";

            int indiceA = LIMITE - 1 - i;
            if (indiceA < A.size()) {
                torreA = "[ " + A.get(indiceA) + " ]";
            }
            int indiceB = LIMITE - 1 - i;
            if (indiceB < B.size()) {
                torreB = "[ " + B.get(indiceB) + " ]";
            }
            int indiceC = LIMITE - 1 - i;
            if (indiceC < C.size()) {
                torreC = "[ " + C.get(indiceC) + " ]";
            }
            System.out.println(torreA + " " + torreB + " " + torreC);
        }
        System.out.println("------- ------- -------");
        System.out.println("   A       B       C   ");
        System.out.println("=========================");
    }


    public void Resolvido(){
        moverDisco('A', 'C');
        moverDisco('A', 'B');
        moverDisco('C', 'B');
        moverDisco('A', 'C');
        moverDisco('B', 'A');
        moverDisco('B', 'C');
        moverDisco('A', 'C');
    }

    // Métodos auxiliares privados para tradução
    private Stack<Integer> getTorreFromChar(char nomeTorre) {
        switch (Character.toUpperCase(nomeTorre)) {
            case 'A': return this.A;
            case 'B': return this.B;
            case 'C': return this.C;
            default:  return null;
        }
    }

    private char getNomeDaTorre(Stack<Integer> torre) {
        if (torre == this.A) return 'A';
        if (torre == this.B) return 'B';
        if (torre == this.C) return 'C';
        return '?';
    }
}
