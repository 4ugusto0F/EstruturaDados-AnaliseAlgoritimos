
    void main() {
        // Teste com os parametros do professor
        Pilha P = new Pilha();
        Fila F = new Fila();

        P.push(5);
        P.push(3);
        int x = P.pop();
        F.insert(x);
        F.insert(2);
        P.push(2);
        P.push(8);
        P.pop();
        P.push(9);
        P.push(1);
        F.insert(1);
        P.push(7);
        P.push(6);
        F.insert(P.pop());
        F.remove();
        P.pop();

        // Imprimir fila
        System.out.print("Fila F: [Frente -> tras]: ");
        No atual = F.primeiro;
        while (atual != null) {
            System.out.print(atual.dado + " ");
            atual = atual.next;
        }

        // Imprimir pilha
        System.out.print("\nPilha P [topo -> base]: ");
        atual = P.topo;
        while (atual != null) {
            System.out.print(atual.dado + " ");
            atual = atual.next;
        }
    }

