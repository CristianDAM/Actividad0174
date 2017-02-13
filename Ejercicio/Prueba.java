import java.util.ArrayList;
/**
 * Write a description of class Prueba here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Prueba
{
    private ArrayList<Integer> listaNumeros;
    private ArrayList<Integer> listaNumerosMaximos;
    private ArrayList<Integer> numerosCopia;

    /**
     * Constructor for objects of class Prueba
     */
    public Prueba()
    {
        listaNumeros = new ArrayList<Integer>();
        listaNumerosMaximos = new ArrayList<Integer>();
        numerosCopia = new ArrayList<Integer>();
        listaNumeros.add(5);
        listaNumeros.add(20);
        listaNumeros.add(15);
        listaNumeros.add(30);
        listaNumeros.add(200);
        listaNumeros.add(8);
        listaNumeros.add(29);
        listaNumeros.add(17);
        listaNumeros.add(45);
        listaNumeros.add(24);

        for (int posicion = 0; posicion < listaNumeros.size();posicion++){
            numerosCopia.add(listaNumeros.get(posicion));
        }

        int contadorOrdenado = listaNumeros.size();
        for ( int contador = 0; contador < contadorOrdenado ;contador++)
        {
            int numeroMasAlto = -1;
            int posicionNumAlto = 0;
            for (int posicion = 0; posicion < listaNumeros.size();posicion++)
            {
                if (listaNumeros.get(posicion) > numeroMasAlto)
                {
                    numeroMasAlto = listaNumeros.get(posicion);                  
                    posicionNumAlto = posicion;

                }
            }
            listaNumerosMaximos.add(numeroMasAlto);
            listaNumeros.remove(posicionNumAlto);
        }
        listaNumeros = numerosCopia;
        System.out.println(listaNumeros);
        System.out.println(numerosCopia);
        System.out.println(listaNumerosMaximos);
    }
}
