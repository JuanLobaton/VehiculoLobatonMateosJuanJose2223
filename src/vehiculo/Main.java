
package vehiculo;

/**
 *
 * @author Juan Lobaton
 */
public class Main {
    
      public static void main(String[] args) {
        VehiculoLobatonMateosJuanJose2223 miVehiculoLobatonMateosJuanJose2223;
        int stockActual;
        
        miVehiculoLobatonMateosJuanJose2223 = new VehiculoLobatonMateosJuanJose2223("Seat",18000,100);
        operativaVehiculosLobatonMateosJuanJose2223(miVehiculoLobatonMateosJuanJose2223); 
        stockActual = miVehiculoLobatonMateosJuanJose2223.obtenerStock();
        System.out.println("El stock actual es"+ stockActual );
    }

    private static void operativaVehiculosLobatonMateosJuanJose2223(VehiculoLobatonMateosJuanJose2223 miVehiculoLobatonMateosJuanJose2223) {
        try
        {
            System.out.println("Venta de Vehiculos");
            miVehiculoLobatonMateosJuanJose2223.vender(20);
        } catch (Exception e)
        {
            System.out.print("Fallo al vender");
        }
        
        try
        {
            System.out.println("Compra de Vehiculos");
            miVehiculoLobatonMateosJuanJose2223.comprar(100);
        } catch (Exception e)
        {
            System.out.print("Fallo al comprar");
        }
    }

}
    
