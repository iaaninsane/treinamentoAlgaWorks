public class EmpresaSimples extends PessoaJuridica {

    public static final double ALIQUOTA_IMPOSTO_FATURAMENTO = 0.06;

    public EmpresaSimples(String nome, double faturamentoAnual, double despezaAnual) {
        super(nome, faturamentoAnual, despezaAnual);
    }

    @Override
    public double calcularImpostos() {
        return getFaturamentoAnual()*ALIQUOTA_IMPOSTO_FATURAMENTO;
    }
}