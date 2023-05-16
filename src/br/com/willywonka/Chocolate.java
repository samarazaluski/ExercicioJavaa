package br.com.willywonka;

public class Chocolate extends Produto {

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    private String formato;

    public void mostrarAtributo() {
        System.out.println("O nome do produto é:" + getNome()
                + "/nO preço do produto é" + getPreco() +
                "/nO peso do produto é" + getPeso() +
                "/nO tipo de chocalate" + getTipoChocolate());
    }
    public double calcularPesoTotal(double v){
        double soma = 2.1 + getPeso();
        return 13.1;
    }
}