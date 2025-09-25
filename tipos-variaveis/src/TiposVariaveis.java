public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        double salariaMinimo = 1500.33;

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal; // um tipo de dado que recebe um numero menor, so recebe o valor se fizer um casting para o mesmo tipo.
        

        int numero = 5;
        numero = 10;
        System.out.print(numero);

        final double VALOR_DE_PI = 3.14; //Constantes deve conter a palavra final no começo para seu valor nunca pode ser trocado
        //VALOR_DE_PI = 10.33;

        String meuNome = "Rodrigo";
        boolean V_Or_F = true;
    }
}
