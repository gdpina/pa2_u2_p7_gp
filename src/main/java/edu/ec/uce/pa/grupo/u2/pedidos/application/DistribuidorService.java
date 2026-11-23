package edu.ec.uce.pa.grupo.u2.pedidos.application;


import edu.ec.uce.pa.grupo.u2.pedidos.domain.model.Distribuidor;
import edu.ec.uce.pa.grupo.u2.pedidos.domain.repository.DistribuidorRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

@ApplicationScoped 
@Transactional 
public class DistribuidorService {

    @Inject 
    private DistribuidorRepository distribuidorRepository;

    public void guardar(Distribuidor distribuidor){
        this.distribuidorRepository.created(distribuidor);
    }

    public Distribuidor buscarPorId(Integer id){
        return this.distribuidorRepository.read(id);
    }

    public void actualizar(Distribuidor distribuidor){
        this.distribuidorRepository.update(distribuidor);
    }

    public void eliminar(Integer id){
        this.distribuidorRepository.delete(id);
    }

}
