package model;

public class Caminhao extends VeiculoAutomotor {

    public static final double TAXA_VALOR_MERCADO = 0.02;
    public static final double TAXA_QUANTIDADE_EIXOS = 50;

    private int quantidadeEixos;

    public Caminhao(String modelo, double valormercado, int anoFabricacao, int quantidadeEixos) {
        super(modelo, valormercado, anoFabricacao);
        this.quantidadeEixos = quantidadeEixos;
    }

    public int getQuantidadeEixos() {
        return quantidadeEixos;
    }

    public void setQuantidadeEixos(int quantidadeEixos) {
        this.quantidadeEixos = quantidadeEixos;
    }

    @Override
    public double calcularValorPremio() {
        return valorPremio();
    }

    private double valorPremio() {
        return (getValorMercado() * TAXA_VALOR_MERCADO) + (TAXA_QUANTIDADE_EIXOS * getQuantidadeEixos());
    }

    @Override
    public String descrever() {
        return String.format("Caminhão com %d eixos, avaliado em R$%.2f",
                getQuantidadeEixos(), getValorMercado());
    }
}
