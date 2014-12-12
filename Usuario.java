import java.util.ArrayList;
/**
 * Write a description of class Usuario here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Usuario
{
    // el nombre del usuario
    private String nombre;
    private float proteinas;
    private float grasas;
    private float carbohidratos;
    private double calorias;
    
    /**
     * inicializa el atributo nombre al nombre que metas
     */
    public void usuario(String nombre)
    {
        this.nombre = nombre;
    }
    
    /**
     * metodo que simula comer 
     */
    public void comer( Alimento nombre, float gramos)
    {
       proteinas = nombre.getProteinas() * gramos;
       grasas = nombre.getGrasas() * gramos;
       carbohidratos = nombre.getCarbohidratos() * gramos;
       calorias = nombre.getCalorias() * gramos;
    }
    
    /**
     * imprime por pantalla los macronutrientes que has comido
     */
    public void totalComido()
    {
        System.out.println("nombre: " + nombre + "\n" + "proteinas ingeridas: " + proteinas + "\n" + "Carbohidratos ingeridos: " + carbohidratos + "\n" +
                           "Grasas ingeridas: " + grasas + "\n" + "calorias: " + calorias);
    }
    
    /**
     * devuelve los porcentajes de macronutrientes que has comido 
     */
    public String porcentajeComido()
    {
       String porcentaje = null;
       if(proteinas != 0)
       {
           porcentaje = proteinas + "%";
       }
       else 
       {
           porcentaje = proteinas + ".";
       }
       
       if(grasas != 0)
       {
           porcentaje = porcentaje + "\n"+ grasas + "%";
       }
       else
       {
           porcentaje = porcentaje + "\n" + grasas  ;
       }
       
       if (carbohidratos != 0)
       {
           porcentaje = porcentaje + "\n" + carbohidratos + "%";
       }
       else
       {
           porcentaje = porcentaje + "\n" + carbohidratos  ;
       }
       return porcentaje;
    }
    
    /**
     * devuelve el numero de calorias 
     */
    public double getCalorias()
    {
        return calorias;
    }
    
    /**
     * devuelve el nombre 
     */
    public String getNombre()
    {
        return nombre;
    }
    
    /**
     * compara entre dos usuarios el numero de calorias 
     */
    public void compararCalorias(Usuario nombre)
    {
        if(nombre.getCalorias() > calorias)
        {
            System.out.println(nombre.getNombre() + " ha consumido mas calorias que " + nombre);
        }
        else
        {
            System.out.println(nombre + " ha consumido mas colorias que " + nombre.getNombre());
        }
    }

}
