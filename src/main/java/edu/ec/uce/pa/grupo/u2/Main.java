package edu.ec.uce.pa.grupo.u2;

import java.time.LocalDateTime;

import edu.ec.uce.pa.grupo.u2.pedidos.application.PedidoService;
import edu.ec.uce.pa.grupo.u2.pedidos.domain.model.Pedido;
import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;
import jakarta.inject.Inject;

@QuarkusMain 
public class Main implements QuarkusApplication{

    @Inject 
    private PedidoService pedidoService;

    public static void main(String[] arg){
        Quarkus.run(Main.class,arg);
    }

    @Override
    public int run(String... args) throws Exception {
        System.out.println("\nHello, Quarkus\n");

        //CREATE(insert)
        Pedido pedido = new Pedido();
        pedido.setProducto("Producto de prueba 2");
        pedido.setPrecio(100.00);
        pedido.setFecha(LocalDateTime.now());
        this.pedidoService.guardar(pedido);
        
        //READ(buscar)
        Pedido pedido1 = this.pedidoService.buscarPorId(2);
        System.out.println("Pedido encontrado: " + pedido1);
        
        //UPDATE(actualizar)
        pedido.setPrecio(200.00);
        this.pedidoService.actualizar(pedido);

        Pedido pedido2 = this.pedidoService.buscarPorId(2);
        System.out.println("Pedido actualizado: " + pedido2);

        //DELETE(eliminar)
        this.pedidoService.eliminar(2);
        return 0;
    }

    

}
