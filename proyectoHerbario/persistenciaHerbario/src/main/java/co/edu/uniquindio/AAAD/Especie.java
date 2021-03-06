package co.edu.uniquindio.AAAD;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Especie
 *
 */
@Entity

public class Especie implements Serializable {

	   
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private String id;
	@Column(nullable=false, length=50)
	private String nombre;
	
	@OneToOne(mappedBy = "especieEnviada")
	private Registro RegistroPlanta;
	
	
	@ManyToOne
	private Genero generoDeEspecie;
	
	private static final long serialVersionUID = 1L;

	public Especie() {
		super();
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
	 * @return the registroPlanta
	 */
	public Registro getRegistroPlanta() {
		return RegistroPlanta;
	}

	/**
	 * @param registroPlanta the registroPlanta to set
	 */
	public void setRegistroPlanta(Registro registroPlanta) {
		RegistroPlanta = registroPlanta;
	}

	/**
	 * @return the generoDeEspecie
	 */
	public Genero getGeneroDeEspecie() {
		return generoDeEspecie;
	}

	/**
	 * @param generoDeEspecie the generoDeEspecie to set
	 */
	public void setGeneroDeEspecie(Genero generoDeEspecie) {
		this.generoDeEspecie = generoDeEspecie;
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
		Especie other = (Especie) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}   
	
	
   
}
