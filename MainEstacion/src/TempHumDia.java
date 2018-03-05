
/**
 * Write a description of class TempHumDia here.
 * 
 /**
  * @author alumno2017
  */

public class TempHumDia extends TempDia
{
    private int humMax, humMin;
   
    /**
     * Añado el constructor el cual heresa de TempDia sus parametros
     * @param dia
     * @param mes
     * @param año
     * @param tempMax
     * @param tempMin
     * @param humMax
     * @param humMin
     */
    public TempHumDia(int dia, int mes , int año , int tempMax, int tempMin, int humMax, int humMin){
        
       super(dia, mes , año , tempMax, tempMin);
        this.humMax= humMax;
        this.humMin= humMin; 
    }
    /**
     * Muestra el formato del objeto TempHumDia con sus parametros
     */
 public String toString(){
        
        return super.toString()+((humMax+humMin)/2);
        
    }
    
    
}
