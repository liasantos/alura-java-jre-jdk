
public class TestaConversao {

    public static void main(String[] args){

        double salario = 1270.50;
        int valor = (int) salario; //casting/type cast - forço o double a virar inteiro - conversão
        System.out.println(valor);

        //int guarda ate 2 bilhões
        //passando desse valor usa-se long - 64bits
        long numeroGrande = 132193871283738L;//L no final
        System.out.println(numeroGrande);

        short valorPequeno = 2131;//raro de aparecer
        byte b = 127;//vai aé 127

        double valor1 = 0.2;
        double valor2 = 0.1;
        double total = valor1 + valor2;
        System.out.println(total); //https://0.30000000000000004.com

        float pontoFlutuante = 3.14f; //type cast - converte para float
        System.out.println(pontoFlutuante);
    }
}
