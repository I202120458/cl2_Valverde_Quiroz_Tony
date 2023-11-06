package model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity(name = "T_cuenta")
@Table(name = "tbl_TpCuenta")

public class tipo_cuenta {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "descripcion", length = 255, nullable = false)
	private String Descripcion;

	@Column(name = "moneda", length = 255, nullable = false)
	private String Moneda;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescripcion() {
		return Descripcion;
	}

	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}

	public String getMoneda() {
		return Moneda;
	}

	public void setMoneda(String moneda) {
		Moneda = moneda;
	}

	


}
