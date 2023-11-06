package model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Table(name = "tbl_cuenta")
@Entity(name = "Cuenta")
@Getter
@Setter
public class cuenta {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="num_cu",length=255,nullable=false)
	private String NumeroCuenta;
	
	@Column(name="saldo",nullable=false)
	private Double saldo;
	
	@ManyToOne
	@JoinColumn(name = "cliente_id")
	private cliente cliente;
	
	 @OneToOne(cascade = CascadeType.PERSIST)
	    @JoinColumn(name = "tipo_cuenta_id", referencedColumnName = "id", unique = true)
	    private tipo_cuenta tipo_cuenta;
	
	 @OneToMany(mappedBy = "cuenta")
	 private List<movimiento> movimientos;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNumeroCuenta() {
		return NumeroCuenta;
	}

	public void setNumeroCuenta(String numeroCuenta) {
		NumeroCuenta = numeroCuenta;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public cliente getCliente() {
		return cliente;
	}

	public void setCliente(cliente cliente) {
		this.cliente = cliente;
	}

	public tipo_cuenta getTipo_cuenta() {
		return tipo_cuenta;
	}

	public void setTipo_cuenta(tipo_cuenta tipo_cuenta) {
		this.tipo_cuenta = tipo_cuenta;
	}

	public List<movimiento> getMovimientos() {
		return movimientos;
	}

	public void setMovimientos(List<movimiento> movimientos) {
		this.movimientos = movimientos;
	}

}
