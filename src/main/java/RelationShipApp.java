import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class RelationShipApp {
    static EntityManagerFactory emf = Persistence.createEntityManagerFactory("datasource");

    public static void main(String[] args) {
        Patient p = findPersonFromDb(1L);
        System.out.println(findMedicalFileViaPerson(p));
        System.out.println();
    }

    private static MedicalFile findMedicalFileViaPerson(Patient p) {
        EntityManager em = emf.createEntityManager();
        
    }


    public static Patient findPersonFromDb(long p) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("datasource");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        Patient patient = em.find(Patient.class,p);
        System.out.println(patient.getMedicalFile().getHeight());
        emf.close();
        return patient;
    }
}
