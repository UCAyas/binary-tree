public class Main {
    public static void main(String[] args) {
        ArvoreBinaria arvore = new ArvoreBinaria();
        arvore.inserir(30);
        arvore.inserir(40);
        arvore.inserir(10);
        arvore.inserir(20);
        arvore.inserir(70);
        arvore.inserir(50);
        arvore.inserir(60);

        System.out.println("Busca em Ordem:");
        arvore.buscaEmOrdem();
        System.out.println("\nBusca Pré-Ordem:");
        arvore.buscaPreOrdem();
        System.out.println("\nBusca Pós-Ordem:");
        arvore.buscaPosOrdem();
    }
}
