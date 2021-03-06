package co.edu.uniquindio.AAAD;

import java.io.Serializable;
import java.lang.String;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Orden
 *
 */
@Entity

public class Orden implements Serializable {

	
	private String nombre;   
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private String id;
	@Column(nullable=false, length=50)
	private static final long serialVersionUID = 1L;
	
	@OneToMany(mappedBy = "ordenDelaFamilia")
	private List<Familia> familiasDelOrden;

	public Orden() {
		super();
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the familiasDelOrden
	 */
	public List<Familia> getFamiliasDelOrden() {
		return familiasDelOrden;
	}

	/**
	 * @param familiasDelOrden the familiasDelOrden to set
	 */
	public void setFamiliasDelOrden(List<Familia> familiasDelOrden) {
		this.familiasDelOrden = familiasDelOrden;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Orden other = (Orden) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}   
	
	
   
}
