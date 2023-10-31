package entities;

public abstract class Veiculo {
    protected double precoCompra;
    protected int kmRodados;
    
    public Veiculo() {
    }
    public Veiculo(double precoCompra, int kmRodados) {
        if(precoCompra<30000){
            this.precoCompra = 30000;
        }
        else{
            this.precoCompra = precoCompra;
        }
        if(kmRodados<0){
            this.kmRodados = 0;
        }
        else{
            this.kmRodados = kmRodados;
        }

    }
    public double getPrecoCompra() {
        return precoCompra;
    }
    public void setPrecoCompra(double precoCompra) {
        this.precoCompra = precoCompra;
    }
    public int getKmRodados() {
        return kmRodados;
    }
    public void setKmRodados(int kmRodados) {
        this.kmRodados = kmRodados;
    }
    
}
