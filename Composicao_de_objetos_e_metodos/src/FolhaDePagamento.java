public class FolhaDePagamento {

    private int quantidadeHoraNormal ;
    private int quantidadeHoraExtra;
    private ContratoTrabalho contratoTrabalho;

    double calcularSalario(){
        Double salarioCalculado = contratoTrabalho.getValorHoraNormal() * quantidadeHoraNormal +
                contratoTrabalho.getValorHoraExtra() * quantidadeHoraExtra;
        if(contratoTrabalho.possuiAdicionalParaFilhos()){
            salarioCalculado = salarioCalculado * ContratoTrabalho.ADICIONAL_DEPENDENTE;
        }
        return salarioCalculado;
    }
}
