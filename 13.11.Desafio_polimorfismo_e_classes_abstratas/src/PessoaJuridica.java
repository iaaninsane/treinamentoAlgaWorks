public abstract class PessoaJuridica extends Pessoa {

    private double faturamentoAnual;
    private double despezaAnual;

    public PessoaJuridica(String nome, double faturamentoAnual, double despezaAnual) {
        super(nome);
        this.faturamentoAnual = faturamentoAnual;
        this.despezaAnual = despezaAnual;
    }

    public double getFaturamentoAnual() {
        return faturamentoAnual;
    }

    public double getDespezaAnual() {
        return despezaAnual;
    }

    public double getLucroAnual() {
        var lucro = getFaturamentoAnual() - getDespezaAnual();
        return lucro;
    }

}
