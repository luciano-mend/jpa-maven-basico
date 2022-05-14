package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class Programa {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();
		Pessoa p1 = em.find(Pessoa.class, 2);
		
		em.remove(p1);
		em.getTransaction().commit();
		System.out.println(p1);
		
		System.out.println("pronto!");
		em.close();
		emf.close();
	}
}
