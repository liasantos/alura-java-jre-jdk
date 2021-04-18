public class TestaEscopo {

    public static void main(String[] args) {
        System.out.println("testando condicionais");

        int idade = 20;
        int quantidadePessoas = 3;
        //boolean acompanhado = quantidadePessoas >= 2;

        /*
        if(quantidadePessoas >= 2) { //início do escopo
            //var não existe
            //var não existe
            boolean acompanhado = true; //var nasce
            //var existe
            //var existe
        } //acaba escopo, var morre
        else { //novo escopo
            //var não existe
            boolean acompanhado = false; //nasce outra var
        }

        náo declarar dentro do if/else
        */

        boolean acompanhado; //nasce a var - declara antes do bloco

        if(quantidadePessoas >= 2) {
            acompanhado = true;
        }else {
            acompanhado = false;
        }

        //if (idade >= 18 && quantidadePessoas >= 2) { // ambos precisam ser verdade
        //if (idade >= 18 || quantidadePessoas >= 2) { // ou um ou outro precisa ser verdade
        if (idade >= 18 && acompanhado) { //boolean - true / false - não precisa colocar o == true porque já é implicito
            System.out.println("seja bem vindo");
        } else {
            System.out.println("infelizmente você não pode entrar");

        }
    }
}
