public abstract class VericuloAutomotor implements BemSeguravel {

    private String modelo;
    private double valormercado;
    private int anoFabricacao;

    public VericuloAutomotor(String modelo, double valormercado, int anoFabricacao) {
        this.modelo = modelo;
        this.valormercado = valormercado;
        this.anoFabricacao = anoFabricacao;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getValormercado() {
        return valormercado;
    }

    public void setValormercado(double valormercado) {
        this.valormercado = valormercado;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

}
