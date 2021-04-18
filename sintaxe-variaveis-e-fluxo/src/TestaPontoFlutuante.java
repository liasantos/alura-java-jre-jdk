
public class TestaPontoFlutuante {

    public static void main(String[] args) {

        double salario;
        salario = 1250.70;
        System.out.println("meu salário é " + salario);

        double divisao = 3.14 / 2;
        System.out.println(divisao);

        int outraDivisao = 5 / 2;
        System.out.println(outraDivisao); //inteiro sempre terá resultado inteiro

        double segundaTentativa = 5 / 2; //lê da direita pra esquerda, inteiros primeiro, atribuição depois
        System.out.println(segundaTentativa);//imprime somente o inteiro

        double terceiraTentativa = 5.0 / 2; //basta que um numero seja flutuante e ele já lê como double
        System.out.println(terceiraTentativa); //imprime double

    }
}
