package entities;

public class Carro extends Veiculo {

    protected int quantidadePortas;
    

    public Carro(double precoCompra, int kmRodados, int quantidadePortas) {
        super(precoCompra, kmRodados);
        if(quantidadePortas<2){
            this.quantidadePortas = 2;
        }
        else{
            this.quantidadePortas = quantidadePortas;
        }
    }

    public int getQuantidadePortas() {
        return quantidadePortas;
    }

    public void setQuantidadePortas(int quantidadePortas) {
        this.quantidadePortas = quantidadePortas;
    }
    

    
}
