
/**
 * Write a description of class Alimento here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Alimento
{
    //el nombre del alimento
    private String nombre;
    //los gramos de proteinas 
    private float proteinas;
    //los gramos de carboidratos 
    private float carbohidratos;
    //los gramos de grasas
    private float grasas;
    
    /**
     * inicializa los atributos 
     */
    public void Alimmento (String nombre, float proteinas, float carbohidratos, float grasas)
    {
        this.nombre = nombre;
        this.proteinas = proteinas;
        this. carbohidratos = carbohidratos;
        this.grasas = grasas;
    }
    
    /**
     * imprime por pantalla las caracteristicas del alimento
     */
    public void muestraDatos()
    {
        System.out.println("nombre: " + nombre + "\n" + "proteinas por cada 100g " + proteinas + "\n" + "Carbohidratos por cada 100 gramos: " + carbohidratos + "\n" +
                           "Grasas por cada 100 gramos: " + grasas + "calorias: " + getCalorias() + "\n" + "ccomponente mayoyitario: " + getComponenteMayor());
    }
    
    /**
     * calcula el nivel de calorias 
     */
    public double getCalorias()
    {
        double calorias = (proteinas * 4.0) + (carbohidratos * 4.0) + (grasas * 9F); 
        return calorias;
    }
    
    /**
     * devuelve el componente mayoritario 
     */
    private String getComponenteMayor()
    {
        String componente = null;
        if(proteinas > carbohidratos && proteinas > grasas)
        {
            componente = "proteinas";
        }
        else if (carbohidratos > proteinas && carbohidratos > grasas)
        {
            componente = "carbohidratos";
        }
        else if (grasas > carbohidratos && grasas > proteinas)
        {
            componente = "grasas";
        }
        return componente;
    }
    
    /**
     * devuelve los gramos de grasas
     */
    public float getGrasas()
    {
        return grasas;
    }
    
    /**
     * devuelve las proteinas
     */
    public float getProteinas()
    {
        return proteinas;
    }
    
    /**
     * devuelve los carbohidratos 
     */
    public float getCarbohidratos()
    {
        return carbohidratos;
    }
    
   
}
