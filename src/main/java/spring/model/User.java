package spring.model;

/**
 * Created by sinan on 15/06/2016.
 */

import java.io.Serializable;
import java.util.Date;

import javax.faces.bean.ManagedBean;
import javax.persistence.*;

@Entity
@Table(name = "USERS")
@ManagedBean(name = "users")
public class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	private String password;
	// private String username;
	@OneToOne(cascade = CascadeType.REMOVE)
	private Employee employee;

	@OneToOne
	@JoinColumn(name = "fk_role")
	private Role role;

	private Integer addEmpId;
	private Integer updtEmpId;
	private Date addDate;
	private Date updtDate;

	public Integer getAddEmpId() {
		return addEmpId;
	}

	public void setAddEmpId(Integer addEmpId) {
		this.addEmpId = addEmpId;
	}

	public Integer getUpdtEmpId() {
		return updtEmpId;
	}

	public void setUpdtEmpId(Integer updtEmpId) {
		this.updtEmpId = updtEmpId;
	}

	public Date getAddDate() {
		return addDate;
	}

	public void setAddDate(Date addDate) {
		this.addDate = addDate;
	}

	public Date getUpdtDate() {
		return updtDate;
	}

	public void setUpdtDate(Date updtDate) {
		this.updtDate = updtDate;
	}

	public Integer getId() {
		return id;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}
}
