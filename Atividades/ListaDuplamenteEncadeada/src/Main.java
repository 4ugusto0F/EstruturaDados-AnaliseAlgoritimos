public class Main {

    public static void main(String[] args) {
        emUmaListaVaziaTamanhoDeveSerZero();
        emUmaListaVaziaPrimeiroDeveSerNulo();
        emUmaListaVaziaUltimoDeveSerNulo();
        System.out.println("Todos os testes passaram!");
    }

    private static void emUmaListaVaziaTamanhoDeveSerZero() {
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();

        if (lista.getTamanho() != 0) {
            throw new AssertionError("Tamanho de uma lista vazia deve ser zero.");
        }

        if (!lista.estaVazia()) {
            throw new AssertionError("Uma lista vazia deve retornar true para estaVazia().");
        }
    }

    private static void emUmaListaVaziaPrimeiroDeveSerNulo() {
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();
        if (lista.getPrimeiro() != null) {
            throw new AssertionError("Obter o primeiro elemento de uma lista vazia deve lançar uma exceção.");
        }
    }

    private static void emUmaListaVaziaUltimoDeveSerNulo() {
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();
        if (lista.getUltimo() != null) {
            throw new AssertionError("Obter o último elemento de uma lista vazia deve lançar uma exceção.");
        }
    }
}