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

        //---------------PEDIDO------------------------
        //CREATE(insert)
        Pedido pedido = new Pedido();
        pedido.setProducto("Producto de prueba");
        pedido.setPrecio(100.00);
        pedido.setFecha(LocalDateTime.now());
        pedido.setNumero("PD001");
        this.pedidoService.guardar(pedido);
        
        //READ(buscar)
        Pedido pedido1 = this.pedidoService.buscarPorId(1);
        System.out.println("Pedido encontrado: " + pedido1);
        
        //UPDATE(actualizar)
        pedido.setPrecio(200.00);
        this.pedidoService.actualizar(pedido);

        Pedido pedido2 = this.pedidoService.buscarPorId(1);
        System.out.println("Pedido actualizado: " + pedido2);

        //DELETE(eliminar)
        this.pedidoService.eliminar(1);

        //--------------CLIENTE---------------------
        //CREATE(insert)
        Cliente cliente = new Cliente();
        cliente.setNombre("Gabriel");
        cliente.setCedula("999999999");
        cliente.setTelefono("0999920011");
        cliente.setDireccion("Floresta");
        this.clienteService.guardar(cliente);

        //READ(buscar)
        Cliente cliente1 = this.clienteService.buscarPorId(1);
        System.out.println("Cliente encontrado: " + cliente1);
        
        //UPDATE(actualizar)
        cliente.setNombre("Jesus");
        this.clienteService.actualizar(cliente);

        Cliente cliente2 = this.clienteService.buscarPorId(1);
        System.out.println("Cliente actualizado: " + cliente2);

        //DELETE(eliminar)
        this.clienteService.eliminar(1);

        //--------------DISTRIBUIDOR---------------------
        //CREATE(insert)
        Distribuidor distribuidor = new Distribuidor();
        distribuidor.setNombre("Gregorio");
        distribuidor.setRuc("8888888888");
        distribuidor.setTelefono("123456789");
        distribuidor.setDireccion("Quito");
        this.distribuidorService.guardar(distribuidor);

        //READ(buscar)
        Distribuidor distribuidor1 = this.distribuidorService.buscarPorId(1);
        System.out.println("Distribuidor encontrado: " + distribuidor1);
        
        //UPDATE(actualizar)
        distribuidor.setDireccion("Ibarra");
        this.distribuidorService.actualizar(distribuidor);

        Distribuidor distribuidor2 = this.distribuidorService.buscarPorId(1);
        System.out.println("Distribuidor actualizado: " + distribuidor2);

        //DELETE(eliminar)
        this.distribuidorService.eliminar(1);

        //--------------EMPLEADO---------------------
        Empleado empleado = new Empleado();
        empleado.setNombre("Juan");
        empleado.setCedula("0001112223");
        empleado.setCargo("Ayudante");
        empleado.setSalario(500.00);
        this.empleadoService.guardar(empleado);
        
        //READ(buscar)
        Empleado empleado1 = this.empleadoService.buscarPorId(1);
        System.out.println("Empleado encontrado: " + empleado1);
        
        //UPDATE(actualizar)
        empleado.setCargo("Jefe");
        this.empleadoService.actualizar(empleado);

        Empleado empleado2 = this.empleadoService.buscarPorId(1);
        System.out.println("Empleado actualizado: " + empleado2);

        //DELETE(eliminar)
        this.empleadoService.eliminar(1);

        //--------------PRODUCTO---------------------
        Producto producto = new Producto();
        producto.setNombre("Cocacola 2Litros");
        producto.setPrecio(2.50);
        producto.setStock(3);
        producto.setPresentacion("Retornable");
        this.productoService.guardar(producto);

        //READ(buscar)
        Producto producto1 = this.productoService.buscarPorId(1);
        System.out.println("Producto encontrado: " + producto1);
        
        //UPDATE(actualizar)
        producto.setPrecio(2.00);
        this.productoService.actualizar(producto);

        Producto producto2 = this.productoService.buscarPorId(1);
        System.out.println("Producto actualizado: " + producto2);

        //DELETE(eliminar)
        this.productoService.eliminar(1);

        //--------------VENTA---------------------
        Venta venta = new Venta();
        venta.setNumeroVenta("P01");
        venta.setFecha(LocalDate.now());
        venta.setTotal(3);
        venta.setEstado("Pagado");
        this.ventaService.guardar(venta);
        
        //READ(buscar)
        Venta venta1 = this.ventaService.buscarPorId(1);
        System.out.println("Venta encontrada: " + venta1);
        
        //UPDATE(actualizar)
        venta.setEstado("Impago");
        this.ventaService.actualizar(venta);

        Venta venta2 = this.ventaService.buscarPorId(1);
        System.out.println("Venta actualizada: " + venta2);

        //DELETE(eliminar)
        this.ventaService.eliminar(1);
         
        
        return 0;
    }

    

}
