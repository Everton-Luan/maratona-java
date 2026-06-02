package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais04 {
    public static void main(String[] args) {
        double salarioAnual = 70000;
        double primeiraTaxa = 9.70/100;
        double segundaTaxa = 37.35/100;
        double terceiraTaxa = 49.50/100;
        double valorImposto;

        if(salarioAnual < 34713){
            valorImposto = salarioAnual * primeiraTaxa;
        }else if(salarioAnual >= 34713 && salarioAnual < 68508){
            valorImposto = salarioAnual * segundaTaxa;
        }else{
            valorImposto = salarioAnual * terceiraTaxa;
        }

        System.out.println(valorImposto);
    }
}
