
package avanceproyecto2;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        Usuario usuario = new Usuario();  
        
        usuario.archivo();  
        
        // Menú de inicio de sesión / creación de cuenta
        boolean accesoConcedido = false;
        while (!accesoConcedido) {
            String menuUsuario = "1. Crear cuenta\n"
                               + "2. Iniciar sesión\n"
                               + "3. Salir\n";
            
            int opcionUsuario = Integer.parseInt(JOptionPane.showInputDialog(menuUsuario + "Seleccione una opción:"));
            switch (opcionUsuario) {
                case 1:
                    usuario.crear_cuenta();  // Método para crear una cuenta
                    break;
                case 2:
                    accesoConcedido = usuario.login();  // Método para iniciar sesión
                    if (accesoConcedido) {
                        JOptionPane.showMessageDialog(null, "Inicio de sesión exitoso.");
                    } else {
                        JOptionPane.showMessageDialog(null, "Credenciales incorrectas.");
                    }
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Saliendo del sistema.");
                    System.exit(0);  // Salir del programa
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción inválida.");
            }
        }
         Crear_Rutina crearRutina = new Crear_Rutina();  // Crear una instancia de la clase Crear_Rutina

        // Crear una instancia de la clase Instructor
        Instructor instructor = new Instructor();

        // Menú principal para que el usuario elija qué tipo de ejercicio desea
        String menu = "1. Ver ejercicios\n"
                    + "2. Ejercicios de resistencia\n"
                    + "3. Ejercicios para masa muscular\n"
                    + "4. Crear rutina personalizada\n"
                    + "5. Ver instructores\n"   // Agregar opción para ver los instructores
                    + "6. Salir\n";

        boolean continuar = true;
        while (continuar) {
            int opcion = Integer.parseInt(JOptionPane.showInputDialog(menu + "Seleccione una opción:"));
            switch (opcion) {
                case 1:
                    crearRutina.verEjercicios();  // Llamar al método para ver los ejercicios generales
                    break;
                case 2:
                    crearRutina.resistencia();  // Llamar al método para ver ejercicios de resistencia
                    break;
                case 3:
                    crearRutina.masa_muscular();  // Llamar al método para ver ejercicios para masa muscular
                    break;
                case 4:
                    crearRutina.verEjercicios1();  // Llamar al método para crear rutina personalizada
                    break;
                case 5:
                    // Llamar a los métodos de la clase Instructor
                    String submenuInstructores = "1. Ver información de instructores\n"
                                                + "2. Seleccionar instructores\n"
                                                + "3. Salir\n";
                    int opcionInstructor = Integer.parseInt(JOptionPane.showInputDialog(submenuInstructores + "Seleccione una opción:"));
                    switch (opcionInstructor) {
                        case 1:
                            instructor.verInformacion();  // Ver información de instructores
                            break;
                        case 2:
                            instructor.elegir();  // Seleccionar instructores
                            break;
                        case 3:
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Opción inválida.");
                    }
                    break;
                case 6:
                    continuar = false;  // Salir del programa
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción inválida.");
            }
        }
    }
}