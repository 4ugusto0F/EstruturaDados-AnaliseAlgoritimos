public interface Lista<T> {
    void inserir(T dado);
    void inserir(T dado, int posicao);
    T remover(int posicao);
    T obter(int posicao);
    T getPrimeiro();
    T getUltimo();
    boolean contem(T dado);
    int getTamanho();
    void imprimir();
    void esvaziar();
    boolean estaVazia();
}
