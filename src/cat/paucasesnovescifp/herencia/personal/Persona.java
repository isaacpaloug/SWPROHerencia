package cat.paucasesnovescifp.herencia.personal;

public class Persona {
	private String nom;
	private String dataNaixament;
	private String dni;
	
	public Persona(String nom, String dataNaixament, String dni) {
		this.nom = nom;
		this.dataNaixament = dataNaixament;
		this.dni = dni;
	}
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getDataNaixament() {
		return dataNaixament;
	}
	public void setDataNaixament(String dataNaixament) {
		this.dataNaixament = dataNaixament;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
}
