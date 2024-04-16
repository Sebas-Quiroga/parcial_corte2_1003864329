package IRepository;

import Document.Consulta;
import Document.Paciente;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPacienteRepository extends MongoRepository<Paciente,String> {
}