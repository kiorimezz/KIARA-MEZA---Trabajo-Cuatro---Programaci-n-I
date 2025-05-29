// Kiara Meza
// 7- Crear la clase “Profesor”, que herede de la clase
//   “Persona”, y además tenga los atributos:
// a. Materia: cadena de texto
// b. CargaHoraria: numérico entero

package trabajocuatro_completo;

public class Profesor extends Persona {
    String Materia;
    int CargaHoraria;

   
    public Profesor(int idPersona, int dni, String apellido, String nombre, int edad, String genero, double peso, double altura, String domicilio, String materia, int cargaHoraria) {
        super(idPersona, dni, apellido, nombre, edad, genero, peso, altura, domicilio); // Hereda inicialización de Persona
        this.Materia = materia;
        this.CargaHoraria = cargaHoraria;
    }
    
}
