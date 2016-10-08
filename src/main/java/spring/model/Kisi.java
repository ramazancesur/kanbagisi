package spring.model;

import javax.faces.bean.ManagedBean;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import Utulity.EnumUtulity.KanGrubu;

@Entity
@Table(name="KISI")
@ManagedBean(name="kisi")
public class Kisi extends BaseModel{
	/**
	 * 
	 */
	private static final long serialVersionUID = -1356928289936935447L;

	@Column
	private String email;
	
	@Column
	private String passwd;
	
	@ManyToOne
	@Column
	private Rol rol;
	
	
	private KanGrubu kanGrubu;
	

	public KanGrubu getKanGrubu() {
		return kanGrubu;
	}
	public void setKanGrubu(KanGrubu kanGrubu) {
		this.kanGrubu = kanGrubu;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public Rol getRol() {
		return rol;
	}
	public void setRol(Rol rol) {
		this.rol = rol;
	}	
}