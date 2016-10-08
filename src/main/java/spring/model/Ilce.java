package spring.model;

import javax.faces.bean.ManagedBean;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="ILCE")
@ManagedBean(name="ilces")
public class Ilce extends BaseModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4849438985392286885L;
	@ManyToOne
	@Column
	private Il il;
	public Il getIl() {
		return il;
	}
	public void setIl(Il il) {
		this.il = il;
	}
	
}
