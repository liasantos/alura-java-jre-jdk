
public class TestaSomatoria {
    public static void main(String[] args) {

        int contador = 0;
        int total = 0; //variáveis declaradas fora do laço

        while(contador <= 10) {
            //total = total + contador;
            total += contador;
            contador++;
            System.out.println(total);
        }
        System.out.println("O total é " + total);
    }

}
