
import Servicos.LocadoraDeVeiculos;
import entities.Carro;
import entities.Moto;
import entities.Veiculo;

public class App {
    public static void main(String[] args) throws Exception {
        Veiculo[] vetorVeiculos = new Veiculo[4];

        Veiculo carro1 = new Carro(23000, 40000, 3);
        Veiculo carro2 = new Carro(50000, 1000, 5);
        Veiculo moto1 = new Moto(4000, 0, "ESPORTIVA");
        Veiculo moto2 = new Moto(4000, 0, "NORMAL");

        vetorVeiculos[0] = carro1;
        vetorVeiculos[1] = carro2;
        vetorVeiculos[2] = moto1;
        vetorVeiculos[3] = moto2;

        LocadoraDeVeiculos localiza = new LocadoraDeVeiculos(vetorVeiculos);
        System.out.println(localiza.somaTodos());

        System.out.println(carro1.getPrecoCompra());




        //testando o upcasting e o downcasting
        LocadoraDeVeiculos.quantidadeCarrosEMotos(vetorVeiculos);;

        
    }
}
