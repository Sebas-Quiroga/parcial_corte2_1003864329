package IService;

import Document.Paciente;

import java.util.List;
import java.util.Optional;

public interface IPacienteserice {
    List<Paciente>findAll();
    Optional<Paciente> findById(String id);
    Paciente save(Paciente paciente);
    void update(Paciente paciente,String id);
    void delete (String id);

}
