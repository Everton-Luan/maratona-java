package academy.devdojo.maratonajava.introducao;

import org.w3c.dom.ls.LSOutput;

public class Aula04Operadores {
    public static void main(String[] args) {
        int num01 = 10;
        int num02 = 20;

        //Operadores aritméticos: + - / * %
        System.out.println("Valor: "+(num01+num02));

        //Operadores relacionais: < > <= >= == !=
        System.out.print(num01 == num02);

        //Operadores lógicos: &&(And) ||(Or) ^(Xor) !(Diferent)
        int idade = 17;
        float saldo = 3500f;
        boolean cnh = (idade >= 18 && saldo >= 3500);
        System.out.println("\nApto para tirar cnh? "+cnh);
        idade++;
        cnh = (idade >= 18 && saldo >= 3500);
        System.out.println("Apto para tirar cnh? "+cnh);

        float saldoDebito = 1500f;
        float saldoCredito = 8000f;
        float ps5Preco = 5000f;
        boolean daPaCompra = ((saldoDebito > ps5Preco) || (saldoCredito > ps5Preco));

        System.out.println("Dá pra comprar o ps5? "+daPaCompra);

        //Operadores de atribuição: = += -= *= /= %=
        int bonus = 1000;
        System.out.println("Bonus: "+bonus);
        bonus += 500; // bonus = bonus + 500
        System.out.println("Bonus: "+bonus);

        //++ --
        int contador = 0;
        System.out.println("Contador: "+(contador++)+" | "+(++contador));
    }
}
