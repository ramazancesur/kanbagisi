package spring.dao;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import spring.model.Employee;

import java.util.ArrayList;
import java.util.List;

@Repository
public class EmployeeDAO {
	
	    @Autowired
	    private SessionFactory sessionFactory;

	    public SessionFactory getSessionFactory() {
	        return sessionFactory;
	    }

	    public void setSessionFactory(SessionFactory sessionFactory) {
	        this.sessionFactory = sessionFactory;
	    }

	    public void addEmployee(Employee employee) {
	        getSessionFactory().getCurrentSession().save(employee);
	    }

	    public void deleteEmployee(Employee employee) {
	        getSessionFactory().getCurrentSession().delete(employee);
	    }

	    public void updateCustomer(Employee employee) {
	        getSessionFactory().getCurrentSession().update(employee);
	    }

	    @SuppressWarnings("rawtypes")
		public Employee getEmployeeById(int id) {
	        List list = getSessionFactory().getCurrentSession().createQuery("from Employee where id=?").setParameter(0, id).list();
	        return (Employee)list.get(0);
	    }

	    @SuppressWarnings({ "rawtypes", "unchecked" })
		public List<Employee> getEmployeeByEducation(String education) {
	        List list = getSessionFactory().getCurrentSession().createQuery("from Employee where employeeEducation.description=?").setParameter(0, education).list();
	        return list;
	    }
	    
	    @SuppressWarnings({ "rawtypes", "unchecked" })
		public List<Employee> getEmployeeByActiveStatus(boolean active) {
	        List list = getSessionFactory().getCurrentSession().createQuery("from Employee where active=?").setParameter(0, active).list();
	        return list;
	    }
	    
	    @SuppressWarnings({ "rawtypes", "unchecked" })
	  		public List<Employee> getEmployeeByBloodType(String bloodType) {
	  	        List list = getSessionFactory().getCurrentSession().createQuery("from Employee where bloodType=? and active=true").setParameter(0, bloodType).list();
	  	        return list;
	  	    }
	    
	    @SuppressWarnings({ "rawtypes", "unchecked" })
  		public List<Employee> getEmployeeByAssignmentGrup(int id) {
  	        List list = getSessionFactory().getCurrentSession().createQuery("from Employee where assignmentGrup.grupId=? and active=true").setParameter(0, id).list();
  	        return list;
  	    }

	    
	    @SuppressWarnings({ "rawtypes", "unchecked" })
		public List<Employee> getEmployees() {
	        List list = getSessionFactory().getCurrentSession().createQuery("from Employee where active=?").setParameter(0, true).list();
	        return list;
	    }
	    
	    @SuppressWarnings({ "rawtypes", "unchecked" })
		public List<Employee> getDeletedEmployees() {
	        List list = getSessionFactory().getCurrentSession().createQuery("from Employee where active=?").setParameter(0, false).list();
	        return list;
	    }
	    
	    @SuppressWarnings("unchecked")
		public Employee getEmployeeByEmail(String userName) {
	           List<Employee> employee = new ArrayList<Employee>();
	           String queryString = "from Employee where eMail = :eMail";
	    	   Query query = getSessionFactory().getCurrentSession().createQuery(queryString);
	    	   query.setString("eMail", userName);
	           employee.addAll(query.list());
	           return  employee.get(0);
	       }

}
