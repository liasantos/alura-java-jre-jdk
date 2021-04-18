
public class TestaCondicional2 {

    public static void main(String[] args) {
        System.out.println("testando condicionais");

        int idade = 20;
        //int idade = 16;
        //int quantidadePessoas = 3;
        //int quantidadePessoas = 1;
        //boolean acompanhado = true;
        boolean acompanhado = quantidadePessoas >= 2; //apenas true ou false / expressões booleanas

        //if (idade >= 18 && quantidadePessoas >= 2) { // ambos precisam ser verdade
        //if (idade >= 18 || quantidadePessoas >= 2) { // ou um ou outro precisa ser verdade
        if (idade >= 18 && acompanhado) { //boolean - true / false - não precisa colocar o == true porque já é implicito
            System.out.println("seja bem vindo");
        } else {
            System.out.println("infelizmente você não pode entrar");

        }
    }
}

