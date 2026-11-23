package edu.ec.uce.pa.grupo.u2.pedidos.domain.repository;

import edu.ec.uce.pa.grupo.u2.pedidos.domain.model.Venta;

public interface VentaRepository {

     //Created
    public void created(Venta venta);

    //Read
    public Venta read(Integer id);
    
    //Update
    public void update(Venta venta);

    //Delete
    public void delete(Integer id);

}
