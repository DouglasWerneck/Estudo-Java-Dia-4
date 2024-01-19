import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print("Digite o nome do produto: ");
        Scanner input = new Scanner(System.in);
        String nomeDoProduto = input.next().toLowerCase();

        switch (nomeDoProduto){
            case "banana" : System.out.print("R$ 9,80");
            break;
            case "manga" : System.out.print("R$ 10,00");
            break;
            case "uva" : System.out.print("R$ 14,80");
            break;
            case "abacate" : System.out.print("R$ 16,10");
            
        }
        input.close();
    }
}