public class EmpresaLucroReal extends PessoaJuridica {

    public static final double ALIQUOTA_IMPOSTO_LUCRO = 0.25;

    public EmpresaLucroReal(String nome, double faturamentoAnual, double despezaAnual) {
        super(nome, faturamentoAnual, despezaAnual);
    }

    @Override
    public double calcularImpostos() {
        return getLucroAnual()*ALIQUOTA_IMPOSTO_LUCRO;
    }
}
