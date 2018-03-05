

/**
 * 
 * @author alumno2017
 *
 */
public class TempDia
{
    final int meses[]=   {0,31,59,90,120,151,182,213,244,274,305,335};
    private int dia;
    private int mes;
    private int año;
    private int tempMax;
    private int tempMin;
     
        
    /**
     * Incializo el constructor por defecto
     */
    
    public TempDia(){
        
    }
    
    public TempDia(int dia, int mes , int año , int tempMax, int tempMin){
        
        this.dia= dia;
        this.mes= mes;
        this.año= año;
        this.tempMax= tempMax;
        this.tempMin= tempMin; 
    }
    /**
     * 
     * @return el numero de dia de la tabla de 365 referente a año
     */
    public int obtenerNumerodeDia (){
        
             
     int dato = meses[mes-1];

     int valor = dia+ dato;
        return valor;
    
}
    /**
     * 
     * @return año metodo getter
     */
    
    public int getAño() {
        return año;
    }
    
    /**
     * 
     * @return dia metodo getter
     */
    public int getDia() {
        return dia;
    }
    /**
     * 
     * @return mes metodo getter
     */
    public int getMes() {
        return mes;
    }
    /**
     * Muestra el formato del objeto TempDia con sus parametros
     */
    public String toString(){
        
        return "Fecha"+dia+mes+año+"Media" +((tempMax+tempMin)/2);
        
    }
    
    
}
