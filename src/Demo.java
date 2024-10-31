import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<Carros> carro = new ArrayList<Carros>();
        carro.add(new Palho("novo", "branco", 2024));
        carro.add(new Punto("2011", "preto", 2011));
        carro.add(new Corola("novo", "chumbo", 2024));
        carro.add(new Hilux("2024", "cinza", 2024));
        System.out.println(carro);

    }

    private static void imprimirCarros(List<Carros> carros) {

        for (Carros carro : carros) {
            System.out.println("Carro: " + carro.getClass().getSimpleName());
            System.out.println("Modelo: " + carro.getModelo());
            System.out.println("Cor: " + carro.getClass());
            System.out.println("Ano: " + carro.getAno());
            System.out.println();
        }
    }
}
