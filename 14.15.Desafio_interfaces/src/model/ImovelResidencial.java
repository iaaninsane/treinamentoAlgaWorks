package model;

public class ImovelResidencial implements BemSeguravel {

    public static final double TAXA_VALOR_MERCADO = 0.001;
    public static final double TAXA_AREA_CONSTRUIDA = 0.3;

    private double valorMercado;
    private int areaConstruida;

    public ImovelResidencial(double valorMercado, int areaConstruida) {
        this.valorMercado = valorMercado;
        this.areaConstruida = areaConstruida;
    }

    public double getValorMercado() {
        return valorMercado;
    }

    public void setValorMercado(double valorMercado) {
        this.valorMercado = valorMercado;
    }

    public int getAreaConstruida() {
        return areaConstruida;
    }

    public void setAreaConstruida(int areaConstruida) {
        this.areaConstruida = areaConstruida;
    }

    @Override
    public double calcularValorPremio() {
        return (getValorMercado() * TAXA_VALOR_MERCADO) + (TAXA_AREA_CONSTRUIDA * getAreaConstruida());
    }

    @Override
    public String descrever() {
        return String.format("Imóvel residencial com %dm2 de área construída, avaliado em R$%.2f",
                getAreaConstruida(), getValorMercado());
    }
}
