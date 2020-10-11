package negocio.entidades;

import java.util.ArrayList;
import java.util.List;

public class Cliente extends Pessoa {
	
	private String telefone;
	private String endereco;
	private String email;
	
	private List<OrdemServico> ordemServico = new ArrayList<OrdemServico>();
	
	public Cliente(){
	}

	public Cliente(String nome, String rg, String cpf, String telefone, String endereco, String email) {
		super(nome, rg, cpf);
		this.telefone = telefone;
		this.endereco = endereco;
		this.email = email;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<OrdemServico> getOrdemServico() {
		return ordemServico;
	}

	public void setOrdemServico(List<OrdemServico> ordemServico) {
		ordemServico.add((OrdemServico) ordemServico);
	}

	@Override
	public String toString() {
		return "Cliente [ nome= " + super.getNome() + ", rg= " + super.getRg() + ", cpf= " + super.getCpf() + ", telefone= " + telefone + ", endereco= " + endereco + ", email= " + email + "]";
	}
	
	
	
}
