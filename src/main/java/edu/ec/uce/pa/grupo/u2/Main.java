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

        Pedido pedido = new Pedido();
        pedido.setProducto("Producto de prueba");
        pedido.setPrecio(100.00);
        pedido.setFecha(LocalDateTime.now());

        this.pedidoService.guardar(pedido);
        return 0;
    }

    

}
