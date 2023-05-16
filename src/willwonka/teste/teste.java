package willwonka.teste;

import br.com.willywonka.Chocolate;

import java.util.Arrays;

public class teste {
    public static void main(String[] args) {

        Chocolate chocolate = new Chocolate();

        chocolate.setFormato("Deliciosa boliha de chocolate");
        chocolate.setPreco(200);
        chocolate.setPeso(11.4);
        chocolate.setTipoChocolate("Amargo");
        chocolate.setFormato("Bolinha");

        chocolate.mostrarAtributo();

        System.out.println("A soma do peso do produto mais a soma do peso da embalagem" + chocolate.calcularPesoTotal(2.1));


    }
}
