
public class TextaCaracteres {

    public static void main(String[] args) {
        char letra = 'a'; //apenas um caractere - aspas simples ''
        System.out.println(letra);

        char valor = 66;//ascii
        System.out.println(valor);//B

        valor = (char) (valor + 1); //type cast
        System.out.println(valor);//C

        String palavra = "alura cursos online de tecnologia"; //aspas duplas ""
        System.out.println(palavra);

        palavra = palavra + 2020;//concatena
        System.out.println(palavra);
    }
}
