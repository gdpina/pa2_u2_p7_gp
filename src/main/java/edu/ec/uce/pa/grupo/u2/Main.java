package edu.ec.uce.pa.grupo.u2;

import java.time.LocalDateTime;
import java.util.Optional;

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
        pedido.setNumero("PED-001");
        pedido.setFecha(LocalDateTime.now());
        pedido.setPrecio(300.00);
        pedido.setProducto("Samsung");
    
        this.pedidoService.guardar(pedido);
        
         // READ (BUSCAR)
        Optional<Pedido> pedido1 = this.pedidoService.bucarPorId(200);
        if (pedido1.isPresent()) {
            System.out.println("Pedido encontrado: " + pedido1.get());
        } else {
            System.out.println("Pedido no encontrado");
        }


        // READ BY NUMBER
        Optional<Pedido> pedidoByNumber = this.pedidoService.bucarPorNumero("PED-001");
        if (pedidoByNumber.isPresent()) {
            System.out.println("Pedido encontrado por número: " + pedidoByNumber.get());
        } else {
            System.out.println("Pedido no encontrado por número");
        }

         return 0;
    }

    

}
