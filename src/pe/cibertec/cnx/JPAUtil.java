package pe.cibertec.cnx;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {
	
	public static EntityManagerFactory Factory = Persistence.createEntityManagerFactory("bd_persistence");
	
	public static EntityManager getEntityManager(){
		return Factory.createEntityManager();
	}
}
