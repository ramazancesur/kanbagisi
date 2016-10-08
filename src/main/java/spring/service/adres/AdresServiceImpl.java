package spring.service.adres;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import spring.dao.addres.AddresDao;
import spring.model.Adres;

@Service("addresService")
@Transactional
public class AdresServiceImpl implements AdresService {

	@Autowired
	AddresDao addresDao;
	
	@Override
	public Adres createAdres(Adres adres) {
		// TODO Auto-generated method stub
		return addresDao.save(adres);
	}

	@Override
	public Adres updateAdres(Adres adres) {
		// TODO Auto-generated method stub
		return addresDao.save(adres);
	}

	@Override
	public void deletedAdres(String oid) {
		// TODO Auto-generated method stub
		addresDao.delete(oid);
	}

	@Override
	public void deleteAdres(Adres adres) {
		// TODO Auto-generated method stub
		addresDao.delete(adres);
	}

	@Override
	public List<Adres> getAllAdres() {
		// TODO Auto-generated method stub
		return addresDao.findAll();
	}

	@Override
	public Adres getAdres(String oid) {
		// TODO Auto-generated method stub
		return addresDao.findOne(oid);
	}

}
