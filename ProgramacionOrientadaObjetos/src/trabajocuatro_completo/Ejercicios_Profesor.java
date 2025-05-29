// Kiara Meza
// 8- Instanciar 10 objetos de la clase “Profesor” y
//    guardarlos en un arreglo.

// 9- Con un bucle for, recorrer el arreglo del punto 8 
//    completo y mostrar por pantalla todos los datos de los 
//    Profesores que tengan Carga Horaria mayor a 10.

package trabajocuatro_completo;

public class Ejercicios_Profesor {
    public static void main(String[] args) {
    	
        Profesor[] profesores = new Profesor[10];

        for (int i = 0; i < profesores.length; i++) {
            profesores[i] = new Profesor(
                i + 1,
                40000000 + i,
                "Apellido" + (i + 1),
                "Nombre" + (i + 1),
                30 + i,
                (i % 2 == 0) ? "Masculino" : "Femenino",
                70 + i,
                1.70 + (i * 0.01),
                "Calle " + (i + 1),
                "Materia " + (i + 1),
                5 + i
            );
        }
        
        System.out.println("Profesores con carga horaria mayor a 10:");
        for (int i = 0; i < profesores.length; i++) {
            Profesor p = profesores[i];
            if (p.CargaHoraria > 10) {
                System.out.println("ID: " + p.idPersona);
                System.out.println("Nombre: " + p.Nombre);
                System.out.println("Apellido: " + p.Apellido);
                System.out.println("Edad: " + p.Edad);
                System.out.println("DNI: " + p.Dni);
                System.out.println("Género: " + p.Genero);
                System.out.println("Peso: " + p.Peso);
                System.out.println("Altura: " + p.Altura);
                System.out.println("Domicilio: " + p.Domicilio);
                System.out.println("Materia: " + p.Materia);
                System.out.println("Carga Horaria: " + p.CargaHoraria);
                System.out.println(" ");
                System.out.println(" ");
            }
        }
    }
}

