package spring.service.base;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import spring.dao.baseDao.BaseDao;

public class BaseServiceImpl<T> implements BaseService<T> {
	private static final Logger LOGGER = LoggerFactory.getLogger(BaseServiceImpl.class);
	@Autowired
	BaseDao<T> baseDao;

	@Override
	public T createEntity(T Entity) {
		// TODO Auto-generated method stub
		try {
			return baseDao.save(Entity);
		} catch (Exception e) {
			// TODO: handle exception
			LOGGER.error(e.getMessage());
			return null;
		}
	}

	@Override
	public T updateEntity(T Entity) {
		// TODO Auto-generated method stub
		return baseDao.save(Entity);
	}

	@Override
	public void deletedEntity(String oid) {
		// TODO Auto-generated method stub
		  baseDao.delete(oid);
	}

	@Override
	public void deleteEntity(T Entity) {
		// TODO Auto-generated method stub
		baseDao.delete(Entity);
	}

	@Override
	public List<T> getAllEntity() {
		// TODO Auto-generated method stub
		return baseDao.findAll();
	}

	@Override
	public T getEntity(String oid) {
		// TODO Auto-generated method stub
		return baseDao.findOne(oid);
	}

	
}
