import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class MainApp {


    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("datasource");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        //MEDICAL FILES
        MedicalFile m1 = new MedicalFile();
        m1.setHeight(180);
        m1.setWeight(70);

        MedicalFile m2 = new MedicalFile();
        m2.setHeight(100);
        m2.setWeight(60);

        //PATIENTS
        Patient p1 = new Patient("DAN");
        p1.setMedicalFile(m1);

        Patient p2 = new Patient("YOLO");
        p2.setMedicalFile(m2);



        tx.begin();

        em.persist(p2);
        //em.remove(p2);
       // em.refresh(p2);
       // p1.setMedicalFile(null);

        //em.refresh(p1);
        em.persist(p1);
        tx.commit();
       // Patient p = Patient.findPersonFromDb(1L);
     //   em.persist(p);

        emf.close();
//        System.out.print(p1.getMedicalFile().getHeight());



    }
}
