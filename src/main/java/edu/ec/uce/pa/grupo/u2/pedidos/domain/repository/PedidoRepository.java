package edu.ec.uce.pa.grupo.u2.pedidos.domain.repository;

import java.util.List;
import java.util.Optional;

import edu.ec.uce.pa.grupo.u2.pedidos.domain.model.Pedido;

public interface PedidoRepository {

    //Created
    public void created(Pedido pedido);

    //READ POR ID
    public Optional<Pedido> read(Integer id);

    //READ POR ID
    public Optional<Pedido> readByNumber(String numero);
    
    //READ POR ID
    public List<Pedido> readAll(Integer id);
    
    //Update
    public void update(Pedido pedido);

    //Delete
    public void delete(Integer id);


}
