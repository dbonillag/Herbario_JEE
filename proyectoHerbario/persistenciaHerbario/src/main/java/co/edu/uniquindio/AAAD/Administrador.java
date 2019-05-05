package co.edu.uniquindio.AAAD;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

import co.edu.uniquindio.AAAD.Persona;

/**
 * Entity implementation class for Entity: Administrador
 *
 */
@Entity
@Inheritance(strategy=InheritanceType.JOINED)
public class Administrador extends Persona implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	@OneToMany(mappedBy = "evaluadorDelRegistro")
	private List<Registro> registrosEvaluados;

	public Administrador() {
		super();
	}

	/**
	 * @return the registrosEvaluados
	 */
	public List<Registro> getRegistrosEvaluados() {
		return registrosEvaluados;
	}

	/**
	 * @param registrosEvaluados the registrosEvaluados to set
	 */
	public void setRegistrosEvaluados(List<Registro> registrosEvaluados) {
		this.registrosEvaluados = registrosEvaluados;
	}
	
	
   
}
