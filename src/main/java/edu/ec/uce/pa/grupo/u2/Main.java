package edu.ec.uce.pa.grupo.u2;

import java.time.LocalDate;
import java.time.LocalDateTime;

import edu.ec.uce.pa.grupo.u2.pedidos.application.ClienteService;
import edu.ec.uce.pa.grupo.u2.pedidos.application.DistribuidorService;
import edu.ec.uce.pa.grupo.u2.pedidos.application.EmpleadoService;
import edu.ec.uce.pa.grupo.u2.pedidos.application.PedidoService;
import edu.ec.uce.pa.grupo.u2.pedidos.application.ProductoService;
import edu.ec.uce.pa.grupo.u2.pedidos.application.VentaService;
import edu.ec.uce.pa.grupo.u2.pedidos.domain.model.Cliente;
import edu.ec.uce.pa.grupo.u2.pedidos.domain.model.Distribuidor;
import edu.ec.uce.pa.grupo.u2.pedidos.domain.model.Empleado;
import edu.ec.uce.pa.grupo.u2.pedidos.domain.model.Pedido;
import edu.ec.uce.pa.grupo.u2.pedidos.domain.model.Producto;
import edu.ec.uce.pa.grupo.u2.pedidos.domain.model.Venta;
import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;
import jakarta.inject.Inject;

@QuarkusMain 
public class Main implements QuarkusApplication{

    @Inject 
    private PedidoService pedidoService;

    @Inject 
    private ClienteService clienteService;

    @Inject 
    private DistribuidorService distribuidorService;

    @Inject 
    private EmpleadoService empleadoService;

    @Inject 
    private ProductoService productoService;

    @Inject 
    private VentaService ventaService;

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

        Cliente cliente = new Cliente();
        cliente.setNombre("Gabriel");
        cliente.setCedula("999999999");
        cliente.setTelefono("0999920011");
        cliente.setDireccion("Floresta");
        this.clienteService.guardar(cliente);

        Distribuidor distribuidor = new Distribuidor();
        distribuidor.setNombre("Jesus");
        distribuidor.setRuc("8888888888");
        distribuidor.setTelefono("123456789");
        distribuidor.setDireccion("Quito");
        this.distribuidorService.guardar(distribuidor);

        Empleado empleado = new Empleado();
        empleado.setNombre("Gregorio");
        empleado.setCedula("0001112223");
        empleado.setCargo("Ayudante");
        empleado.setSalario(500.00);
        this.empleadoService.guardar(empleado);

        Producto producto = new Producto();
        producto.setNombre("Cocacola 2Litros");
        producto.setPrecio(2.50);
        producto.setStock(3);
        producto.setPresentacion("Retornable");
        this.productoService.guardar(producto);

        Venta venta = new Venta();
        venta.setNumeroVenta("P01");
        venta.setFecha(LocalDate.now());
        venta.setTotal(3);
        venta.setEstado("Pagado");
        this.ventaService.guardar(venta);


        return 0;
    }

    

}
