package spring.service.tel;

import java.util.List;

import spring.model.Tel;

public interface TelService {
	public Tel createTel(Tel tel);

	public Tel updateTel(Tel tel);

	public void deletedTel(String oid);

	public void deleteTel(Tel tel);

	public List<Tel> getAllTel();

	public Tel getTel(String oid);
}
