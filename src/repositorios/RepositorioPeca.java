package repositorios;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import negocio.entidades.Peca;

//@Author Michelle
public class RepositorioPeca implements IRepositorio<Peca> {
	private List<Peca> pecas = new ArrayList<Peca>();

	@Override
	public Peca localizar(String codigo) {
		Peca obj = null;
		for (Peca peca : pecas) {
			if (Objects.equals(peca.getCodigo(), codigo)) {
				obj = peca;
			}
		}
		return obj;
	}

	@Override
	public List<Peca> localizarTodos() {
		return pecas;
	}

	@Override
	public boolean inserir(Peca peca) {
		pecas.add(peca);
		return true;
	}

	@Override
	public boolean deletar(String codigo) {
		for (Peca peca : pecas) {
			if (peca.getCodigo() == codigo) {
				pecas.remove(peca);
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean atualizar(String codigo, Peca peca) {
		for (Peca aux : pecas) {
			if (aux.getCodigo() == codigo) {
				updatePeca(aux, peca);
				return true;
			}
		}
		return false;
	}

	private void updatePeca(Peca aux, Peca peca) {
		aux.setCodigo(peca.getCodigo());
		aux.setDescricao(peca.getDescricao());
		aux.setPreco(peca.getPreco());
		aux.setQtdEstoque(peca.getQtdEstoque());
	}
}
