package negocio.entidades;

import java.util.List;
import java.util.Objects;

import repositorios.RepositorioColaborador;
import repositorios.RepositorioPeca;

public class ControladorColaborador {

	private static ControladorColaborador instancia;
	private RepositorioColaborador reColab;
	
	private ControladorColaborador() {
		reColab= new RepositorioColaborador();
	}
	
	public static ControladorColaborador getInstancia() {
		if ( instancia == null  )
			instancia= new ControladorColaborador();
		return instancia;
	}
	
    public boolean inserir(Colaborador colab) {
    	return reColab.inserir( colab );
    }
    
	public Colaborador localizar(String cpf) {
		return reColab.localizar(cpf);
	}

	public List<Colaborador> localizarTodos() {
		return reColab.localizarTodos();
	}

	public boolean deletar(String cpf) {
		return reColab.deletar(cpf);
	}

	public boolean atualizar(String cpf, Colaborador colab) {
		return reColab.atualizar(cpf, colab);
	}    
	
}
