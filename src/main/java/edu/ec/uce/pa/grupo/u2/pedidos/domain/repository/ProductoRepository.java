package edu.ec.uce.pa.grupo.u2.pedidos.domain.repository;

import edu.ec.uce.pa.grupo.u2.pedidos.domain.model.Producto;

public interface ProductoRepository {

     //Created
    public void created(Producto producto);

    //Read
    public Producto read(Integer id);
    
    //Update
    public void update(Producto producto);

    //Delete
    public void delete(Integer id);
}
