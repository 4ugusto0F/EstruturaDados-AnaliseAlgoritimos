
    void main() {
        ListaLigada lista = new ListaLigada();
        lista.adicionar(1);
        lista.adicionar(2);
        lista.adicionar(3);
        lista.adicionar(4);
        lista.adicionar(5);

        lista.imprimir(); // Exibe a lista
        System.out.println("Quantidade de pares: " + lista.qtdePares());
    }
