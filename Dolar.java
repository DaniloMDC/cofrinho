package Uninter;


class Dolar extends Moeda {
 public Dolar(double valor) {
     super(valor);
 }

 @Override
 public double converterParaReal() {
     return valor * 6.54; //cotação dolar 19/10/24
 }

 @Override
 public String getTipo() {
     return "Dólar";
 }
}