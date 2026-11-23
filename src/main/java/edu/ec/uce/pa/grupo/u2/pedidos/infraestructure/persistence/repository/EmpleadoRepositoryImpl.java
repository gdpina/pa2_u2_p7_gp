package edu.ec.uce.pa.grupo.u2.pedidos.infraestructure.persistence.repository;

import edu.ec.uce.pa.grupo.u2.pedidos.domain.model.Empleado;
import edu.ec.uce.pa.grupo.u2.pedidos.domain.repository.EmpleadoRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;

@ApplicationScoped 
public class EmpleadoRepositoryImpl implements EmpleadoRepository{

    @Inject 
    private EntityManager entityManager;

    @Override
    public void created(Empleado empleado) {
        this.entityManager.persist(empleado);    
    }

    @Override
    public Empleado read(Integer id) {
        return this.entityManager.find(Empleado.class, id);
    }

    @Override
    public void update(Empleado empleado) {
        this.entityManager.merge(empleado);
    }

    @Override
    public void delete(Integer id) {
        Empleado empleado = this.read(id);
        this.entityManager.remove(empleado);
    }

}
