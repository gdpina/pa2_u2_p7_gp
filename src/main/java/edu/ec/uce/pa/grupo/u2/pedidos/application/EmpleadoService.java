package edu.ec.uce.pa.grupo.u2.pedidos.application;


import edu.ec.uce.pa.grupo.u2.pedidos.domain.model.Empleado;
import edu.ec.uce.pa.grupo.u2.pedidos.domain.repository.EmpleadoRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

@ApplicationScoped 
@Transactional 
public class EmpleadoService {

    @Inject 
    private EmpleadoRepository empleadoRepository;

    public void guardar(Empleado empleado){
        this.empleadoRepository.created(empleado);;
    }

    public Empleado buscarPorId(Integer id){
        return this.empleadoRepository.read(id);
    }

    public void actualizar(Empleado empleado){
        this.empleadoRepository.update(empleado);
    }

    public void eliminar(Integer id){
        this.empleadoRepository.delete(id);;
    }

}
