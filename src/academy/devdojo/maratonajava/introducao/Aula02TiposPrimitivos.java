package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        //int,long, double, float, byte, short, boolean, char
        int  idade = 19;
        long numeroGrande = 1000000000;
        double salarioDouble = 2000.50;
        float salarioFloat = 1500.50f;
        byte idadeByte = (byte) 128;
        short idadeShort = 32767;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = '\u4E2D';
        String nome = "Verto";


        //Testando casting
        double testeCastingA = 9.78;
        int a = (int) testeCastingA;
        double testeCastingB = 1500.55;
        float b = (float) testeCastingB;
        int c = (int) 10000000000L;

        System.out.println("Oi meu nome é " + nome);
        System.out.println(a+"   "+b+"   "+c);
    }
}
