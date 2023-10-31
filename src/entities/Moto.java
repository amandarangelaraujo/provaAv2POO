package entities;

public class Moto extends Veiculo {
    protected String tipoMoto;

    public Moto(double precoCompra, int kmRodados, String tipoMoto) {
        super(precoCompra, kmRodados);
        this.tipoMoto = tipoMoto;
    }

    public String getTipoMoto() {
        return tipoMoto;
    }

    public void setTipoMoto(String tipoMoto) {
        this.tipoMoto = tipoMoto;
    }
    
    
}
