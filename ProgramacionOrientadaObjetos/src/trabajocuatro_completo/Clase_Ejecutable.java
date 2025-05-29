// Kiara Meza
// 6- Crear una clase ejecutable que haga lo siguiente:
// a. Pedir al usuario el ingreso de los datos de 3 Personas, creando para cada una de ellas
//    un objeto.
// b. Para cada objeto deberá comprobar su IMC mostrando 
//    el resultado.
// c. Para cada objeto deberá calcular si es Mayor de Edad, 
//    mostrando el resultado.
// d. Para cada objeto mostrar la info del mismo

package trabajocuatro_completo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Clase_Ejecutable {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Persona[] personas = new Persona[3];

        try {
            for (int i = 0; i < personas.length; i++) {
                System.out.println("Ingrese datos para la persona " + (i + 1));

                System.out.print("ID: ");
                int id = Integer.parseInt(br.readLine());

                System.out.print("DNI: ");
                int dni = Integer.parseInt(br.readLine());

                System.out.print("Apellido: ");
                String apellido = br.readLine();

                System.out.print("Nombre: ");
                String nombre = br.readLine();

                System.out.print("Edad: ");
                int edad = Integer.parseInt(br.readLine());

                System.out.print("Género: ");
                String genero = br.readLine();

                System.out.print("Peso (kg): ");
                double peso = Double.parseDouble(br.readLine());

                System.out.print("Altura (m): ");
                double altura = Double.parseDouble(br.readLine());

                System.out.print("Domicilio: ");
                String domicilio = br.readLine();

                personas[i] = new Persona(id, dni, apellido, nombre, edad, genero, peso, altura, domicilio);
                System.out.println();
            }

            // Mostrar resultados
            for (int i = 0; i < personas.length; i++) {
                Persona p = personas[i];
                System.out.println("Persona " + (i + 1) + ":");
                System.out.println(p.info());
                System.out.printf("IMC: %.2f\n", p.calcularIMC());
                System.out.println("Estado IMC: " + p.mensajeIMC());
                System.out.println("¿Es mayor de edad? " + (p.esMayorDeEdad() ? "Sí" : "No"));
                System.out.println(" ");
                System.out.println(" ");
            }

        } catch (IOException e) {
            System.out.println("Error en la entrada de datos.");
        } catch (NumberFormatException e) {
            System.out.println("Error: Debe ingresar un número válido.");
        }
    }
}