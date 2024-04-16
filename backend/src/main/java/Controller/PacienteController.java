package Controller;


import IService.IConsultaserice;
import

;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import Document.Consulta;
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
    public List<Consulta> findAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Consulta> findById(@PathVariable String id) {
        return service.findById(id);
    }

    @PostMapping()
    public Consulta save(@RequestBody Consulta consultoria) {
        return service.save(consultoria);
    }


    @PutMapping("/{id}")
    public void update(@RequestBody  Consulta consulta, @PathVariable String id) {
        service.update(consulta, id);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id) {
        service.delete(id);
    }
}
