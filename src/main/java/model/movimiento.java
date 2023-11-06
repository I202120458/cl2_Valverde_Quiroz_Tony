package model;

import java.time.LocalDate;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity(name = "Movimiento")
@Table(name = "tbl_movimiento")
public class movimiento {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "descripcion", length = 255, nullable = false)
	private String Descripcion;

	@Column(name = "fecha", nullable = false)
	private LocalDate Fecha;
	
	@Column(name = "monto", nullable = false)
	private Double Monto;
	
	
	 @ManyToOne
	 @JoinColumn(name = "cuenta_id")
	 private cuenta cuenta;
	


}
