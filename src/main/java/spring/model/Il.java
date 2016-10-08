package spring.model;

import javax.faces.bean.ManagedBean;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name = "IL")
@ManagedBean(name = "ils")
public class Il extends BaseModel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 9023060910025909959L;
	@Column
	private String plakaKodu;
	public String getPlakaKodu() {
		return plakaKodu;
	}
	public void setPlakaKodu(String plakaKodu) {
		this.plakaKodu = plakaKodu;
	}

	
	
	
}
