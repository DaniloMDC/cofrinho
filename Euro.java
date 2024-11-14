package Uninter;

class Euro extends Moeda {
 public Euro(double valor) {
     super(valor);
 }

 @Override
 public double converterParaReal() {
     return valor * 6.13; // cotação euro 19/10/24
 }

 @Override
 public String getTipo() {
     return "Euro";
 }
}