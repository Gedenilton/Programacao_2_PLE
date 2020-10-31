package negocio;

import java.util.List;
import java.util.Random;

import negocio.entidades.Cliente;
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
	
	public boolean inserir(OrdemServico ordemServico) {
    	return reOS.inserir(ordemServico);
    }
		
	
}
