package negocio.entidades;

import java.util.List;
import java.util.Random;

import repositorios.RepositorioColaborador;

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
    	
    	// gera matricula
        Random gerador = new Random();
        for (int i = 0; i < 10; i++) {
            colab.setMatricula(Integer.toString(gerador.nextInt(26)));
         }
    	
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
	
	public boolean usuarioLogado(Colaborador colaboradorSession) {
		boolean isLogado= false;
		Colaborador colaboradorCadastrado= reColab.localizar( colaboradorSession.getCpf() );
		if ( colaboradorCadastrado != null && colaboradorCadastrado.getSenha().equals( colaboradorSession.getSenha() ) ) {
			isLogado= true;
		}
		return isLogado;
	}	
	
}
