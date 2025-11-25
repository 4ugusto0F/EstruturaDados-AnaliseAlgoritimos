public class No {
    private int dado;
    private No next;

    public No(int dado) {
        this.dado = dado;
        this.next = null;
    }

    public No getNext() {
        return next;
    }

    public void setNext(No next) {
        this.next = next;
    }

    public int getDado() {
        return dado;
    }

    public void setDado(int dado) {
        this.dado = dado;
    }
}
