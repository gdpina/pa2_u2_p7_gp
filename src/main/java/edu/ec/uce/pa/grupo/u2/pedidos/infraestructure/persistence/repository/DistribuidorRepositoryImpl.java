package edu.ec.uce.pa.grupo.u2.pedidos.infraestructure.persistence.repository;

import edu.ec.uce.pa.grupo.u2.pedidos.domain.model.Distribuidor;
import edu.ec.uce.pa.grupo.u2.pedidos.domain.repository.DistribuidorRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;

@ApplicationScoped 
public class DistribuidorRepositoryImpl implements DistribuidorRepository{

    @Inject 
    private EntityManager entityManager;
    
    @Override
    public void created(Distribuidor distribuidor) {
        this.entityManager.persist(distribuidor);
    }

    @Override
    public Distribuidor read(Integer id) {
        return this.entityManager.find(Distribuidor.class, id);
    }

    @Override
    public void update(Distribuidor distribuidor) {
        this.entityManager.merge(distribuidor);
    }

    @Override
    public void delete(Integer id) {
        Distribuidor distribuidor = this.read(id);
        this.entityManager.remove(distribuidor);
    }

}
