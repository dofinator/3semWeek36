
package entity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class EntityTester {
    
    public static void main(String[] args) {
        
       EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
       EntityManager em = emf.createEntityManager();
       
       Book book1 = new Book("test1");
       Book book2 = new Book("test2");
       
        try {
            em.getTransaction().begin();
            em.persist(book1);
            em.persist(book2);
            em.getTransaction().commit();
            
        } finally {
            em.close();
        }
       

        
    }
}
