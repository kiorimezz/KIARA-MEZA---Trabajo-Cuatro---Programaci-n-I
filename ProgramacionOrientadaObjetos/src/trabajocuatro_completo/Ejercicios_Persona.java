// Kiara Meza
// 2- Crear objetos a partir de la clase “Persona”. 
//    Crear 5 personas.

// 3- Instanciar 10 objetos de la clase “Persona” y
//    guardarlos en un arreglo.

// 4- Con un bucle for, recorrer el arreglo y mostrar todos
//    los datos de los objetos por pantalla.

package trabajocuatro_completo;

public class Ejercicios_Persona {
    public static void main(String[] args) {
        Persona persona1 = new Persona(1, 35000001, "López", "Ana", 25, "Femenino", 60.5, 1.65, "Calle Belgrano 123");
        Persona persona2 = new Persona(2, 35000002, "Gómez", "Carlos", 30, "Masculino", 80.0, 1.80, "Av. Jose San Martín 742");
        Persona persona3 = new Persona(3, 35000003, "Pérez", "Laura", 28, "Femenino", 55.0, 1.60, "Calle Don Bosco 456");
        Persona persona4 = new Persona(4, 35000004, "Martínez", "José", 35, "Masculino", 85.5, 1.75, "Av. Sol 789");
        Persona persona5 = new Persona(5, 35000005, "Ramírez", "Lucía", 22, "Femenino", 58.3, 1.68, "Calle General Rosas 101");

    
    Persona[] personas = new Persona[10];
    
    
    for (int i = 0; i < personas.length; i++) {
        personas[i] = new Persona(
            i + 1,
            35000010 + i,
            "Apellido" + (i + 1),
            "Nombre" + (i + 1),
            20 + i,
            (i % 2 == 0) ? "Masculino" : "Femenino",
            60 + i,
            1.60 + (i * 0.01),
            "Calle " + (i + 1)
        );
        
        Persona p = personas[i];
        System.out.println("Persona " + (i + 1) + ":");
        System.out.println("ID: " + p.idPersona);
        System.out.println("Nombre: " + p.Nombre);
        System.out.println("Apellido: " + p.Apellido);
        System.out.println("Edad: " + p.Edad);
        System.out.println("DNI: " + p.Dni);
        System.out.println("Género: " + p.Genero);
        System.out.println("Peso: " + p.Peso);
        System.out.println("Altura: " + p.Altura);
        System.out.println("Domicilio: " + p.Domicilio);
        System.out.println(" ");
        System.out.println(" ");
        
    	}
    }
}