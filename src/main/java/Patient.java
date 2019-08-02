import javax.persistence.*;

@Entity
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    @OneToOne(cascade = {CascadeType.PERSIST,CascadeType.REMOVE, CascadeType.REFRESH,}, fetch = FetchType.LAZY, orphanRemoval = true)
    private MedicalFile medicalFile;



    public Patient(String name) {
        this.name = name;
    }

    public Patient() {

    }

    public MedicalFile getMedicalFile() {
        return medicalFile;
    }

    public Patient setMedicalFile(MedicalFile medicalFile) {
        this.medicalFile = medicalFile;
        return this;
    }

    public long getId() {
        return id;
    }

    public Patient setId(long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Patient setName(String name) {
        this.name = name;
        return this;
    }



}
