package pe.edu.cibertec.jpa.test;

import javax.persistence.EntityManager;

import pe.cibertec.cnx.JPAUtil;

public class testUnitario {

	public static void main(String[] args) {
		invocarEntityManagerPokemon();

	}

	private static void invocarEntityManagerPokemon(){
		EntityManager manager = JPAUtil.getEntityManager();
		System.out.println("Listo - Creación Exitosa");
	}
}
