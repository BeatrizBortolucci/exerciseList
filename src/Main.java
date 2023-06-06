import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Exercises ex = new Exercises();
        Scanner input = new Scanner(System.in);

        //exercício 1
        System.out.println("Digite anos: ");
        int anos = input.nextInt();
        input.nextLine();
        System.out.println("Digite meses: ");
        int meses = input.nextInt();
        input.nextLine();
        System.out.println("Digite dias: ");
        int dias = input.nextInt();
        input.nextLine();

        System.out.println(ex.lerIdade(anos, meses, dias) + " dias totais!");

        //exercício 2
        System.out.println(ex.mediaAritmetica());

        //exercício 3
        System.out.println("Digite o saldo: ");
        double saldo = input.nextDouble();
        input.nextLine();

        System.out.println(ex.reajusteSaldo(saldo));

        //exercício 4
        System.out.println("Digite a porcentagem de IPI: ");
        double ipi = input.nextDouble();
        input.nextLine();

        System.out.println("Digite o código da peça 1: ");
        int cod1 = input.nextInt();
        input.nextLine();

        System.out.println("Digite o valor da peça 1: ");
        double valor1 = input.nextDouble();
        input.nextLine();

        System.out.println("Digite a quantidade de peças 1: ");
        int quant1 = input.nextInt();
        input.nextLine();

        System.out.println("Digite o código da peça 2: ");
        int cod2 = input.nextInt();
        input.nextLine();

        System.out.println("Digite o valor da peça 2: ");
        double valor2 = input.nextDouble();
        input.nextLine();

        System.out.println("Digite a quantidade de peças 2: ");
        int quant2 = input.nextInt();


        System.out.println("Valor Total: R$" + ex.valorProdutos(ipi, cod1, valor1, quant1, cod2, valor2, quant2));

        //exercício 5

        System.out.println("Digite o valor do salário: ");
        double sal = input.nextDouble();
        input.nextLine();

        System.out.println(ex.quantSalario(sal) + " salário(s) mínimo(s)!");

        //exercício 6

        System.out.println("Digite um número inteiro: ");
        Integer num = input.nextInt();
        input.nextLine();

        System.out.println(ex.lerNum(num));
    }
}