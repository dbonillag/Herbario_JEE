package co.edu.uniquindio.AAAD;

import java.io.Serializable;
import javax.persistence.*;

import co.edu.uniquindio.AAAD.Persona;

/**
 * Entity implementation class for Entity: Recolector
 *
 */
@Entity
@Inheritance(strategy=InheritanceType.JOINED)
public class Recolector extends Persona implements Serializable {

	
	private static final long serialVersionUID = 1L;

	public Recolector() {
		super();
	}
   
}
