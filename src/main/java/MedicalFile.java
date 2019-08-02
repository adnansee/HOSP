import javax.persistence.*;

@Entity
public class MedicalFile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private float height;
    private float weight;
    @OneToOne(mappedBy = "medicalFile")
    private Patient patient;

    public Patient getPatient() {
        return patient;
    }

    public MedicalFile setPatient(Patient patient) {
        this.patient = patient;
        return this;
    }

    public float getHeight() {
        return height;
    }

    public MedicalFile setHeight(float height) {
        this.height = height;
        return this;
    }

    public float getWeight() {
        return weight;
    }

    public MedicalFile setWeight(float weight) {
        this.weight = weight;
        return this;
    }
}
