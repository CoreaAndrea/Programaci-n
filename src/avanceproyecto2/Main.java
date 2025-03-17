
package avanceproyecto2;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        Usuario usuario = new Usuario();  
        Historial historial = new Historial();
        
        
        usuario.archivo();  
        
        
        boolean accesoConcedido = false;
        while (!accesoConcedido) {
            String menuUsuario = "1. Crear cuenta\n"
                               + "2. Iniciar sesión\n"
                               + "3. Salir\n";
            
            int opcionUsuario = Integer.parseInt(JOptionPane.showInputDialog(menuUsuario + "Seleccione una opción:"));
            switch (opcionUsuario) {
                case 1:
                    usuario.crear_cuenta();  
                    break;
                case 2:
                    accesoConcedido = usuario.login(); 
                    if (accesoConcedido) {
                        JOptionPane.showMessageDialog(null, "Inicio de sesión exitoso.");
                    } else {
                        JOptionPane.showMessageDialog(null, "Credenciales incorrectas.");
                    }
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Saliendo del sistema.");
                    System.exit(0);  
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción inválida.");
            }
        }
        Crear_Rutina crearRutina = new Crear_Rutina(); 

        Instructor instructor = new Instructor();

        
        String menu = "1. Ver ejercicios\n"
                    + "2. Ejercicios de resistencia\n"
                    + "3. Ejercicios para masa muscular\n"
                    + "4. Crear rutina personalizada\n"
                    + "5. Ver instructores\n" 
                    + "5. Ver Historial\n" 
                    + "6. Salir\n";

        boolean continuar = true;
        while (continuar) {
            int opcion = Integer.parseInt(JOptionPane.showInputDialog(menu + "Seleccione una opción:"));
            switch (opcion) {
                case 1:
                    crearRutina.verEjercicios();  
                    break;
                case 2:
                    crearRutina.resistencia();  
                    break;
                case 3:
                    crearRutina.masa_muscular();  
                    break;
                case 4:
                    crearRutina.verEjercicios1(); 
                    break;
                case 5:
                    
                    String submenuInstructores = "1. Ver información de instructores\n"
                                                + "2. Seleccionar instructores\n"
                                                + "3. Salir\n";
                    int opcionInstructor = Integer.parseInt(JOptionPane.showInputDialog(submenuInstructores + "Seleccione una opción:"));
                    switch (opcionInstructor) {
                        case 1:
                            instructor.verInformacion(); 
                            break;
                        case 2:
                            instructor.elegir();  
                            break;
                        case 3:
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Opción inválida.");
                    }
                    break;
                
                case 6:
                    historial.mostrarHistorial(instructor);
                    historial.mostrarRutina(crearRutina);
                    break;
                
                case 7:
                    continuar = false;  
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción inválida.");
            }
        }
    }
}