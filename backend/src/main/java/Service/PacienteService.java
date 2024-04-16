package Service;

import Document.Paciente;
import IService.IPacienteserice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PacienteService implements IPacienteserice {
    @Autowired
    private IPacienteserice pac;

    @Override
    public List<Paciente> findAll() {
        return pac.findAll();
    }

    @Override
    public Optional<Paciente> findById(String id) {
        return pac.findById(id);
    }

    @Override
    public Paciente save(Paciente paciente) {
        return pac.save(paciente);
    }

    @Override
    public void update(Paciente paciente, String id) {
        Optional<Paciente> ps=pac.findById(id);
        if (ps.isEmpty()){

        Paciente pacienteUpdate = ps.get();
            pacienteUpdate.setId(paciente.getId());
            pacienteUpdate.setApellidos(paciente.getApellidos());
            pacienteUpdate.setNombres(paciente.getNombres());
            pacienteUpdate.setFecha_nacimiento(paciente.getFecha_nacimiento());

        //Actualizar el objeto cliente
        pac.save(pacienteUpdate);
    }else{
        System.out.println("No existe el cliente");
    }
}

    @Override
    public void delete(String id) {

    }
}
