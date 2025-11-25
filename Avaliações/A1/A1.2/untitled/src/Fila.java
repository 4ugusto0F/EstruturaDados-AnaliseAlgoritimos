class Fila {
    No primeiro;
    No ultimo;

    // Inserir elemento no final da fila ( adicional verificar se a fila esta vazia, começo  e fim )
    void insert(int valor) {
        No novoNo = new No(valor);
        if (ultimo != null) {
            ultimo.next = novoNo;
        } else {
            primeiro = novoNo;
        }
        ultimo = novoNo;
    }

    // Remover elemento do início da fila
    int remove() {
        int valor = primeiro.dado;
        primeiro = primeiro.next;
        if (primeiro == null) {
            ultimo = null;
        }
        return valor;
    }
}