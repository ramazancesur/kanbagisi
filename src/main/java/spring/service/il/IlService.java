package spring.service.il;

import java.util.List;

import spring.model.Il;

public interface IlService {
	public Il createIl(Il il);

	public Il updateIl(Il il);

	public void deletedIl(String oid);

	public void deleteIl(Il il);

	public List<Il> getAllIl();

	public Il getIl(String oid);
}
