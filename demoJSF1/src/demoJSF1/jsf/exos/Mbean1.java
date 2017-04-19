package demoJSF1.jsf.exos;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="mbean1", eager = true)
@SessionScoped // permet de revenir à chaque fois sur le meme get sans nouvelle instanciation sur la meme session !
// @ApplicationScoped //permet de revenir à chaque fois sur le meme get sans nouvelle instanciation sur toutes les sessions !
// @ViewScoped //tant que l'on ne change pas de page
public class Mbean1 {
	
	private String message = "Hello";
	String data ="";
	String data2 = "";
	String lesDeux = "";
	
	
	public String getLesDeux() {
		return lesDeux = data + data2;
	}

	public void setLesDeux(String lesDeux) {
		this.lesDeux = lesDeux;
	}

	public String getData2() {
		return data2 ;
	}

	public void setData2(String data2) {
		this.data2 = data2;
	}

	private int compteur = 0 ;

	public String getMessage() {
		compteur++;
		return message +" " + compteur + " data = " + data + " data2 = "+ data2 ;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public Mbean1()
	{ 
		System.out.println("Mbean1 constructeur");
	}
	


	public String getData() {
		return data;
	}

	public void setData(String data) {
		System.out.println("setting data : " + data);
		this.data = data;
	}
	
	
	
}
