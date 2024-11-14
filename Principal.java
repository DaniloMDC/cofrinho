package Uninter;

import java.util.Scanner;

public class Principal {
	
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     Cofrinho cofrinho = new Cofrinho();

     while (true) {
    	 
         System.out.println("COFRINHO:");
         System.out.println("1.Adicionar");
         System.out.println("2.Remover");
         System.out.println("3.Listar");
         System.out.println("4.Calcular TOTAL em Reais");
         System.out.println("0.Encerrar");

         int opcao = scanner.nextInt();
         if (opcao == 0)
         	 break;
         
//pesquisado no w3school e documentação java oficial
         switch (opcao) {
             case 1:
                 System.out.println("Escolha a moeda:");
                 System.out.println("1.Dólar");
                 System.out.println("2.Euro");
                 System.out.println("3.Real");
                 
                 int tipo = scanner.nextInt();
                 
                 System.out.println("Digite o valor: ");
                 double valor = scanner.nextDouble();

                 switch (tipo) {
                     case 1 -> cofrinho.adicionarMoeda(new Dolar(valor));
                     
                     case 2 -> cofrinho.adicionarMoeda(new Euro(valor));
                     
                     case 3 -> cofrinho.adicionarMoeda(new Real(valor));
                     
                     default -> System.out.println("Moeda inválido.");
                 }
                 break;
                 
             case 2:
                 System.out.println("Digite o valor da moeda para remover: ");
                 valor = scanner.nextDouble();
                 System.out.println("Digite o tipo da moeda/n (Dólar,Euro ou Real)");
                 String tipoMoeda = scanner.next();
                 
                 cofrinho.removerMoeda(valor, tipoMoeda);
                 break;
                             
             case 3:
                 cofrinho.listarMoedas();
                 break;
                 
             case 4:
                 cofrinho.calcularTotalEmReais();
                 break;
                 
             default:
                 System.out.println("Opção inválida.");
         }
     }
     
     System.out.println("Sistema Cofrinho Encerrado.");
     
     scanner.close();
 }
}