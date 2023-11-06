package test;

import java.io.IOException;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

import model.cliente;
import model.cuenta;
import model.rol;
import model.tipo_cuenta;


public class JPATest {

	public static void main(String[] args) throws IOException {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("default");
		EntityManager manager = factory.createEntityManager();

		EntityTransaction tx = manager.getTransaction();

		tx.begin();

		cliente nuevoCliente = new cliente();
        nuevoCliente.setApellidoPaterno("perez");
        nuevoCliente.setApellidoMaterno("pez");
        nuevoCliente.setNombres("martin");


    
       
      

        // Crear un nuevo rol para el cliente
        rol nuevoRol = new rol();
        nuevoRol.setActivo(true);
        nuevoRol.setDescripcion("Nuevo");

        // Asignar el nuevo rol al cliente
        List<rol> roles = new ArrayList<>();
        roles.add(nuevoRol);
        nuevoCliente.setRol(roles);

       
        
        //insertar
        
        manager.persist(nuevoCliente);
        tx.commit();
        
        List<cliente> lista = manager.createQuery("from Cliente", cliente.class).getResultList();
		for (cliente cl : lista) {
			System.out.println(cl);}
        
        
        

	}

}
