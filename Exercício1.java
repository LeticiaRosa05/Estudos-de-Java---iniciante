import java.util.Scanner; //biblioteca que permite o uso do scanner
 
//objetivos do código
//declarar a classe scanner; pedir ao usuário seu nome, idade e cidade natal; armarzenar as info em variáveis; printar uma introdução do usuário com as info pedidas.

public class App {
    public static void main(String[] args) throws Exception {

    //declarando a classe scanner
    Scanner in = new Scanner(System.in); //declaração do scanner. O scanner serve para pegar um input e armazená-lo em uma varável
    
    //pedir pro usuario informar:
        //nome
        System.out.println("Your name,  please:  ");
        String nome = in.next();
        //idade
        System.out.println("Your age,  please:  ");
        int idade = in.nextInt();
        //cidade
        System.out.println("Your hometown,  please:  ");
        String cidade = in.next();
    
    System.out.print("Ola. Meu nome e "+nome+", tenho "+idade+" anos, sou natural de "+cidade+" e estou aprendendo Java. Acredito que vou conseguir ir bem :)");
    in.close(); //ao usar um scanner, deve-se encerrá-lo ao final do programa utilizando nomeDoScanner.close()
    }
}
