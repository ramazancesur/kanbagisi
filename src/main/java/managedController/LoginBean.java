package managedController;

/**
 * Created by sinan on 07/08/2015.
 */

import java.io.Serializable;

import javax.faces.application.ViewHandler;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.component.UIViewRoot;
import javax.faces.context.FacesContext;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.context.SecurityContextHolder;

import spring.model.Employee;
import spring.service.EmployeeService;


@ManagedBean(name="loginMgmtBean")
@RequestScoped
public class LoginBean implements Serializable {

    /**
	 * @author sinan.ulgen
	 * session scope olan request scope olarak g�ncellendi sorun ��kmas� halinde
	 * tekrar sessionscope yap�lmal�d�r!
	 */
	private static final long serialVersionUID = 1L;
	private String userName = null;
    private String password = null;
    
    @ManagedProperty(value="#{authenticationManager}")
    private AuthenticationManager authenticationManager = null;
    
    @ManagedProperty(value="#{EmployeeService}")
	EmployeeService employeeService;
    
    private Employee employee;

	public String login()
	{
		 try {
	            Authentication request = new UsernamePasswordAuthenticationToken(this.getUserName(), this.getPassword());
	            Authentication result = authenticationManager.authenticate(request);
	            SecurityContextHolder.getContext().setAuthentication(result);
	        } catch (AuthenticationException e) {
	        	System.out.println(e.getMessage());
	        	
	          //  e.printStackTrace();
	        	refreshPage();
	            return "/pages/unsecure/incorrect.xhtml";
	        }
	        return "/pages/secure/correct.xhtml";
	}
	public Employee getEmployee(String user) {
		
        if (employee == null) {
			if (employee == null) {
				employee = new Employee();
				employee.equals(employeeService.getEmployeeByEmail(user));
			}
		}
		return employee;
	}
	 public void refreshPage() {
			FacesContext fc = FacesContext.getCurrentInstance();
			String refreshpage = fc.getViewRoot().getViewId();
			ViewHandler ViewH = fc.getApplication().getViewHandler();
			UIViewRoot UIV = ViewH.createView(fc, refreshpage);
			UIV.setViewId(refreshpage);
			fc.setViewRoot(UIV);
		}
    
    public String cancel() {
    	return "/pages/unsecure/login.xhtml";
    }
    
	public String logout(){
        SecurityContextHolder.clearContext();
        return "/pages/unsecure/login.xhtml";
    }
	
    public AuthenticationManager getAuthenticationManager() {
        return authenticationManager;
    }

    public void setAuthenticationManager(AuthenticationManager authenticationManager) {
        this.authenticationManager = authenticationManager;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

	public EmployeeService getEmployeeService() {
		return employeeService;
	}

	public void setEmployeeService(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
    

}
