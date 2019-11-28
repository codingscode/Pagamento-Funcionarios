package entidades;

public class EmpregadoTerceirizado extends Empregado {

	private Double pagamentoplus;
	
	public EmpregadoTerceirizado() {
	}

	public EmpregadoTerceirizado(String nome, Integer horas, Double valorhora, Double pagamentoplus) {
		super(nome, horas, valorhora);
		this.pagamentoplus = pagamentoplus;
	}

	public Double getPagamentoplus() {
		return pagamentoplus;
	}

	public void setPagamentoplus(Double pagamentoplus) {
		this.pagamentoplus = pagamentoplus;
	}
	
	@Override
	public double pagamento() {
	  return super.pagamento() + pagamentoplus;
	}
	
	
}
