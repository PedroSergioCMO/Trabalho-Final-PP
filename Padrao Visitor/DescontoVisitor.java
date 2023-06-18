public class DescontoVisitor implements Visitor {
    @Override
    public void visit(Livro livro) {
        livro.preco *= 0.9; // Aplicar um desconto de 10% no preço do livro
        System.out.println("Desconto de 10% aplicado ao livro: " + livro.getTitulo());
    }

    @Override
    public void visit(DVD dvd) {
        dvd.preco *= 0.8; // Aplicar um desconto de 20% no preço do DVD
        System.out.println("Desconto de 20% aplicado ao DVD: " + dvd.getTitulo());
    }
}
