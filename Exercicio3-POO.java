import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lista_de_compras_com_preco {

        /*exibir lista de produtos com preço
        O usuário deve escolher seus produtos e quando não quiser mais, o programa calcula o valor total, adiciona os produtos que
        a pessoa escolher  na lista de compras e soma os valores quando terminar. Se der mais que 200, perguntar se quer parcelar*/
    
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        List <String> compras = new ArrayList();
        double soma = 0;
        char option, op;
        
        do{
            System.out.println("Escolha seu produto, digitando:");
            System.out.println("\n0 para celular - R$1500,00,\n1 para notebook - R$3000,00,\n2 para suco - R$2,50,\n3 para caderno - R$18,00,\n4 para caneta - R$1,00\nOu\n5 para encerrar sua compra, imprimir os produtos selecionados e o valor total\n");
            option = ler.next().charAt(0);
            
            switch (option){
                case '0':
                    System.out.println("Celular adicionado à lista.\n");
                    compras.add("celular");
                    soma += 1500;
                    break;
                case '1':
                    System.out.println("Notebook adicionado à lista.\n");
                    compras.add("notebook");
                    soma += 3000;
                    break;
                case '2':
                    System.out.println("Suco adicionado à lista.\n");
                    compras.add("suco");
                    soma += 2.5;
                    break;
                case '3':
                    System.out.println("Caderno adicionado à lista.\n");
                    compras.add("caderno");
                    soma += 18;
                    break;
                case '4':
                    System.out.println("Caneta adicionado à lista.\n");
                    compras.add("caneta");
                    soma += 1;
                    break;
                case '5':
                    break;
                default:
                    System.out.println("Por favor, digite um número dentre os indicados.\n");
                    break;
            }
        } while (option != '5');
        
        op = option;

        if (op == '5'){
            System.out.println("Lista de compras finalizada. Em sua lista, tem "+compras+", e o valor total ficou em "+soma+" reais.");
            if (soma>200){
                System.out.println("Deseja parcelar? S/N");
                String confirm = ler.next();
                if (confirm.equalsIgnoreCase("S")){ //ignoreCase pra não dar erro caso o usuário escreva minúsculo
                    double parcela = soma/3;
                    System.out.println("A compra sera parcelada em 3 prestacoes, sem acrescimo. Valor da parcela: R$"+parcela);
                } else if (confirm.equalsIgnoreCase("N")){
                    System.out.println("Ok. Compra finalizada.");
                }
            }
        } ler.close();
    }
}
