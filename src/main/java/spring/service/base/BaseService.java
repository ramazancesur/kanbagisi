package spring.service.base;

import java.util.List;

public interface BaseService<T>  {
	  public  T createEntity(T Entity);

	  public T updateEntity(T Entity);

	  public void deletedEntity(String oid);

	  public void deleteEntity(T Entity);

	  public List<T> getAllEntity();

	  public T getEntity(String oid);
}
