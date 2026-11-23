package edu.ec.uce.pa.grupo.u2.pedidos.domain.repository;

import edu.ec.uce.pa.grupo.u2.pedidos.domain.model.Cliente;

public interface ClienteRepository {

    //Created
    public void created(Cliente cliente);

    //Read
    public Cliente read(Integer id);
    
    //Update
    public void update(Cliente cliente);

    //Delete
    public void delete(Integer id);
}
