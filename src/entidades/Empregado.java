package entidades;

public class Empregado {

	private String nome;
	private Integer horas;
	private Double valorhora;
	
	public Empregado() {
	}

	public Empregado(String nome, Integer horas, Double valorhora) {
		this.nome = nome;
		this.horas = horas;
		this.valorhora = valorhora;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getHoras() {
		return horas;
	}

	public void setHoras(Integer horas) {
		this.horas = horas;
	}

	public Double getValorhora() {
		return valorhora;
	}

	public void setValorhora(Double valorhora) {
		this.valorhora = valorhora;
	}
	
	public double pagamento() {
	  return horas*valorhora;
	}
	
	
}
