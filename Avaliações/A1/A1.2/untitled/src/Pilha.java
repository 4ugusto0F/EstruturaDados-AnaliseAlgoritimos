class Pilha {
    No topo; // topo da pilha

    // Inserir elemento no topo da pilha
    void push(int valor) {
        No novoNo = new No(valor);
        novoNo.next = topo;
        topo = novoNo;
    }

    // Remover elemento do topo da pilha ( adicional verificar se não está vazia)
    int pop() {
        if (topo == null) {
            System.out.println("Erro: pilha vazia!");
            return -1;
        }

        int valor = topo.dado;
        topo = topo.next;
        return valor;
    }
}
