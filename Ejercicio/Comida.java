
/**
 * Write a description of class Comida here.
 * 
 * @author (Cristian) 
 * @version (17.02.09)
 */
public class Comida
{
    private String nombreDeComida;
    private int caloriasDeComida;
 

    /**
     * Constructor for objects of class Comida
     */
    public Comida(String comida, int calorias)
    {
        nombreDeComida = comida;
        caloriasDeComida = calorias;
        
     
    }
    
    /**
     * Metodo que nos da las calorias de la comida
     */
    public int getCaloriasDeLaComida()
    {
      
        return caloriasDeComida;
    
    }

  
}
