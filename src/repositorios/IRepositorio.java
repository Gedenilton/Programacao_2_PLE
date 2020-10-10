package repositorios;

import java.util.List;

public interface IRepositorio <T> {
	
	public T localizar();
	public List<T> localizarTodos();
	public void inserir();
	public void deletar();
	public void atualizar();

}
