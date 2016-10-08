package spring.service.adres;

import java.util.List;
import spring.model.Adres;

public interface AdresService {
	public Adres createAdres(Adres adres);

	public Adres updateAdres(Adres adres);

	public void deletedAdres(String oid);

	public void deleteAdres(Adres adres);

	public List<Adres> getAllAdres();

	public Adres getAdres(String oid);
}
