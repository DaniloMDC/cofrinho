package Uninter;

abstract class Moeda {
    protected double valor;

    public Moeda(double valor) {
        this.valor = valor;
    }

    public abstract double converterParaReal();

    public double getValor() {
        return valor;
    }

    public abstract String getTipo();
}