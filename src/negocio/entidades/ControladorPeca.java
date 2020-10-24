package negocio.entidades;

import java.util.List;
import java.util.Objects;

import repositorios.RepositorioPeca;

public class ControladorPeca {

	private static ControladorPeca instancia;
	private RepositorioPeca rePeca;
	
	private ControladorPeca() {
		rePeca= new RepositorioPeca();
	}
	
	public static ControladorPeca getInstancia() {
		if ( instancia == null  )
			instancia= new ControladorPeca();
		return instancia;
	}
	
    public boolean inserir(Peca peca) {
    	return rePeca.inserir( peca );
    }
    
	public Peca localizar(String codigo) {
		return rePeca.localizar(codigo);
	}

	public List<Peca> localizarTodos() {
		return rePeca.localizarTodos();
	}

	public boolean deletar(String codigo) {
		return rePeca.deletar(codigo);
	}

	public boolean atualizar(String codigo, Peca peca) {
		return rePeca.atualizar(codigo, peca);
	}    
	
}
