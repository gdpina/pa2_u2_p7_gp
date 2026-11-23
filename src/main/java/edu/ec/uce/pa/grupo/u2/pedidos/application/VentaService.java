package edu.ec.uce.pa.grupo.u2.pedidos.application;


import edu.ec.uce.pa.grupo.u2.pedidos.domain.model.Venta;
import edu.ec.uce.pa.grupo.u2.pedidos.domain.repository.VentaRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

@ApplicationScoped 
@Transactional 
public class VentaService {

    @Inject 
    private VentaRepository ventaRepository;

    public void guardar(Venta venta){
        this.ventaRepository.created(venta);
    }

    public Venta buscarPorId(Integer id){
        return this.ventaRepository.read(id);
    }

    public void actualizar(Venta venta){
        this.ventaRepository.update(venta);
    }

    public void eliminar(Integer id){
        this.ventaRepository.delete(id);
    }

}
