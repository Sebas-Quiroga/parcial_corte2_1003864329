package Document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "consulta")
public class Consulta {
    @Id
    private String id;
    @Field
    private String nom_medico;
    @Field
    private String especialidad;

    @DBRef
    private Paciente paciente;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNom_medico() {
        return nom_medico;
    }

    public void setNom_medico(String nom_medico) {
        this.nom_medico = nom_medico;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }




}
