public class ListaEncadeada<T> implements Lista<T> {

    private No<T> primeiro;
    private No<T> ultimo;
    private int tamanho;

    public ListaEncadeada() {
        this.primeiro = null;
        this.ultimo = null;
        this.tamanho = 0;
    }


    //metodo remover
    public T remover(int posicao){
        //Verificar se está vazia
        if (estaVazia()){
            return null;
        }
        //Remoção caso seja a posição 0
        if (posicao == 0){
            No<T>dadoRemovido=primeiro;
            primeiro=dadoRemovido.getProximo();
            if(primeiro!=null){
                primeiro.setAnterior(null);
            }
            else {
                ultimo=null;
            }
            return dadoRemovido.getDado();
        }
        No<T> noParaRemover = obterNo(posicao);
        T dadoRemovido = noParaRemover.getDado();

        //Remoção caso seja a posição final
        else if(posicao == tamanho-1){
            ultimo = noParaRemover.getAnterior();
            if (ultimo != null) {
                ultimo.setProximo(null);
            }
            return dadoRemovido;
        }
        else {
            No<T> noAnterior = noParaRemover.getAnterior();
            No<T> noProximo = noParaRemover.getProximo();
            noAnterior.setProximo(noProximo);
            noProximo.setAnterior(noAnterior);
            return dadoRemovido;
        }
        tamanho-- ;
    }

    //Metodo obter
    public T obter(int posicao){
        if (estaVazia()){return null;}
        No<T> buscador = obterNo(posicao);
        return buscador.getDado();
    }

    //Metodo de Buscad de No, retorna o no(posição, não apenas o dado)
    private No<T> obterNo(int posicao){
        No<T> buscador = this.primeiro;
        for(int i = 0; i < posicao; i++){
            buscador = buscador.getProximo();
        }
        return buscador;
    }

    @Override
    public void inserir(T elemento) {
        No<T> novoNo = new No<>(elemento);
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
