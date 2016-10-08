package spring.service.il;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import spring.dao.il.IlDao;
import spring.model.Il;

@Service("ilService")
@Transactional
public class IlServiceImpl implements IlService {

	@Autowired
	IlDao ilDao;
	
	@Override
	public Il createIl(Il il) {
		// TODO Auto-generated method stub
		return ilDao.save(il);
	}

	@Override
	public Il updateIl(Il il) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deletedIl(String oid) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteIl(Il il) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Il> getAllIl() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Il getIl(String oid) {
		// TODO Auto-generated method stub
		return null;
	}

}
