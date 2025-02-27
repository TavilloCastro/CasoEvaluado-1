package casoevaluado.pkg1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


import javax.swing.JOptionPane;
 
/**
 *
 * @author gcastro
 */
public class CasoEvaluado1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Solicita los datos del agente:
        String nombreAgente = JOptionPane.showInputDialog("Ingrese su nombre completo:");
        String cedulaAgente = JOptionPane.showInputDialog("Ingrese su numero de cedula:");
        String codigoAgente = JOptionPane.showInputDialog("Ingrese su codigo de agente:");
        String sucursal = JOptionPane.showInputDialog("Ingrese la sucursal a la que pertenece:");
        boolean vehiculo = JOptionPane.showInputDialog("¿Tiene vehiculo propio? (Si/No)").equalsIgnoreCase("Si");
        
        Agentes agentes = new Agentes(nombreAgente,cedulaAgente, codigoAgente, sucursal, vehiculo);
        
        int cantidadFacturas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de facturas a registrar:"));
        int totalVentas = 0;
        double totalComisiones = 0;
        boolean bonoExtra = false;
        int puntos = 0;
        
        //Ciclo para registro de facturas:
        
        for (int i = 0; i < cantidadFacturas; i++) {
            String nombreCliente = JOptionPane.showInputDialog("Ingrese el nombre completo del cliente:");
            String cedulaCliente = JOptionPane.showInputDialog("Ingrese el numero de cedula del cliente:");
            String codigoFactura = JOptionPane.showInputDialog("Ingrese el codigo de la factura:");
            int montoFactura = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el monto de la factura:"));
            int mes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de mes:"));
            boolean productosElectricos = JOptionPane.showInputDialog("¿La factura contiene productos electronicos? (Si/No)").equalsIgnoreCase("Si");
            boolean productosAutomotrices = JOptionPane.showInputDialog("¿La factura contiene productos automotrices? (Si/No)").equalsIgnoreCase("Si");
            boolean productosConstruccion = JOptionPane.showInputDialog("¿La factura contiene productos de construccion? (Si/No)").equalsIgnoreCase("Si");
        
            Facturas facturas = new Facturas(nombreCliente, cedulaCliente, codigoFactura, montoFactura, mes, productosElectricos, productosAutomotrices, productosConstruccion);
            
            totalVentas += facturas.getMontoFactura();
           }
        
        //Calculo de la comision: No me dio tiempo 
        
        //Verificacion Bono: no me dio tiempo
        
        //Resultado final:
        
        String respuesta = "El agente vendedor " + agentes.getNombreAgente() + "," + "codigo " + codigoAgente + "\n" +
                            "Es un excelente agente vendedor." + "\n" +
                            "Le vamos a dar una comision equivalente al 50% de su salario." + "\n" +
                            "El agente puede lograr los objetivos que se proponga." + "\n" +
                            "Obtuvo 100 puntos." + "\n" +
                            (agentes.tieneVehiculo() ? "Tiene " : "No tiene ") + "vehiculo propio" + "\n" +
                            "Es de la sucursal: " + (agentes.getSucursal());
                
        JOptionPane.showMessageDialog(null, respuesta);
            
    }
    
}
