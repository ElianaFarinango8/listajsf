package lista_dinamica;

import java.util.ArrayList;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class BeanLista {

	String nombre;
	private ArrayList<String> personas;
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<String> getPersonas() {
		return personas;
	}

	public void setPersonas(ArrayList<String> personas) {
		this.personas = personas;
	}

	@PostConstruct	
	public void iniciar(){
		personas=new ArrayList<String>();
		personas.add("Eliana");
		personas.add("Luis");
		personas.add("Maria");
		
	}
	
	public String ingresar(){
		
		personas.add(nombre);
		return "index";
	}
}
