package Controller;


import IService.IConsultaserice;
import com.corhuila.Consultoria_medica.ConsultoriaMedicaApplication;

;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/Autor")
public class PacienteController {
    //Inyectar el servicio
    @Autowired
    private IConsultaserice service;

    @GetMapping()
    public List<ConsultoriaMedicaApplication> findAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Optional<ConsultoriaMedicaApplication> findById(@PathVariable String id) {
        return service.findById(id);
    }

    @PostMapping()
    public ConsultoriaMedicaApplication save(@RequestBody ConsultoriaMedicaApplication consultoria) {
        return service.save(consultoria);
    }


    @PutMapping("/{id}")
    public void update(@RequestBody  consul, @PathVariable String id) {
        service.update(consul, id);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id) {
        service.delete(id);
    }
}
