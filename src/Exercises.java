import java.util.ArrayList;
import java.util.List;

public class Exercises {
//Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e
//mostre-a expressa em dias. Leve em consideração o ano com 365 dias e o mês com 30.
//(Ex: 3 anos, 2 meses e 15 dias = 1170 dias.)

    public int lerIdade(int anos, int meses, int dias){
        int diasAnos = anos * 365;
        int diasMeses = meses * 30;
        int diasTotais = diasAnos + diasMeses + dias;

        return diasTotais;
    }
//    Fazer um programa que imprima a média aritmética dos números 8,9 e 7. A média dos
//    números 4, 5 e 6. A soma das duas médias. A média das médias.
    public boolean mediaAritmetica(){
        int combo1 = (8 + 9 + 7) /3;
        int combo2 = (4 + 5 + 6) /3;
        double somaMedias = combo1 + combo2;
        double mediaMedias = somaMedias / 2;
        System.out.println(combo1);
        System.out.println(combo2);
        System.out.println(somaMedias);
        System.out.println(mediaMedias);
        return true;
    }
//    Informar um saldo e imprimir o saldo com reajuste de 1%.
    public double reajusteSaldo(double saldo){
        double reajuste = saldo * 1.01;
        return reajuste;
    }
//    Escrever um algoritmo que lê:
//- a porcentagem do IPI a ser acrescido no valor das peças
//- o código da peça 1, valor unitário da peça 1, quantidade de peças 1
//- o código da peça 2, valor unitário da peça 2, quantidade de peças 2
//O algoritmo deve calcular o valor total a ser pago e apresentar o resultado.
//Fórmula : (valor1*quant1 + valor2*quant2)*(IPI/100 + 1)


    public double valorProdutos(double porcentagemIPI, int cod1, double valor1,
                                int quant1,int cod2, double valor2, int quant2){
        double valorTotal = (valor1 * quant1) + (valor2 * quant2) * (porcentagemIPI/100 + 1);
        return valorTotal;
    }

//    Crie um algoritmo que leia o valor do salário mínimo e o valor do salário de um usuário,
//calcule a quantidade de salários mínimos esse usuário ganha e imprima o resultado.
//(1SM=R$788,00)
    public double quantSalario(double valorSal){

        double qntSal = valorSal / 1320;
        return qntSal;
    }

//    Desenvolva um algoritmo em Java que leia um número inteiro e imprima o seu
//antecessor e seu sucessor.
    public List<Integer> lerNum(Integer num){
        Integer antecessor = num - 1;
        Integer sucessor = num + 1;

        List<Integer> lista = new ArrayList<>();
        lista.add(antecessor);
        lista.add(sucessor);

        return lista;

    }
}
