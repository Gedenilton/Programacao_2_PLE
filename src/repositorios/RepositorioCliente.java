package repositorios;

import java.util.ArrayList;
import java.util.List;

import negocio.entidades.Cliente;

public class RepositorioCliente implements IRepositorio<Cliente> {

	private List<Cliente> clientes = new ArrayList<Cliente>();

	@Override
	public Cliente localizar(String cpf) {
		Cliente obj = null;
		for (Cliente cliente : clientes) {
			if (cliente.getCpf().equals(cpf)) {
				obj = cliente;
				break;
			}
		}
		return obj;
	}

	@Override
	public List<Cliente> localizarTodos() {
		return clientes;
	}

	@Override
	public boolean inserir(Cliente cliente) {
		clientes.add(cliente);
		return true;
	}

	@Override
	public boolean deletar(String cpf) {
		for (Cliente cliente : clientes) {
			if (cliente.getCpf() == cpf) {
				clientes.remove(cliente);
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean atualizar(String cpf, Cliente cliente) {
		for (Cliente aux : clientes) {
			if (aux.getCpf() == cpf) {
				updateCliente(aux, cliente);
				return true;
			}
		}return false;
	}

	private void updateCliente(Cliente aux, Cliente cliente) {
		aux.setNome(cliente.getNome());
		aux.setTelefone(cliente.getTelefone());
		aux.setEndereco(cliente.getEndereco());
		aux.setEmail(cliente.getEmail());
	}

}
