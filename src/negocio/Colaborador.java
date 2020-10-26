package negocio.entidades;

public class Colaborador extends Pessoa {
	
	private String matricula;
	private String senha;
	private String login;


	public Colaborador(){
	}

	public Colaborador(String nome, String rg, String cpf, String matricula, String senha) {
		super(nome, rg, cpf);
		this.matricula = matricula;
		this.senha= senha;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String random) {
		this.matricula = random;
	}

	@Override
	public String toString() {
		return "Colaborador {"
				+ "Matricula='" + matricula + '\'' + " Nome="  + super.getNome() + ", RG= " + super.getRg() + ", CPF= " + super.getCpf() + "} " ;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}


}
