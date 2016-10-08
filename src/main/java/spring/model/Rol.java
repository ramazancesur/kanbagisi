package spring.model;

import javax.faces.bean.ManagedBean;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="ROL")
@ManagedBean(name="rols")
public class Rol extends BaseModel{
	/**
	 * 
	 */
	private static final long serialVersionUID = -2311462307145156302L;
	@Column
	private String ozellik;

	public String getOzellik() {
		return ozellik;
	}

	public void setOzellik(String ozellik) {
		this.ozellik = ozellik;
	}

	
}
