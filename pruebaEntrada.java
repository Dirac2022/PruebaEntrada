/**
 *
 * @author mitch
 */

/*
    Represente mediante una diagrama de clases (2pts) e implemente(11pts) en
lenguaje de programación Java, la clase Persona con los siguientes elementos:
 Variables de instancia: nombre, edad y genero (2pts)
 Métodos de instancia: setearNombre, obtenerNombre, setearEdad y
obtenerEdad (2pts)
 Método de clase: calcularEdadPromedio (3pts)
 Programa que registre tres personas y calcule su edad promedio. (4)
*/
public class Persona {
    
    String nombre;
    int edad;
    String genero;
    static int edadAcumulada = 0;
    static int cantidadPeronas = 0;
    
    public Persona(){
       cantidadPeronas ++;
    }
    
    public Persona(String nombre, int edad, String genero){
       this.nombre = nombre;
       this.edad = edad;
       this.genero = genero;
       edadAcumulada += edad;
       cantidadPeronas ++;
       
    }
    
    
    void setearNombre(String nombre){
        this.nombre = nombre;
        
    }
    
    String obtenerNombre(){
        return nombre;
    }
    
    void setearEdad(int edad){
        if(this.edad == 0){
           this.edad = edad;
           edadAcumulada += edad; 
        }
        else{
           edadAcumulada -= this.edad;
           this.edad = edad;
           edadAcumulada += this.edad; 
        }
    }
    
    int obtenerEdad(){
        return edad;
    }
    
    static double calcularEdadPromedio(){
        
        return edadAcumulada/(double)cantidadPeronas;
    }
    
    
    public static void main(String[] args) {
        
        Persona persona1 = new Persona();
        Persona persona2 = new Persona("Ivan", 16, "Masculino");
        Persona persona3 = new Persona("Andre", 15, "Masculino");
        
        persona1.setearNombre("Mitchel");
        persona1.setearEdad(21);
        
        double edadPromedio = Persona.calcularEdadPromedio();
        System.out.printf("La edad acumulada de las 3 personas es: %.2f",edadPromedio);
              
    }