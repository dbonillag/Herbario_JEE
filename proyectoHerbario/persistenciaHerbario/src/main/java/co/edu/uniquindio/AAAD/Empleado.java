package co.edu.uniquindio.AAAD;

import java.io.Serializable;
import javax.persistence.*;

import co.edu.uniquindio.AAAD.Persona;

/**
 * Entity implementation class for Entity: Empleado
 *
 */
@Entity
@Inheritance(strategy=InheritanceType.JOINED)
public class Empleado extends Persona implements Serializable {

	
	private static final long serialVersionUID = 1L;

	public Empleado() {
		super();
	}
   
}
