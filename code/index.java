
/**/
import java.util.Scanner;

public static void name() {

    Scanner scan = new Scanner(System.in);
    int idade, opt;
    String nome;

    system.out.ptintln("Eu sou o programa que guarda dados");
    system.out.ptintln("");
    system.out.ptintln("Vamos começar");
    system.out.ptintln("Qual o seu nome?");
    nome = scan.next();
    system.out.ptintln("E agora me responda qual a sua idade");
    idade = scan.nextInt();

    system.out.ptintln("Então você é o "+nome+" e sua idade é "+idade+"? \n digite 1 para sim ou 2 para não");
    opt=scan.nextInt();
    switch (opt) {
        case 1:
            system.out.println("Certo, programa arquivado");
            break;
        case 2:
            system.out.println("Dados deletados");
            break;
        default:
            system.out.println("Opção inexistente");
            break;
    }
}