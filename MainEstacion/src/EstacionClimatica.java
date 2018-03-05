// IMPLEMENTACIÓN PARCIAL DE CLASE EstacionClimática
/**
 * @author alumno2017
 */
import java.util.Scanner; 

public class EstacionClimatica 
{ 
    // instance variables - replace the example below with your own 
    private String nombre; 
    private int año; 
    private TempHumDia mediciones[];  // Tabla de mediciones 
    private int nummediciones;      // Número de mediciones almacenadas 

    /** 
     * Constructor for objects of class EstacionClimatica con sus parametros por defecto
     */ 
    public EstacionClimatica() 
    { 
         this.nombre = ""; 
         this.año = 2000;  
         mediciones = new TempHumDia[366];  // Por si el año es bisiesto.  
         nummediciones = 0; 
    } 
    
    /**
     * Constructor por defecto
     * @param nombre
     * @param año
     */
    public EstacionClimatica( String nombre, int año) 
    { 
         this(); // Llamo al constructor por defecto 
         this.nombre = nombre; 
         this.año = año; 
         
    } 
/**
 * 
 * @param medida la cual ingresare en la tabla de objetos TempHumDia
 * @return verdadero si pertenece al año en la cual tenemos mediciones
 */
    public boolean addDia ( TempHumDia medida){
        if (this.año != medida.getAño() )
          return false;
        
        int i  = medida.obtenerNumerodeDia();  
        mediciones[i] = medida;
        nummediciones++;
        return true;
          
    }
    

     /**
      * 
      * @param medida comparamos si se encuentra dentro de nuestra tabla
      * @return verdadero se borra y lo pone a null , falso si el año es diferente
      */
    
    public boolean delDia ( TempHumDia medida){ 
        if (this.año != medida.getAño() )
          return false;
          
        int i  = medida.obtenerNumerodeDia(); 
        if ( i >=0 || i < this.mediciones.length)  
         mediciones[i]= null;
        nummediciones--;
        return true;
     
    } 
    /**
     * Muestro las mediciones ingresadas por a nuestra tabla, los null los ignora
     */
    public void listarDias(){ 
        
        for(int i=0; i<mediciones.length; i++){
        if(mediciones[i] != null){
        System.out.println(mediciones.toString());
        }
        }
     
    } 
   
    // Método auxiliar que me indica si una fecha es correcta 
    /**
     * 
     * @param dia solicitados para crear un objeto TempHumDia
     * @param mes
     * @param año
     * @return verdadero si el formato pertenece al mes correcto y dias correctos
     */
    static boolean fechaOK ( int dia, int mes, int año){ 
        
       if(dia >0 && dia <= 31 && mes == 1 && año > 0 && año< 2030){
        return true;
        }
        if(dia >0 && dia <= 28 && mes == 2 && año > 0 && año< 2030){
        return true;
        }
        if(dia >0 && dia <= 31 && mes == 3 && año > 0 && año< 2030){
        return true;
        }
        if(dia >0 && dia <= 30 && mes == 4 && año > 0 && año< 2030){
        return true;
        }
        if(dia >0 && dia <= 31 && mes == 5 && año > 0 && año< 2030){
        return true;
        }
        if(dia >0 && dia <= 30 && mes == 6 && año > 0 && año< 2030){
        return true;
        }
        if(dia >0 && dia <= 30 && mes == 7 && año > 0 && año< 2030){
        return true;
        }
        if(dia >0 && dia <= 31 && mes == 8 && año > 0 && año< 2030){
        return true;
        }
        if(dia >0 && dia <= 30 && mes == 9 && año > 0 && año< 2030){
        return true;
        }
        if(dia >0 && dia <= 31 && mes == 10 && año > 0 && año< 2030){
        return true;
        }
        if(dia >0 && dia <= 30 && mes == 11 && año > 0 && año< 2030){
        return true;
        }
        if(dia >0 && dia <= 31 && mes == 12 && año > 0 && año< 2030){
        return true;
        }
        else return false;
    
    } 
    
    /**
     * 
     * @return un nuevo objeto TempHumDia creado desde esta clase
     */
    static TempHumDia leerMedida() { 

         Scanner leer = new Scanner(System.in); 
         int dia,mes,año, tempMax, tempMin, humMax, humMin; 
         TempHumDia  medicion = null; 
         
        boolean error = true; 
        do { 
        System.out.println("Día:"); dia = leer.nextInt(); 
        System.out.println("Mes:");  mes = leer.nextInt(); 
        System.out.println("Año:");  año = leer.nextInt(); 
  
        if ( fechaOK( dia,mes,año) ) { 
             System.out.println ( " Tº Máxima:"); tempMax = leer.nextInt(); 
             System.out.println ( " Tº Mínima:"); tempMin = leer.nextInt(); 
             System.out.println ( " Hº Máxima:"); humMax = leer.nextInt(); 
             System.out.println ( " Hº Mínima:"); humMin = leer.nextInt(); 
             medicion = new TempHumDia ( dia,mes,año, tempMax, tempMin, humMax, humMin); 
             error = false; 
            } 
        else 
        { 
            System.out.println(" Fecha érronea"); 
        } 
    
    } while (  error); 
    
    
    return medicion; 
}
} 