package negocio.entidades;

import java.util.ArrayList;
import java.util.List;

public class Cliente extends Pessoa {
	
	private String telefone;
	private String endereco;
	private String emai;
	
	private List<OrdemServico> ordemServico = new ArrayList<OrdemServico>();
	
	public Cliente(){
	}

	public Cliente(String nome, String rg, String cpf, String telefone, String endereco, String emai) {
		super(nome, rg, cpf);
		this.telefone = telefone;
		this.endereco = endereco;
		this.emai = emai;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getEmai() {
		return emai;
	}

	public void setEmai(String emai) {
		this.emai = emai;
	}

	public List<OrdemServico> getOrdemServico() {
		return ordemServico;
	}

	public void setOrdemServico(List<OrdemServico> ordemServico) {
		ordemServico.add((OrdemServico) ordemServico);
	}
	
	
}
