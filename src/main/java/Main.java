import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("watergolem");

        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();

        Picture picture = new Picture();
        picture.setId(0);
        picture.setName("masterpiece");

        entityManager.persist(picture);
        entityManager.getTransaction().commit();

        entityManagerFactory.close();
    }
}
