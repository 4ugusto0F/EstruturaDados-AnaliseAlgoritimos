public class ListaEncadeada<T> implements Lista<T> {

    private No<T> primeiro;
    private No<T> ultimo;
    private int tamanho;

    public ListaEncadeada() {
        this.primeiro = null;
        this.ultimo = null;
        this.tamanho = 0;
    }

    private No<T> obterNo(int posicao) {
        No<T> buscador = this.primeiro;
        for (int i = 0; i < posicao; i++) {
            buscador = buscador.getProximo();
        }
        return buscador;
    }

    @Override
    public void esvaziar() {
        this.primeiro = null;
        this.ultimo = null;
        this.tamanho = 0;
    }

    @Override
    public boolean contem(T dado) {
        No<T> buscador = primeiro;
        while (buscador != null) {
            if (buscador.getDado().equals(dado)) {
                return true;
            }
            buscador = buscador.getProximo();
        }
        return false;
    }

    @Override
    public T remover(int posicao) {
        if (estaVazia()) {
            return null;
        }

        T dadoRemovido;

        if (posicao == 0) {
            dadoRemovido = primeiro.getDado();
            primeiro = primeiro.getProximo();
            if (primeiro == null) {
                ultimo = null;
            } else {
                primeiro.setAnterior(null);
            }
        } else if (posicao == tamanho - 1) {
            No<T> noParaRemover = ultimo;
            dadoRemovido = noParaRemover.getDado();
            ultimo = noParaRemover.getAnterior();
            ultimo.setProximo(null);
        } else {
            No<T> noParaRemover = obterNo(posicao);
            dadoRemovido = noParaRemover.getDado();
            No<T> noAnterior = noParaRemover.getAnterior();
            No<T> noProximo = noParaRemover.getProximo();
            noAnterior.setProximo(noProximo);
            noProximo.setAnterior(noAnterior);
        }

        tamanho--;
        return dadoRemovido;
    }

    @Override
    public T obter(int posicao) {
        if (estaVazia()) {
            return null;
        }
        No<T> buscador = obterNo(posicao);
        return buscador.getDado();
    }


    @Override
    public void inserir(T dado) {
        No<T> novoNo = new No<>(dado);
        if (estaVazia()) {
            primeiro = novoNo;
            ultimo = novoNo;
        } else {
            ultimo.setProximo(novoNo);
            novoNo.setAnterior(ultimo);
            ultimo = novoNo;
        }
        tamanho++;
    }
    //Sobrecarga no metodo inserir
    @Override
    public void inserir(T dado, int posicao) {
        No<T> novoNo = new No<>(dado);

        if (estaVazia()) {
            primeiro = novoNo;
            ultimo = novoNo;
        } else if (posicao == 0) {
            novoNo.setProximo(primeiro);
            primeiro.setAnterior(novoNo);
            primeiro = novoNo;
        } else if (posicao == tamanho) {
            ultimo.setProximo(novoNo);
            novoNo.setAnterior(ultimo);
            ultimo = novoNo;
        } else {
            No<T> noLocomovido = obterNo(posicao);
            No<T> noAnterior = noLocomovido.getAnterior();
            
            noAnterior.setProximo(novoNo);
            novoNo.setAnterior(noAnterior);
            novoNo.setProximo(noLocomovido);
            noLocomovido.setAnterior(novoNo);
        }

        tamanho++;
    }

    @Override
    public T getPrimeiro() {
        if (estaVazia()) {
            return null;
        }
        return this.primeiro.getDado();
    }

    @Override
    public T getUltimo() {
        if (estaVazia()) {
            return null;
        }
        return this.ultimo.getDado();
    }

    @Override
    public int getTamanho() {
        return this.tamanho;
    }

    @Override
    public boolean estaVazia() {
        return this.tamanho == 0;
    }

    @Override
    public void imprimir(){
        System.out.println(toString());
    }
    @Override
    public String toString() {
        if (estaVazia()) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder("[");
        No<T> atual = primeiro;
        while (atual != null) {
            sb.append(atual.getDado());
            if (atual.getProximo() != null) {
                sb.append(", ");
            }
            atual = atual.getProximo();
        }
        sb.append("]");
        return sb.toString();
    }
}
