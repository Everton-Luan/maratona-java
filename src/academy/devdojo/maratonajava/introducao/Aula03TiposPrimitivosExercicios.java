package academy.devdojo.maratonajava.introducao;

/*
Prática

Crie variáveis para os campos descritos a baixo entre <> e imprima a seguinte mensagem:

Eu <nome>, morando no endereço <endereco>, confirmo que recebi o salário de <salario> na data <data>
 */

public class Aula03TiposPrimitivosExercicios {
    public static void main(String[] args) {
        String nome = "Everton";
        String endereco = "Av. Olinda";
        float salario = 2500;
        String dataSalario = "01/11/2025";

        System.out.println("Eu " +nome+", morando no endereço "+endereco+", confirmo que recebi o salário de "+salario+"R$ na data "+ dataSalario);
    }
}
