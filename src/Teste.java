public class Teste {
    public static void main(String[] args) {
        Exercises teste = new Exercises();

        System.out.println(teste.lerIdade(10, 9, 5) + " dias totais!");
        System.out.println(teste.mediaAritmetica());
        System.out.println(teste.reajusteSaldo(5000));
        System.out.println("Valor Total: R$" + teste.valorProdutos(14, 1, 50, 2, 2, 40, 3));
        System.out.println(teste.quantSalario(5000) + " salário(s) mínimo(s)!");
        System.out.println(teste.lerNum(15));


    }
}
