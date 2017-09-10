package pe.edu.cibertec.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="tb_pokemon")
public class Pokemon {	
	
	@Id
	@GeneratedValue
	@Column(name="id",nullable=false)
	private int codigoPokemon;
	@Column(name="nombre", nullable=false, length=50)
	private String nombrePokemon;
	@Column(name="vida", nullable=false)
	private int vidaPokemon;
	@Column(name="ataque", nullable=false)
	private int ataquePokemon;
	@Column(name="habilidad", nullable=false, length=50)
	private String habilidadPokemon;	
	@Column(name="tipo", nullable=false, length=50)
	private String tipoPokemon;
	@Column(name="fecha_captura")
	@Temporal(TemporalType.TIMESTAMP)
	private Date  fechaCaptura;
		 
	
}
