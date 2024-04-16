package IService;

import Document.Consulta;

import java.util.List;
import java.util.Optional;

public interface IConsultaserice {
    List<Consulta>findAll();
    Optional<Consulta> findById(String id);
    Consulta save(Consulta consulta);
    void update(Consulta consulta,String id);
    void delete (String id);

}
