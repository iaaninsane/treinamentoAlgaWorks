package model;

public class CarroParticular extends VeiculoAutomotor {

    public static final double TAXA_VALOR_MERCADO = 0.04;
    public static final double TAXA_ANO_FABRICACAO = 0.05;

    public CarroParticular(String modelo, double valormercado, int anoFabricacao) {
        super(modelo, valormercado, anoFabricacao);
    }

    @Override
    public double calcularValorPremio() {
        double premio = (getValorMercado() * TAXA_VALOR_MERCADO);
        if(getAnoFabricacao()<2000){
            premio *=TAXA_ANO_FABRICACAO;
        }
        return premio;
    }

    @Override
    public String descrever() {
        return String.format("Carro Particular com data de fabricação em %d, avaliado em R$%.2f",
                getAnoFabricacao(), getValorMercado());
    }
}
