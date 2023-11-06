package model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
@Table(name = "tbl_rol")
@Entity(name = "Rol")
@Getter
@Setter
public class rol {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	 @Column(columnDefinition = "BIT(1)")
	    private boolean activo;
	@Column(name = "descripcion",length=255, nullable = false)
	private String descripcion;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public boolean isActivo() {
		return activo;
	}
	public void setActivo(boolean activo) {
		this.activo = activo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
	
}
