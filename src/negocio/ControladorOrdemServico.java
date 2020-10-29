package negocio;

import java.util.List;
import java.util.Random;

import negocio.entidades.Colaborador;
import negocio.entidades.OrdemServico;
import repositorios.RepositorioOrdemServico;

public class ControladorOrdemServico {

	private static ControladorOrdemServico instancia;
	private RepositorioOrdemServico reOS;
	
	private ControladorOrdemServico() {
		reOS = new RepositorioOrdemServico();
	}
	
	public static ControladorOrdemServico getInstancia() {
		if ( instancia == null  )
			instancia= new ControladorOrdemServico();
		return instancia;
	}
	
    
//	public CLiente localizar(String cpf) {
//		return reOS.//localizar(cpf);
//	}
//
//	public List<Colaborador> localizarTodos() {
//		return reOS.localizarTodos();
//	}
//
//	public boolean deletar(String cpf) {
//		return reOS.deletar(cpf);
//	}
//
//	public boolean atualizar(String cpf, Colaborador colab) {
//		return reOSb.atualizar(cpf, colab);
//	}    
//	
//	public boolean usuarioLogado(Colaborador colaboradorSession) {
//		boolean isLogado= false;
//		Colaborador colaboradorCadastrado= reOS.localizar( colaboradorSession.getCpf() );
//		if ( colaboradorCadastrado != null && colaboradorCadastrado.getSenha().equals( colaboradorSession.getSenha() ) ) {
//			isLogado= true;
//		}
//		return isLogado;
//	}	
	
}
