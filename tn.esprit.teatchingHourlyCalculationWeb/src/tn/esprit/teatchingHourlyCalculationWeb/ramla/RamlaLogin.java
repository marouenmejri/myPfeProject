package tn.esprit.teatchingHourlyCalculationWeb.ramla;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.esprit.domain.gestionEntites.login.LoginServicesLocal;

@ManagedBean
@SessionScoped
public class RamlaLogin {
	
	private String login;
	private String pwd;
	
	@EJB
	private LoginServicesLocal loginServicesLocal;
	
	public String doLogin(){	
		String retour="";
		if(loginServicesLocal.signIn(login, pwd)==1){
			retour="ok";
		}
		else{
			retour="ko";
		}
		
		return retour;
	}
	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
	

}
