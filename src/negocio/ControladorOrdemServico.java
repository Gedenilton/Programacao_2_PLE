package negocio;

public class ControladorOrdemServico {

	private static ControladorOrdemServico instancia;
//	private RepositorioOrdemServico reOS;
//	
//	private ControladorOrdemServico() {
//		reOS = new RepositorioOrdemServico();
//	}
	
	public static ControladorOrdemServico getInstancia() {
		if ( instancia == null  )
			instancia= new ControladorOrdemServico();
		return instancia;
	}
	
    
	
}
