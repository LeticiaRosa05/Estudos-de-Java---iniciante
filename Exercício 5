import java.util.Locale;
import java.util.Scanner;

/*Implemente um sistema que recebe a região do
usuário e o valor da sua compra e informa quanto
ele irá pagar.

descontos:
• Compras até R$ 100,00 – 5% de desconto.
• Compras até R$ 399,00 – 15% de desconto
• Compras acima de R$ 399,00 10% e Frete Grátis.

frete:
Norte e Nordeste = R$ 19,90.
Sul e Suldeste = R$ 9,90
Centro-Oeste = 14,50*/

public class Desconto_por_regiao {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US); //usar ponto em vez de vírgula nos inputs
        Scanner ler = new Scanner(System.in);
        double compra, frete = 0, valorFinal;
        int reg;

        System.out.println("Qual sua região?");

        do{

            System.out.println("Digite:\n1 para Norte ou Nordeste\n2 para Sul ou Sudeste\n3 para Centro-Oeste");
            reg = ler.nextInt();

            switch (reg) {
                case 1:
                    frete = 19.90;
                    System.out.println("Frete = "+frete+"\n");
                    break;
                case 2:
                    frete = 9.90;
                    System.out.println("Frete = "+frete+"\n");
                    break;
                case 3:
                    frete = 14.50;
                    System.out.println("Frete = "+frete+"\n");
                    break;
                default:
                    System.out.println("\nPor favor, digite uma região válida.\n");
                    break;
            }
        } while(reg != 1 && reg != 2 && reg != 3);

        System.out.print("insira o valor da sua compra: ");
        compra = ler.nextDouble();

        if (compra <= 100){
            compra -= 0.05*compra;
            System.out.println("Desconto de 5% em compras até 100,00 reais.");
        } else if (compra <= 399){
            compra -= 0.15*compra;
            System.out.println("Desconto de 15% em compras até 399,00 reais.");
        } else if (compra > 399){
            compra -= 0.10*compra;
            frete = 0;
            System.out.println("A partir de 399,00 reais, o desconto é de 10% e o frete é grátis!!");
        }

        valorFinal = compra + frete;
        System.out.println("Você irá pagar R$"+valorFinal+" no total.");

        ler.close();
    }
}
