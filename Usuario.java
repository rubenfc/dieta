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
    
    /**
     * inicializa el atributo nombre al nombre que metas
     */
    public void usuario(String nombre)
    {
        this.nombre = nombre;
    }
    
    
    public void comer( Alimento nombre, float gramos)
    {
       proteinas = nombre.getProteinas() * gramos;
       grasas = nombre.getGrasas() * gramos;
       carbohidratos = nombre.getCarbohidratos() *gramos;
    }
    
    public void totalComido()
    {
        System.out.println("nombre: " + nombre + "\n" + "proteinas ingeridas: " + proteinas + "\n" + "Carbohidratos ingeridos: " + carbohidratos + "\n" +
                           "Grasas ingeridas: ");
    }
}
