public class ArvoreBinaria {
    No raiz;

    ArvoreBinaria() {
        raiz = null;
    }

    void inserir(int valor) {
        raiz = inserirRec(raiz, valor);
    }

    No inserirRec(No raiz, int valor) {
        if (raiz == null) {
            raiz = new No(valor);
            return raiz;
        }

        if (valor < raiz.valor)
            raiz.esquerda = inserirRec(raiz.esquerda, valor);
        else if (valor > raiz.valor)
            raiz.direita = inserirRec(raiz.direita, valor);

        return raiz;
    }

    void buscaEmOrdem() {
        buscaEmOrdemRec(raiz);
    }

    void buscaEmOrdemRec(No raiz) {
        if (raiz != null) {
            buscaEmOrdemRec(raiz.esquerda);
            System.out.print(raiz.valor + " ");
            buscaEmOrdemRec(raiz.direita);
        }
    }

    void buscaPreOrdem() {
        buscaPreOrdemRec(raiz);
    }

    void buscaPreOrdemRec(No raiz) {
        if (raiz != null) {
            System.out.print(raiz.valor + " ");
            buscaPreOrdemRec(raiz.esquerda);
            buscaPreOrdemRec(raiz.direita);
        }
    }

    void buscaPosOrdem() {
        buscaPosOrdemRec(raiz);
    }

    void buscaPosOrdemRec(No raiz) {
        if (raiz != null) {
            buscaPosOrdemRec(raiz.esquerda);
            buscaPosOrdemRec(raiz.direita);
            System.out.print(raiz.valor + " ");
        }
    }
}
