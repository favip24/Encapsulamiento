public class Encapsulamiento {
    public static void main(String[] args) throws Exception {

// Encapsulamiento: Pasar los atributos de una clase de públicos a privado y quen solamente puedan ser accedidos a traves de los getters y los setters.
        Persona persona1 = new Persona("Guada", "Cuper", 22);

// Solo podemos cambiar el nombre con el setter 
            persona1.setApellido("Palermo");
            persona1.setNombre("Favio");

// Solo podemos traer la edad con el getter
    System.out.println(persona1.darNombreCompleto() + " " + persona1.getEdad());
    }
}