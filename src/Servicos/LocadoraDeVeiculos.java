package Servicos;

import entities.Carro;
import entities.Moto;
import entities.Veiculo;

public class LocadoraDeVeiculos implements Locadora {
    protected Veiculo[] veiculos;

    public LocadoraDeVeiculos(Veiculo[] veiculos) {
        this.veiculos = veiculos;
    }

    @Override
    public double venderVeiculo(int indiceVetor){
        if(veiculos[indiceVetor] instanceof Carro){
            //downcasting, fazendo um veiculo se tornar um carro
            Carro carro = (Carro) veiculos[indiceVetor] ;
            if(carro.getKmRodados()>15000 && carro.getQuantidadePortas()>2){
                return carro.getPrecoCompra()*140/100;

            }else{
                return carro.getPrecoCompra()*115/100;
            }
        }else{
            //downcasting
            Moto moto = (Moto) veiculos[indiceVetor];
            if(moto.getKmRodados()<8000 || moto.getTipoMoto().equals("ESPORTIVA")){
                return moto.getPrecoCompra()*160/100;
            }
            else{
                return moto.getPrecoCompra()*110/100;
            }
        }  
    }

    public double somaTodos(){
        double valorTotal = 0;
        for (int i = 0; i<veiculos.length; i++){
            valorTotal = valorTotal + venderVeiculo(i);
        }
        return valorTotal;
    }

    @Override
    public double alugarVeiculo(int indiceVetor, int quantidadeDias){
        if (veiculos[indiceVetor] instanceof Carro){
            return quantidadeDias * 120;
        }
        else{
            return quantidadeDias * 65;
        }
    }

    public static void quantidadeCarrosEMotos(Veiculo[] veiculos){
        int quantidadeCarros = 0;
        int quantidadeMotos = 0;
        for (int i = 0; i<veiculos.length; i++){
            if(veiculos[i] instanceof Carro){
                quantidadeCarros++;
            }
            else{
                quantidadeMotos++;
            }
        }
        System.out.println("Quantidade de carros: " + quantidadeCarros);
        System.out.println("Quantidade de motos: " + quantidadeMotos);
    }
}
