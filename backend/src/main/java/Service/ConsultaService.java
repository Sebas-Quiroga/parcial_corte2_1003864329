package Service;

import Document.Consulta;
import IService.IConsultaserice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class ConsultaService implements IConsultaserice {
@Autowired
private IConsultaserice con;

    @Override
    public List<Consulta> findAll() {
        return con.findAll();
    }

    @Override
    public Optional<Consulta> findById(String id) {
        return con.findById(id);
    }

    @Override
    public Consulta save(Consulta consulta) {
        return con.save(consulta);
    }

    @Override
    public void update(Consulta consulta, String id) {
        Optional<Consulta> ps= con.findById(id);
        if (ps.isEmpty()){

            Consulta consultaUpdate = ps.get();
            consultaUpdate.setId(consulta.getId());
            consultaUpdate.setEspecialidad(consulta.getEspecialidad());
            consultaUpdate.setNom_medico(consulta.getNom_medico());


            //Actualizar el objeto cliente
            con.save(consultaUpdate);
        }else{
            System.out.println("No existe el cliente");
        }
    }

    @Override
    public void delete(String id) {

    }
}

