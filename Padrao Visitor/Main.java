public class Main {
    public static void main(String[] args) {
        Livro livro = new Livro("Aprendendo Java", 50.0);
        DVD dvd = new DVD("Filme Legal", 100.0);

        DescontoVisitor descontoVisitor = new DescontoVisitor();

        livro.accept(descontoVisitor);
        dvd.accept(descontoVisitor);

        System.out.println("Preço do livro após o desconto: " + livro.getPreco());
        System.out.println("Preço do DVD após o desconto: " + dvd.getPreco());
    }
}
