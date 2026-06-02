package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        // if    if/else    if/else if/else
        int idade = 15;
        boolean isAutorizadoComprarBebida = idade >= 18;

        if (isAutorizadoComprarBebida) {
            System.out.println("Autorizado a comprar bebida alcoólica.");
        }else {
            System.out.println("Não tá liberada a manguaça");
        }

        if (!isAutorizadoComprarBebida) {
            System.out.println("Não tá liberada a manguaça");
        }

        boolean c = false;
        if (c == false) {
            System.out.println("C<UNK>");
        }


    }
}
