public interface Lista<T> {
    void inserir(T elemento);
    // void inserir(T elemento, int posicao);
    T remover(int posicao);
    T obter(int posicao);
    T getPrimeiro();
    T getUltimo();
    // boolean contem(T elemento);
    int getTamanho();
    // void imprimir();
    // void esvaziar();
    boolean estaVazia();
}
