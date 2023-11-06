package model;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity(name = "Cliente")
@Table(name = "tbl_cliente")
public class cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "ape_pat", length = 255, nullable = false)
    private String apellidoPaterno;

    @Column(name = "ape_mat", length = 255, nullable = false)
    private String apellidoMaterno;

    @Column(name = "nombres", length = 255, nullable = false)
    private String nombres;

    @OneToMany(mappedBy = "cliente", cascade = CascadeType.PERSIST)
    private List<cuenta> cuenta;

    @ManyToMany(cascade = CascadeType.PERSIST)
    private List<rol> rol;

    public cliente() {
        // Constructor del cliente
        cuenta = new ArrayList<>();
        // Crear la cuenta automáticamente al crear el cliente
        cuenta nuevaCuenta = new cuenta();
        nuevaCuenta.setNumeroCuenta("123456789012345"); 
        nuevaCuenta.setSaldo(0.0); 
        cuenta.add(nuevaCuenta);
        nuevaCuenta.setCliente(this); 
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getApellidoPaterno() {
		return apellidoPaterno;
	}

	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}

	public String getApellidoMaterno() {
		return apellidoMaterno;
	}

	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public List<cuenta> getCuenta() {
		return cuenta;
	}

	public void setCuenta(List<cuenta> cuenta) {
		this.cuenta = cuenta;
	}

	public List<rol> getRol() {
		return rol;
	}

	public void setRol(List<rol> rol) {
		this.rol = rol;
	}

}