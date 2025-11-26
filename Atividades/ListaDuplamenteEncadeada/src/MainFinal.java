
    static void main(String[] args) {
        emUmaListaVaziaTamanhoDeveSerZero();
        emUmaListaVaziaPrimeiroDeveSerNulo();
        emUmaListaVaziaUltimoDeveSerNulo();
        aoAdicionarUmElementoTamanhoDeveSerUmEPrimeiroEUltimoCorretos();
        aoAdicionarDoisElementosTamanhoDeveSerDoisEPrimeiroEUltimoCorretos();
        aoAdicionarElementoNoMeioTamanhoDeveSerTresEOrdemCorreta();
        aoInserirNoInicioDeListaNaoVaziaPrimeiroDeveSerAtualizado();
        aoInserirNoFimComPosicaoIgualTamanhoUltimoDeveSerAtualizado();
        aoInserirNoIndiceZeroEmListaVaziaElementoDeveSerPrimeiroEUltimo();
        aoObterElementoDaListaDeveEstarNaPosicaoCorreta();
        aoObterElementoEmListaUnitariaDeveRetornarUnicoElemento();
        aoRemoverElementoEmListaUnitariaListaDeveFicarVazia();
        aoRemoverPrimeiroElementoPrimeiroDeveSerAtualizado();
        aoRemoverUltimoElementoUltimoDeveSerAtualizado();
        aoRemoverElementoNoMeioElementosDevemSerLigadosCorretamente();
        aoImprimirListaComOperacoesDiversasNaoDeveLancarExcecao();
        aoVerificarContemEmListaVaziaDeveRetornarFalse();
        aoVerificarContemComElementosPresentesDeveRetornarTrue();
        aoVerificarContemAposRemocaoDeElementoDeveRetornarFalse();
        aoVerificarContemAposRemoverTodosElementosDeveRetornarFalse();
        aoEsvaziarListaComElementosDeveFicarVazia();
        aoEsvaziarListaPermiteNovasOperacoes();
        System.out.println("Todos os testes passaram!");
    }

    private static void emUmaListaVaziaTamanhoDeveSerZero() {
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();

        if (lista.getTamanho() != 0) {
            throw new AssertionError("Tamanho de uma lista vazia deve ser zero.");
        }

        if (!lista.estaVazia()) {
            throw new AssertionError("Uma lista vazia deve retornar true para estaVazia().");
        }
    }

    private static void emUmaListaVaziaPrimeiroDeveSerNulo() {
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();
        if (lista.getPrimeiro() != null) {
            throw new AssertionError("Obter o primeiro elemento de uma lista vazia deve lançar uma exceção.");
        }
    }

    private static void emUmaListaVaziaUltimoDeveSerNulo() {
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();
        if (lista.getUltimo() != null) {
            throw new AssertionError("Obter o último elemento de uma lista vazia deve lançar uma exceção.");
        }
    }

    private static void aoAdicionarUmElementoTamanhoDeveSerUmEPrimeiroEUltimoCorretos() {
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();
        lista.inserir(10);

        if (lista.getTamanho() != 1) {
            throw new AssertionError("Tamanho da lista deve ser 1 após adicionar um elemento.");
        }

        if (lista.estaVazia()) {
            throw new AssertionError("Uma lista com elementos não deve retornar true para estaVazia().");
        }

        if (lista.getPrimeiro() == null || !lista.getPrimeiro().equals(10)) {
            throw new AssertionError("O primeiro elemento deve ser 10.");
        }

        if (lista.getUltimo() == null || !lista.getUltimo().equals(10)) {
            throw new AssertionError("O último elemento deve ser 10.");
        }
    }

    private static void aoAdicionarDoisElementosTamanhoDeveSerDoisEPrimeiroEUltimoCorretos() {
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();
        lista.inserir(10);
        lista.inserir(45);

        if (lista.getTamanho() != 2) {
            throw new AssertionError("Tamanho da lista deve ser 2 após adicionar 2 elementos.");
        }

        if (lista.estaVazia()) {
            throw new AssertionError("Uma lista com elementos não deve retornar true para estaVazia().");
        }

        if (lista.getPrimeiro() == null || !lista.getPrimeiro().equals(10)) {
            throw new AssertionError("O primeiro elemento deve ser 10.");
        }

        if (lista.getUltimo() == null || !lista.getUltimo().equals(45)) {
            throw new AssertionError("O último elemento deve ser 45.");
        }
    }

    private static void aoAdicionarElementoNoMeioTamanhoDeveSerTresEOrdemCorreta() {
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();
        lista.inserir(10);
        lista.inserir(45);
        lista.inserir(30, 1);

        if (lista.getTamanho() != 3) {
            throw new AssertionError("Tamanho da lista deve ser 3 após adicionar 3 elementos.");
        }

        if (lista.getPrimeiro() == null || !lista.getPrimeiro().equals(10)) {
            throw new AssertionError("O primeiro elemento deve ser 10.");
        }

        if (lista.getUltimo() == null || !lista.getUltimo().equals(45)) {
            throw new AssertionError("O último elemento deve ser 45.");
        }
    }

    private static void aoInserirNoInicioDeListaNaoVaziaPrimeiroDeveSerAtualizado() {
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();
        lista.inserir(20);
        lista.inserir(30);
        lista.inserir(10, 0); // Insere no início

        if (lista.getTamanho() != 3) {
            throw new AssertionError("Tamanho deve ser 3 após inserir no início.");
        }
        if (!lista.getPrimeiro().equals(10)) {
            throw new AssertionError("O primeiro elemento deve ser 10 após inserção no início.");
        }
        if (!lista.getUltimo().equals(30)) {
            throw new AssertionError("O último elemento deve ser 30 após inserção no início.");
        }
    }

    private static void aoInserirNoFimComPosicaoIgualTamanhoUltimoDeveSerAtualizado() {
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();
        lista.inserir(10);
        lista.inserir(20);
        lista.inserir(30, 2); // Insere no fim

        if (lista.getTamanho() != 3) {
            throw new AssertionError("Tamanho deve ser 3 após inserir no fim.");
        }
        if (!lista.getUltimo().equals(30)) {
            throw new AssertionError("O último elemento deve ser 30 após inserção no fim.");
        }
        if (!lista.getPrimeiro().equals(10)) {
            throw new AssertionError("O primeiro elemento deve ser 10 após inserção no fim.");
        }
    }

    private static void aoInserirNoIndiceZeroEmListaVaziaElementoDeveSerPrimeiroEUltimo() {
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();
        lista.inserir(42, 0);
        if (lista.getTamanho() != 1) {
            throw new AssertionError("Tamanho deve ser 1 após inserir no índice 0 em lista vazia.");
        }
        if (!lista.getPrimeiro().equals(42)) {
            throw new AssertionError("O primeiro elemento deve ser 42 após inserção no índice 0 em lista vazia.");
        }
        if (!lista.getUltimo().equals(42)) {
            throw new AssertionError("O último elemento deve ser 42 após inserção no índice 0 em lista vazia.");
        }
        if (lista.estaVazia()) {
            throw new AssertionError("A lista não deve estar vazia após inserção.");
        }
    }

    private static void aoObterElementoDaListaDeveEstarNaPosicaoCorreta() {
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();
        lista.inserir(10);
        lista.inserir(20);
        lista.inserir(30);
        int valor = lista.obter(0);
        if (valor != 10) {
            throw new AssertionError("Obter(0) deve retornar 10.");
        }

        valor = lista.obter(1);
        if (valor != 20) {
            throw new AssertionError("Obter(1) deve retornar 20.");
        }

        valor = lista.obter(2);
        if (valor != 30) {
            throw new AssertionError("Obter(2) deve retornar 30.");
        }
    }

    private static void aoObterElementoEmListaUnitariaDeveRetornarUnicoElemento() {
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();
        lista.inserir(99);
        int valor = lista.obter(0);
        if (valor != 99) {
            throw new AssertionError("Obter(0) em lista unitária deve retornar 99.");
        }
    }

    private static void aoRemoverElementoEmListaUnitariaListaDeveFicarVazia() {
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();
        lista.inserir(42);
        lista.remover(0);
        if (lista.getTamanho() != 0) {
            throw new AssertionError("Após remover o único elemento, tamanho deve ser 0.");
        }
        if (!lista.estaVazia()) {
            throw new AssertionError("Após remover o único elemento, lista deve estar vazia.");
        }
        if (lista.getPrimeiro() != null || lista.getUltimo() != null) {
            throw new AssertionError("Após remover o único elemento, primeiro e último devem ser nulos.");
        }
    }

    private static void aoRemoverPrimeiroElementoPrimeiroDeveSerAtualizado() {
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();
        lista.inserir(10);
        lista.inserir(20);
        lista.inserir(30);
        lista.remover(0);
        if (lista.getTamanho() != 2) {
            throw new AssertionError("Após remover o primeiro, tamanho deve ser 2.");
        }
        if (!lista.getPrimeiro().equals(20)) {
            throw new AssertionError("Após remover o primeiro, o novo primeiro deve ser 20.");
        }
        if (!lista.getUltimo().equals(30)) {
            throw new AssertionError("Após remover o primeiro, o último deve ser 30.");
        }
        // Verifica todos os índices
        if (lista.obter(0) != 20) {
            throw new AssertionError("Após remover o primeiro, elemento na posição 0 deve ser 20.");
        }
        if (lista.obter(1) != 30) {
            throw new AssertionError("Após remover o primeiro, elemento na posição 1 deve ser 30.");
        }
    }

    private static void aoRemoverUltimoElementoUltimoDeveSerAtualizado() {
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();
        lista.inserir(10);
        lista.inserir(20);
        lista.inserir(30);
        lista.remover(2);
        if (lista.getTamanho() != 2) {
            throw new AssertionError("Após remover o último, tamanho deve ser 2.");
        }
        if (!lista.getPrimeiro().equals(10)) {
            throw new AssertionError("Após remover o último, o primeiro deve ser 10.");
        }
        if (!lista.getUltimo().equals(20)) {
            throw new AssertionError("Após remover o último, o novo último deve ser 20.");
        }
        // Verifica todos os índices
        if (lista.obter(0) != 10) {
            throw new AssertionError("Após remover o último, elemento na posição 0 deve ser 10.");
        }
        if (lista.obter(1) != 20) {
            throw new AssertionError("Após remover o último, elemento na posição 1 deve ser 20.");
        }
    }

    private static void aoRemoverElementoNoMeioElementosDevemSerLigadosCorretamente() {
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();
        lista.inserir(10);
        lista.inserir(20);
        lista.inserir(30);
        lista.inserir(40);
        lista.remover(2);
        if (lista.getTamanho() != 3) {
            throw new AssertionError("Após remover do meio, tamanho deve ser 3.");
        }
        if (!lista.getPrimeiro().equals(10)) {
            throw new AssertionError("Após remover do meio, o primeiro deve ser 10.");
        }
        if (!lista.getUltimo().equals(40)) {
            throw new AssertionError("Após remover do meio, o último deve ser 40.");
        }
        // Verifica todos os índices
        if (lista.obter(0) != 10) {
            throw new AssertionError("Após remover do meio, elemento na posição 0 deve ser 10.");
        }
        if (lista.obter(1) != 20) {
            throw new AssertionError("Após remover do meio, elemento na posição 1 deve ser 20.");
        }
        if (lista.obter(2) != 40) {
            throw new AssertionError("Após remover do meio, elemento na posição 2 deve ser 40.");
        }
    }

    private static void aoImprimirListaComOperacoesDiversasNaoDeveLancarExcecao() {
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();
        // Adiciona elementos
        lista.inserir(1);
        lista.inserir(2);
        lista.inserir(3);
        // Remove o segundo elemento (índice 1)
        lista.remover(1); // Lista: 1, 3
        // Adiciona no início
        lista.inserir(0, 0); // Lista: 0, 1, 3
        // Adiciona no fim
        lista.inserir(4, lista.getTamanho()); // Lista: 0, 1, 3, 4
        // Adiciona no meio
        lista.inserir(2, 2); // Lista: 0, 1, 2, 3, 4
        // Remove o primeiro
        lista.remover(0); // Lista: 1, 2, 3, 4
        // Remove o último
        lista.remover(lista.getTamanho() - 1); // Lista: 1, 2, 3
        // Remove do meio
        lista.remover(1); // Lista: 1, 3
        // Confere integridade
        if (lista.getTamanho() != 2) throw new AssertionError("Tamanho final deve ser 2.");
        if (lista.obter(0) != 1) throw new AssertionError("Elemento na posição 0 deve ser 1.");
        if (lista.obter(1) != 3) throw new AssertionError("Elemento na posição 1 deve ser 3.");

        // Testa imprimir
        lista.imprimir();
    }

    private static void aoVerificarContemEmListaVaziaDeveRetornarFalse() {
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();
        if (lista.contem(1)) {
            throw new AssertionError("Lista vazia não deve conter nenhum elemento.");
        }
    }

    private static void aoVerificarContemComElementosPresentesDeveRetornarTrue() {

        ListaEncadeada<Integer> lista = new ListaEncadeada<>();
        lista.inserir(10);
        lista.inserir(20);
        lista.inserir(30);

        if (!lista.contem(10)) {
            throw new AssertionError("Lista deve conter 10.");
        }

        if (!lista.contem(20)) {
            throw new AssertionError("Lista deve conter 20.");
        }

        if (!lista.contem(30)) {
            throw new AssertionError("Lista deve conter 30.");
        }

        if (lista.contem(40)) {
            throw new AssertionError("Lista não deve conter 40.");
        }
    }

    private static void aoVerificarContemAposRemocaoDeElementoDeveRetornarFalse() {
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();
        lista.inserir(10);
        lista.inserir(20);
        lista.inserir(30);
        lista.remover(1); // Remove 20
        if (lista.contem(20)) {
            throw new AssertionError("Lista não deve conter 20 após remoção.");
        }
    }

    private static void aoVerificarContemAposRemoverTodosElementosDeveRetornarFalse() {
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();
        lista.inserir(10);
        lista.inserir(20);
        lista.inserir(30);
        lista.remover(0); // Remove 10
        lista.remover(0); // Remove 20
        lista.remover(0); // Remove 30
        if (lista.contem(10) || lista.contem(20) || lista.contem(30)) {
            throw new AssertionError("Lista não deve conter elementos após remoção de todos.");
        }
    }

    private static void aoEsvaziarListaComElementosDeveFicarVazia() {
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();
        lista.inserir(1);
        lista.inserir(2);
        lista.inserir(3);
        lista.esvaziar();
        if (!lista.estaVazia()) {
            throw new AssertionError("Lista deve estar vazia após esvaziar.");
        }
        if (lista.getTamanho() != 0) {
            throw new AssertionError("Tamanho deve ser 0 após esvaziar.");
        }
        if (lista.getPrimeiro() != null || lista.getUltimo() != null) {
            throw new AssertionError("Primeiro e último devem ser nulos após esvaziar.");
        }
    }

    private static void aoEsvaziarListaPermiteNovasOperacoes() {
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();
        lista.inserir(5);
        lista.inserir(6);
        lista.esvaziar();
        lista.inserir(7);
        if (lista.getTamanho() != 1) {
            throw new AssertionError("Após esvaziar e inserir, tamanho deve ser 1.");
        }
        if (!lista.getPrimeiro().equals(7) || !lista.getUltimo().equals(7)) {
            throw new AssertionError("Após esvaziar e inserir, primeiro e último devem ser 7.");
        }
    }
