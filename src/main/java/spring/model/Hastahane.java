package spring.model;

import javax.faces.bean.ManagedBean;
import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Table;

@Entity
@Table(name="HASTAHANE")
@ManagedBean(name="hastahanes")
public class Hastahane extends BaseModel{
	/**
	 * 
	 */
	private static final long serialVersionUID = -6740844208765237189L;
	@Column	
	private String genelBilgi;

	public String getGenelBilgi() {
		return genelBilgi;
	}

	public void setGenelBilgi(String genelBilgi) {
		this.genelBilgi = genelBilgi;
	}
	
}
