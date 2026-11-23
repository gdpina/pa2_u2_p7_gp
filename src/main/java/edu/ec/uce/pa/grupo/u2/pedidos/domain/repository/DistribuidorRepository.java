package edu.ec.uce.pa.grupo.u2.pedidos.domain.repository;

import edu.ec.uce.pa.grupo.u2.pedidos.domain.model.Distribuidor;

public interface DistribuidorRepository {

     //Created
    public void created(Distribuidor distribuidor);

    //Read
    public Distribuidor read(Integer id);
    
    //Update
    public void update(Distribuidor distribuidor);

    //Delete
    public void delete(Integer id);

}
