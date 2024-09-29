import java.util.Scanner;

/*pedir um login(nome) e uma senha(sequência numérica), pedir confimação e verificar se estão corretos.
Caso não estejam, serão pedidos novamente até que passem pela verificação*/

public class LoginESenha {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.print("Login(seu nome): ");
        String login = ler.next();
        System.out.print("Senha(sequência numérica): ");
        int senha = ler.nextInt();

        System.out.println("Login e senha definidos. Por favor, digite-os novamente para verificação.\n");
        System.out.print("Digite seu login: ");
        String VerLogin = ler.next(); //Ver de verificador
        System.out.print("Digite sua senha: ");
        int VerSenha = ler.nextInt();

        if (VerLogin.equals(login) && VerSenha == senha){

            System.out.println("Login e senha verificados.");
            
        } else if (!VerLogin.equals(login) || VerSenha != senha){

            System.out.println("Login ou senha incorretos.");

            do{
                System.out.println("Tente novamente.\n");
                System.out.print("Login: ");
                VerLogin = ler.next();
                System.out.print("Senha: ");
                VerSenha = ler.nextInt();
            } while (!VerLogin.equals(login) || VerSenha != senha);

            System.out.println("Login e senha verificados."); /*se o código sair do while, significa que as info
                                                                estão corretas. Logo, a mensagem é impressa*/
            
        }
        ler.close();
    }
}
