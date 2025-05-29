// Kiara Meza
// 1- Crear una clase “Persona”, con los siguientes atributos:
// a. IdPersona: numérico entero
// b. Dni: numérico entero
// c. Apellido: cadena de texto
// d. Nombre: cadena de texto
// e. Edad: numérico entero
// f. Género: texto
// g. Peso: numérico con decimales
// h. Altura: numérico con decimales
// i. Domicilio: cadena de texto

// 5- Crear los siguientes métodos de la clase Persona:
//a. Info: Debe devolver una cadena que integre el DNI, 
//   Apellido, Nombre y Domicilio
//b. IMC: Indice masa corporal. A partir del cálculo Peso en 
//   kg/Altura elevado al cuadrado en m). Si el resultado es
//   menor a 20 mostrar: “Debajo de su peso ideal”. Si el resultado
//   está entre 20 y 25 mostrar: “Está en su peso ideal”. Si es mayor
//   a 25, mostrar “Sobrepeso”.
//c. esMayorDeEdad: indica si es mayor o igual a 18 años. 
//   Devuelve un valor booleano.

package trabajocuatro_completo;

public class Persona {
	int idPersona;
	int Dni;
	String Apellido;
	String Nombre;
	int Edad;
	String Genero;
	double Peso;
	double Altura;
	String Domicilio;
	
	public Persona() {
		
	}
	
	public Persona (int idPersona, int dni, String apellido, String nombre, int edad, String genero, double peso, double altura, String domicilio) {
		
		this.idPersona = idPersona;
        this.Dni = dni;
        this.Apellido = apellido;
        this.Nombre = nombre;
        this.Edad = edad;
        this.Genero = genero;
        this.Peso = peso;
        this.Altura = altura;
        this.Domicilio = domicilio;
			
	}
	
	// Método info: 
	// devuelve DNI, Apellido, Nombre y Domicilio en una sola cadena
    public String info() {
        return "DNI: " + Dni + ", Apellido: " + Apellido + ", Nombre: " + Nombre + ", Domicilio: " + Domicilio;
    }

    // Método IMC:
    // calcula el índice de masa corporal y
    // devuelve el IMC y un mensaje según el resultado
    public double calcularIMC() {
        return Peso / (Altura * Altura);
    }

    public String mensajeIMC() {
        double imc = calcularIMC();
        if (imc < 20) {
            return "Debajo de su peso ideal";
        } else if (imc <= 25) {
            return "Está en su peso ideal";
        } else {
            return "Sobrepeso";
        }
    }
    

    // Método esMayorDeEdad: 
    // devuelve true si Edad >= 18, false si no
    public boolean esMayorDeEdad() {
        return Edad >= 18;
    }
	
}

