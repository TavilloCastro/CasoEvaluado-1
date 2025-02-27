package casoevaluado.pkg1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author gcastro
 */
public class Facturas {
    
    private String nombreCliente;
    private String cedulaCliente;
    private String codigoFactura;
    private int montoFactura;
    private int mes;
    private boolean productosElectricos;
    private boolean productosAutomotrices;
    private boolean productosConstruccion;
    
    public Facturas(String nombreCliente, String cedulaCliente, String codigoFactura, int montoFactura, int mes, boolean productosElectricos, boolean productosAutomotrices, boolean productosConstruccion) {
        
        this.nombreCliente = nombreCliente;
        this.cedulaCliente = cedulaCliente;
        this.codigoFactura = codigoFactura;
        this.montoFactura = montoFactura;
        this.mes = mes;
        this.productosElectricos = productosElectricos;
        this.productosAutomotrices = productosAutomotrices;
        this.productosConstruccion = productosConstruccion;
        
    }
    
    public String getNombreCliente() {
        return nombreCliente;
    }
    
    public String getCedulaCliente() {
        return cedulaCliente;
    }
    
    public String getCodigoFactura() {
        return codigoFactura;
    }
    
    public int getMontoFactura() {
        return montoFactura;
    }
    
    public int getMes() {
        return mes;
    }
    
    public boolean tieneProductosElectricos() {
        return productosElectricos;
    }
    
    public boolean tieneProductosAutomotrices() {
        return productosAutomotrices;
    }
    
    public boolean tieneProductosContruccion() {
        return productosConstruccion;
    }
    
}
