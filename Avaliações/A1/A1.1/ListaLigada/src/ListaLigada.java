public class ListaLigada {
    private No head;  // início da lista

    //Contrutorzin
    public ListaLigada() {
        this.head = null;
    }

    // Metodo para adicionar elemento na lista
    public void adicionar(int valor) {
        No novoNo = new No(valor);
        if (head == null) {
            head = novoNo;
        } else {
            No atual = head;
            while (atual.getNext() != null) {
                atual = atual.getNext();
            }
            atual.setNext(novoNo);
        }
    }

    // Metodo para calcular quantidade de pares
    public int qtdePares() {
        int contador = 0;
        No atual = head;
        while (atual != null) {
            if (atual.getDado() % 2 == 0) {
                contador++;
            }
            atual = atual.getNext();
        }
        return contador;
    }

    // Metodo para imprimir a lista
    public void imprimir() {
        No atual = head;
        while (atual != null) {
            System.out.print(atual.getDado() + " -> ");
            atual = atual.getNext();
        }
        System.out.println("null");
    }
}