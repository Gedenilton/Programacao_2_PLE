package negocio.entidades;

public class Servico {
	
	private String tipoServico;
	private String descricaoServico;
	private Double preco;
	
	public Servico(String tipoServico, String descricaoServico, Double preco) {
		this.tipoServico = tipoServico;
		this.descricaoServico = descricaoServico;
		this.preco = preco;
	}

	public String getTipoServico() {
		return tipoServico;
	}

	public void setTipoServico(String tipoServico) {
		this.tipoServico = tipoServico;
	}

	public String getDescricaoServico() {
		return descricaoServico;
	}

	public void setDescricaoServico(String descricaoServico) {
		this.descricaoServico = descricaoServico;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

}
