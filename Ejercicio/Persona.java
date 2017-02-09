
/**
 * Write a description of class Persona here.
 * 
 * @author (Cristian) 
 * @version (17.02.09)
 */
public class Persona
{
    private String nombrePersona;
    private boolean hombre;
    private int pesoPersona;
    private int alturaPersona;
    private int edadPersona;
    private int caloriasPersona;
    private int metabolismoBasal;

    /**
     * Constructor for objects of class Persona
     */
    public Persona(String nombrePerson, boolean hombre, int peso, int altura, int edad)
    {
        this.nombrePersona = nombrePerson;
        pesoPersona = peso;
        this.hombre = hombre;
        alturaPersona = altura;
        edadPersona = edad;
        caloriasPersona = 0;
        if (hombre == false) 
        {
            metabolismoBasal = 10 * pesoPersona + 6 * alturaPersona + 5 * edadPersona + -161;
        }
        if (hombre == true) 
        {
            metabolismoBasal = 10 * pesoPersona + 6 * alturaPersona + 5 * edadPersona + 5;
        }

    }

    /**
     * Metodo que permite dar de comer a una persona una comida y devuelve el numero de calorias de la comida ingerida
     */
    public int comer(Comida comidaADar)
    {
        int caloriasADevolver = -1;
        caloriasADevolver = comidaADar.getCaloriasDeLaComida();
        if (metabolismoBasal >= caloriasPersona)
        {

            caloriasPersona = caloriasPersona + comidaADar.getCaloriasDeLaComida();
        }
        else {
            System.out.println("Se ha superado tu metabolismo basal");
            caloriasADevolver = -1;
        }

        return caloriasADevolver;  
    }

    /**
     * Metodo que devuelve el numero de calorias ingeridas por la persona
     */
    public int getCaloriasIngeridas()
    {
        return caloriasPersona;

    }
}