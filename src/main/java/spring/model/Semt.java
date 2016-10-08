package spring.model;

import javax.faces.bean.ManagedBean;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="SEMT")
@ManagedBean(name="semts")
public class Semt extends BaseModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6879369480824513727L;

	@ManyToOne
	@Column
	private Ilce ilce;

	public Ilce getIlce() {
		return ilce;
	}

	public void setIlce(Ilce ilce) {
		this.ilce = ilce;
	}
}
