package edu.ec.uce.pa.grupo.u2.pedidos.infraestructure.persistence.repository;

import java.util.List;
import java.util.Optional;

import edu.ec.uce.pa.grupo.u2.pedidos.domain.model.Pedido;
import edu.ec.uce.pa.grupo.u2.pedidos.domain.repository.PedidoRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

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
    public Optional<Pedido> read(Integer id) {
        Pedido pedido = this.entityManager.find(Pedido.class, id);
        return Optional.ofNullable(pedido);
    }

    @Override
    public void update(Pedido pedido) {
        this.entityManager.merge(pedido);
    }

    @Override
    public void delete(Integer id) {
        Optional<Pedido> pedido = this.read(id);
        pedido.ifPresent(this.entityManager::remove);
    }

     @Override
    public Optional<Pedido> readByNumber(String numero) {
        TypedQuery<Pedido> query = this.entityManager
                .createQuery("SELECT p FROM Pedido p WHERE p.numero = :numeroVariable", Pedido.class);
        query.setParameter("numeroVariable", numero);
        return Optional.ofNullable(query.getSingleResult());

    }

    @Override
    public List<Pedido> readAll(Integer id) {
        return null;
    }

}
