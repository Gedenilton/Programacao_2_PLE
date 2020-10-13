package negocio.entidades;

public class Colaborador extends Pessoa {
	
	private String matricula;

	public Colaborador(){
	}

	public Colaborador(String nome, String rg, String cpf, String matricula) {
		super(nome, rg, cpf);
		this.matricula = matricula;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	@Override
	public String toString() {
		return "Colaborador {"
				+ "Matricula='" + matricula + '\'' + " Nome="  + super.getNome() + ", RG= " + super.getRg() + ", CPF= " + super.getCpf() + "} " ;
	};
}
