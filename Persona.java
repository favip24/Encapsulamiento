public class Persona {
// Atributos
    private String nombre;
    private String apellido;
    private int edad;
    
// Constructor
    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
// THIS: Se utiliza para acceder a variables de instancia o métodos de la clase actual.
    }

// Métodos
    public String darNombreCompleto() {
        return getNombre() + " " + getApellido();
    }

// Getter: Son métodos que se utilizan para acceder al valor de una variable de instancia desde fuera de la clase.
    public String getNombre() {
        return this.nombre;
    }
    public String getApellido() {
        return this.apellido;
    }
    public int getEdad() {
        return this.edad;
    }

// Setter: Son métodos que se utilizan para modificar el valor de una variable de instancia desde fuera de la clase.
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}