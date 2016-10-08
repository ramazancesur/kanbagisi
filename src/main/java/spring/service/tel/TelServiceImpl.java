package spring.service.tel;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring.dao.tel.TelDao;
import spring.model.Tel;

@Service("telService")
public class TelServiceImpl implements TelService{
	@Autowired
	TelDao telDao;
	@Override
	public Tel createTel(Tel tel) {
		// TODO Auto-generated method stub
		return telDao.save(tel);
	}

	@Override
	public Tel updateTel(Tel tel) {
		// TODO Auto-generated method stub
		return telDao.save(tel);
	}

	@Override
	public void deletedTel(String oid) {
		// TODO Auto-generated method stub
		telDao.delete(oid);
	}

	@Override
	public void deleteTel(Tel tel) {
		// TODO Auto-generated method stub
		telDao.delete(tel);
	}

	@Override
	public List<Tel> getAllTel() {
		// TODO Auto-generated method stub
		return telDao.findAll();
	}

	@Override
	public Tel getTel(String oid) {
		// TODO Auto-generated method stub
		return telDao.findOne(oid);
	}

}
