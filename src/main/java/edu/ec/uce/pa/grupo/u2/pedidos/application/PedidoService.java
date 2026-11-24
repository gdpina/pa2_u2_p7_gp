package edu.ec.uce.pa.grupo.u2.pedidos.application;

import java.util.Optional;

import edu.ec.uce.pa.grupo.u2.pedidos.domain.model.Pedido;
import edu.ec.uce.pa.grupo.u2.pedidos.domain.repository.PedidoRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

@ApplicationScoped
@Transactional 
public class PedidoService {

    @Inject 
    private PedidoRepository pedidoRepository;

    public void guardar(Pedido pedido){
        this.pedidoRepository.created(pedido);
    }

    public Optional<Pedido> bucarPorId(Integer id) {
        return this.pedidoRepository.read(id);
    }

    public Optional<Pedido> bucarPorNumero(String numero) {
        return this.pedidoRepository.readByNumber(numero);
    }

    public void actualizar(Pedido pedido){
        this.pedidoRepository.update(pedido);
    }

    public void eliminar(Integer id){
        this.pedidoRepository.delete(id);
    }

}
