package Uninter;

import java.util.ArrayList;


class Cofrinho {
 private ArrayList<Moeda> moedas;

 public Cofrinho() {
     moedas = new ArrayList<>();
 }

 public void adicionarMoeda(Moeda moeda) {
     moedas.add(moeda);
     System.out.println(moeda.getTipo() + " adicionada.\n");
 }

 public void removerMoeda(double valor, String tipo) {
    Moeda moedaARemover = null;
    
    for (Moeda moeda : moedas) {
    	if (moeda.getValor() == valor && moeda.getTipo().equals(tipo)) {
    		moedaARemover = moeda;
    		break;
    	}
    }
	 
    if (moedaARemover != null) {
    	moedas.remove(moedaARemover);
    	System.out.println(moedaARemover.getTipo()+ " removida.\n");
    }else {
         System.out.println("Moeda não encontrada!\n");
     }
 }

 public void listarMoedas() {
     if (moedas.isEmpty()) {
         System.out.println("Não há moedas no cofrinho.\n");
         return;
     }

     System.out.println("Moedas no cofrinho:");
     for (Moeda moeda : moedas) {
         System.out.println(moeda.getTipo()+" " + String.format("%.2f",moeda.getValor()) +"\n");
     }
 }

 public void calcularTotalEmReais() {
     double total = 0;
     for (Moeda moeda : moedas) {
         total += moeda.converterParaReal();
     }
     System.out.printf("Valor total em Reais: R$ %.2f" , total);
     
 }
}