package repositorios;

import java.util.ArrayList;
import java.util.List;

import negocio.entidades.Colaborador;


public class RepositorioColaborador implements IRepositorio<Colaborador> {

	private List<Colaborador> colaboradores = new ArrayList<Colaborador>();

	@Override
	public Colaborador localizar(String cpf) {
		Colaborador obj = null;
		for (Colaborador colaborador : colaboradores) {
			if (colaborador.getCpf().equals(cpf)) {
				obj = colaborador;
				break;
			}
		}
		return obj;
	}

	@Override
	public List<Colaborador> localizarTodos() {
		return colaboradores;
	}

	@Override
	public boolean inserir(Colaborador colaborador) {
		colaboradores.add(colaborador);
		return true;
	}

	@Override
	public boolean deletar(String cpf) {
		for (Colaborador colaborador : colaboradores) {
			if (colaborador.getCpf().equals(cpf)) {
				colaboradores.remove(colaborador);
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean atualizar(String cpf, Colaborador colaborador) {
		for (Colaborador aux : colaboradores) {
			if (aux.getCpf().equals(cpf)) {
				updateColaborador(aux, colaborador);
				return true;
			}
		}return false;
	}

	private void updateColaborador(Colaborador aux, Colaborador colaborador) {
		aux.setNome(colaborador.getNome());
		aux.setRg(colaborador.getRg());
		aux.setMatricula(colaborador.getMatricula());
	
	}

}

