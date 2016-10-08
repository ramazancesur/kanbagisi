package spring.model;

import javax.faces.bean.ManagedBean;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="ADRES")
@ManagedBean(name="adres")
public class Adres extends BaseModel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Column
	private String adres;
	@Column
	private String not;
	public String getAdres() {
		return adres;
	}
	public void setAdres(String adres) {
		this.adres = adres;
	}
	public String getNot() {
		return not;
	}
	public void setNot(String not) {
		this.not = not;
	}
	
	
}
