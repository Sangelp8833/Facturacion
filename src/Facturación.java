import org.sangelp.appfacturas.modelo.Cliente;
import org.sangelp.appfacturas.modelo.DetalleFacturas;
import org.sangelp.appfacturas.modelo.Factura;
import org.sangelp.appfacturas.modelo.Productos;
import java.util.*;


public class Facturación {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("**** Ingrese su nombre completo y el RUT **** \n");

        String nombre = s.nextLine();
        String rut = s.nextLine();
        Cliente cliente = new Cliente(nombre, rut);

        String descFac = "COMPRA EN ALMACENES ANGEL";
        Factura factura = new Factura(descFac, cliente);
        factura.setFecha(new Date());


        int registradora = 0;
        int registro_1;
        int cantidad = 0, registroProducto = 1;


        Productos productos = new Productos();
        DetalleFacturas[] items = new DetalleFacturas[1];

        // INGRESAR EL PRIMER PRODUCTO ***************************

        System.out.println("\n**** FACTURACIÓN INICIADA ****");
        System.out.println("\n---- REGISTRO DEL PRODUCTO ----");
        System.out.printf("Nombre del producto: ");
        String nombreProducto = s.nextLine();
        System.out.printf("Precio del producto [$]: ");
        float priceProducto = s.nextInt();
        productos.setNombre(nombreProducto);
        productos.setPrecio(priceProducto);

        items[0] = new DetalleFacturas();
        items[0].setProducto(productos);

        System.out.printf("Cantidad del producto: ");
        cantidad = s.nextInt();

        items[0].setCantidad(cantidad);
        float a = items[0].getTotal(productos.getPrecio(),items[0].getCantidad());
        float granTotal = items[0].getGranTotal(a);

        String detallesFactura = "Productos" + "  " + "Precio" + "  " + "Cantidad" + "  " + "Total" +"\n";

        detallesFactura += items[0].getProducto().getNombre() + "      " + items[0].getProducto().getPrecio() + "     " +
                items[0].getCantidad() + "      " + a + "\n";

        //*********************************************************

        do {
            System.out.println("\n1 - Resgistrar nuevo producto \n" +
                    "2 - terminar el registro de productos");

            registro_1 = s.nextInt();

            s.nextLine();

            if (registro_1 == 1){
                DetalleFacturas[] items1 = new DetalleFacturas[1];
                System.out.println("\n---- REGISTRO DEL PRODUCTO ----");

                System.out.printf("Nombre del producto: ");
                String nombreProducto1 = s.nextLine();
                System.out.printf("Precio del producto [$]: ");
                float priceProducto1 = s.nextInt();

                productos.setNombre(nombreProducto1);
                productos.setPrecio(priceProducto1);

                items1[0] = new DetalleFacturas();
                items1[0].setProducto(productos);

                System.out.printf("Cantidad del producto: ");
                cantidad = s.nextInt();

                items1[0].setCantidad(cantidad);
                float b = items1[0].getTotal(productos.getPrecio(),items1[0].getCantidad());
                granTotal += items1[0].getGranTotal(b);

                registroProducto++;
                detallesFactura += items1[0].getProducto().getNombre() + "      " + items1[0].getProducto().getPrecio() + "     " +
                        items1[0].getCantidad() + "      " + b + "\n";



                System.out.println();

            }else{
                registradora = 1;
            }

        }
        while (registradora == 0);




        System.out.println("---- RESUMEN DE LA COMPRA ----\n");
        System.out.println(factura.getDescripcion() );
        System.out.printf("Nombre: " + factura.getCliente().getNombre());
        System.out.printf(" Id: " + factura.getCliente().getRut() +"\n");

        System.out.println("\n" + detallesFactura + "\n" + "EL TOTAL DE LA COMPRA ES ---> " + granTotal);
        System.out.println("---------------------------------");

    }
}
