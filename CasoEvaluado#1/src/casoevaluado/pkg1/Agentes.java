package casoevaluado.pkg1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author gcastro
 */
public class Agentes {
    
    private String nombreAgente;
    private String cedulaAgente;
    private String codigoAgente;
    private String sucursal;
    private boolean vehiculo;
    
    public Agentes(String nombreAgente, String cedulaAgente, String codigoAgente, String sucursal, boolean vehiculo) {
        
        this.nombreAgente = nombreAgente; 
        this.cedulaAgente = cedulaAgente; 
        this.codigoAgente = codigoAgente;
        this.sucursal = sucursal;
        this.vehiculo = vehiculo; 
    }
    
    public String getNombreAgente() {
        return nombreAgente;
    }
    
    public String getCedulaAgente() {
        return cedulaAgente;
    }
    
    public String getCodigoAgente() {
        return codigoAgente;
    }
    
    public String getSucursal() {
        return sucursal;
    }
    
    public boolean tieneVehiculo() {
        return vehiculo;
    }
}
