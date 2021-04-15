public class Coches
{
    String modelo;
    String color;
    int año;
    int velocidadMaxima;
    
    Coches(String modelo, String color,int año, int velocidadMaxima){
        this.modelo = modelo;
        this.color = color;
        this.año = año;
        this.velocidadMaxima = velocidadMaxima;
    }
    
    public String presentarCaracteristicas(){
        String presentacion;
        
        presentacion = "Vehiculo " + modelo + " en presentacion " + color + " del año " + año + " y con una velocidad maxima de " + velocidadMaxima;
    
        return presentacion;
    }
    
    public int PuntuacionGlobal(int año, int velocidadMaxima){
        int resultado;
        
        resultado = año + velocidadMaxima;
        
        return resultado;
    }
    
    public String getModelo(){
        return modelo;
    }
    
    public String getColor(){
        return color;
    }
    
    public int getAño(){
        return año;
    }
    
    public int getVelocidadMaxima(){
        return velocidadMaxima;
    }
    
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    
    public void setColor(String color){
        this.color = color;
    } 
    
    public void setAño(int año){
        this.año = año;
    }
    
    public void setVelocidadMaxima(int velocidadMaxima){
        this.velocidadMaxima = velocidadMaxima;
    }
}
