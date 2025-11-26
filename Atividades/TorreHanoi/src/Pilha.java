public class Pilha {
    private int[] elementos;
    private int topo;
    private int capacidade;

    public Pilha(int capacidade) {
        this.capacidade = capacidade;
        this.elementos = new int[capacidade];
        this.topo = -1;
    }

    public void push(int elemento) {
        if (topo < capacidade - 1) {
            topo++;
            elementos[topo] = elemento;
        } else {
            System.out.println("Pilha cheia, não é possível adicionar mais elementos.");
        }
    }

    public int pop() {
        if (!isEmpty()) {
            int elemento = elementos[topo];
            topo--;
            return elemento;
        } else {
            System.out.println("Pilha vazia, não é possível remover elementos.");
            return -1;
        }
    }

    public int peek() {
        if (!isEmpty()) {
            return elementos[topo];
        } else {
            System.out.println("Pilha vazia, não há elemento no topo.");
            return -1;
        }
    }

    public boolean isEmpty() {
        return topo == -1;
    }

    public int size() {
        return topo + 1;
    }

    public int get(int index) {
        if (index >= 0 && index <= topo) {
            return elementos[index];
        } else {
            throw new IndexOutOfBoundsException("Índice fora dos limites da pilha.");
        }
    }

}
