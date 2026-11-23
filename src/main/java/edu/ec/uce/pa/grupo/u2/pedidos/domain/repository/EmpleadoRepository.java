package edu.ec.uce.pa.grupo.u2.pedidos.domain.repository;

import edu.ec.uce.pa.grupo.u2.pedidos.domain.model.Empleado;

public interface EmpleadoRepository {

     //Created
    public void created(Empleado empleado);

    //Read
    public Empleado read(Integer id);
    
    //Update
    public void update(Empleado empleado);

    //Delete
    public void delete(Integer id);
}
