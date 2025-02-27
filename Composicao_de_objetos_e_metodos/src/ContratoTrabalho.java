public class ContratoTrabalho {

    private Funcionario funcionario;
    private Double valorHoraNormal;
    private Double valorHoraExtra;

    public ContratoTrabalho(Funcionario funcionario, Double valorHoraNormal, Double valorHoraExtra) {
        this.funcionario = funcionario;
        this.valorHoraNormal = valorHoraNormal;
        this.valorHoraExtra = valorHoraExtra;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Double getValorHoraNormal() {
        return valorHoraNormal;
    }

    public void setValorHoraNormal(Double valorHoraNormal) {
        this.valorHoraNormal = valorHoraNormal;
    }

    public Double getValorHoraExtra() {
        return valorHoraExtra;
    }

    public void setValorHoraExtra(Double valorHoraExtra) {
        this.valorHoraExtra = valorHoraExtra;
    }

    public Boolean possuiAdicionalParaFilhos(){
        return funcionario.getQuantidadeFilhos() >=1;
    }
}
