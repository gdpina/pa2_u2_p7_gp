package edu.ec.uce.pa.grupo.u2.pedidos.infraestructure.persistence.repository;

import edu.ec.uce.pa.grupo.u2.pedidos.domain.model.Pedido;
import edu.ec.uce.pa.grupo.u2.pedidos.domain.repository.PedidoRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;

@ApplicationScoped 
public class PedidoRepositoryImpl implements PedidoRepository{

    //se programa el crud del pedido en la base de dato
    @Inject 
    private EntityManager entityManager; //Ya tiene metodos construidos por defectos no hacen falta programar sino usarlos 

    @Override
    public void created(Pedido pedido) {
        this.entityManager.persist(pedido);
    }

    @Override
    public Pedido read(Integer id) {
        return  this.entityManager.find(Pedido.class, id);
    }

    @Override
    public void update(Pedido pedido) {
        this.entityManager.merge(pedido);
    }

    @Override
    public void delete(Integer id) {
        Pedido pedido = this.read(id);
        this.entityManager.remove(pedido);
    }

}
