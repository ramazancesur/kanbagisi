package spring.model;

import java.util.Set;

import javax.faces.bean.ManagedBean;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="HASTAHANE")
@ManagedBean(name="hastahanes")
public class Hastahane extends BaseModel{
	@Column	
	private String genelBilgi;

	public String getGenelBilgi() {
		return genelBilgi;
	}

	public void setGenelBilgi(String genelBilgi) {
		this.genelBilgi = genelBilgi;
	}
	
}
