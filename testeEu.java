import java.util.Scanner;

public class testeEu {

    public static void main(String[] args) {
        Scanner tecl = new Scanner(System.in);
        System.out.println("Escolha com sabedoria ");
        escolha();
    }

    public static void escolha() {
        Scanner tec = new Scanner(System.in);
        System.out.println("1° desistir do amor ");
        int P = tec.nextInt();
        System.out.println("2° amar mas com medo ");
        int S = tec.nextInt();
        System.out.println("3° ficar sozinho ");
        int T = tec.nextInt();
        System.out.println("4° não amar mais");
        int Q = tec.nextInt();

        switch (P) {
            case 1:
                System.out.println(P + " essa é sua escolha, não vou me intrometer.");
                break;
            case 2:
                System.out.println("Corajoso, respeito isso em você.");
                break;
            case 3:
                System.out.println("Não é uma má ideia, mas tudo tem seu preço.");
                break;
            case 4:
                System.out.println("Às vezes, é a melhor escolha.");
                break;
            default:
                System.out.println("Opção inválida.");
        }
    }
}
