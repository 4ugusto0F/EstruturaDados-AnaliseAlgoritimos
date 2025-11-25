import java.util.Scanner;

void main() {
    Scanner sc = new Scanner(System.in);
    TorreDeHanoi jogo = new TorreDeHanoi();
    System.out.println("Estado Inicial:");
    jogo.imprimir();

    while (jogo.Winner()){
        System.out.println("Digite a torre de origem (A, B ou C):");
        char origem = sc.next().charAt(0);
        System.out.println("Digite a torre de destino (A, B ou C):");
        char destino = sc.next().charAt(0);
        jogo.moverDisco(origem, destino);
    }
    //jogo.Resolvido();
}
