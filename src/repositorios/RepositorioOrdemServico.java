package repositorios;

import java.util.ArrayList;
import java.util.List;

import negocio.entidades.OrdemServico;

public class RepositorioOrdemServico {

	private List<OrdemServico> repoOS = new ArrayList<OrdemServico>();

	// Localiza uma OS com o numero da OS
	public OrdemServico localizarOS(Integer numOS) {
		for (OrdemServico os : repoOS) {
			if (os.getNumOS() == numOS) {
				return os;
			}
		
		}
		return null;
	}
	
	public int gerarIdOS() {
		int id = 1;
		if(localizarTodos().size() > 0) {
			id = localizarTodos().get(localizarTodos().size()-1).getNumOS()+1;
		}
		
		return id;
	}

	// Retorna uma Lista de OS
	public List<OrdemServico> localizarTodos() {
		List<OrdemServico> list = new ArrayList<OrdemServico>();
		for (OrdemServico os : repoOS) {
			list.add(os);
		}
		return list;
	}

	// Insere a OS no repositorio
	public boolean inserir(OrdemServico os) {
		if(repoOS.add(os)) {
			return true;
		}
		return false;
	}

	public boolean deletar(OrdemServico os) {
		if(repoOS.remove(os)) {
			return true;
		}
		return false;
	}

	public boolean atualizar(Integer numOS, OrdemServico os) {
		OrdemServico osAtualizada = localizarOS(numOS);
		if(os != null) {
			updateOS(osAtualizada, os);
			return true;
		}
		return false;
	}

	private void updateOS(OrdemServico osAtualizada, OrdemServico os) {
		osAtualizada.setCliente(os.getCliente());
		osAtualizada.setColaborador(os.getColaborador());
		osAtualizada.setListPecas(os.getPecas());
		osAtualizada.setServico(os.getServico());
		
	}

}
