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
            Carro carro = (Carro) veiculos[indiceVetor] ;
            if(carro.getKmRodados()>15000 && carro.getQuantidadePortas()>2){
                return carro.getPrecoCompra() + carro.getPrecoCompra()*140/100;

            }else{
                return carro.getPrecoCompra() + carro.getPrecoCompra()*115/100;
            }
        }else{
            Moto moto = (Moto) veiculos[indiceVetor];
            if(moto.getKmRodados()<8000 || moto.getTipoMoto().equals("ESPORTIVA")){
                return moto.getPrecoCompra() + moto.getPrecoCompra()*160/100;
            }
            else{
                return moto.getPrecoCompra() + moto.getPrecoCompra()*110/100;
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
}
