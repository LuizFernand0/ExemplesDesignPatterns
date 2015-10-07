package dataAccessObject;

import java.util.List;

public interface DAO<E> {

	public E procurar(Object id);
	public void delete(E entidade);
	public void save(E entidade);
	public List<E> listarTodos();
	
}
