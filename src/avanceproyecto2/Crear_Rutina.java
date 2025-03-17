
package avanceproyecto2;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Crear_Rutina extends Ejercicios {
    private ArrayList<String> rutinaPersonalizada;

    public Crear_Rutina(String nombre_ejercicio, String descripcion, String repeticiones, String duracion) {
        super(nombre_ejercicio, descripcion, repeticiones, duracion);
        rutinaPersonalizada = new ArrayList<>(); 
         
    }

    public Crear_Rutina() {
         rutinaPersonalizada = new ArrayList<>();  
    }
    public interface Rutina {
    void mostrarRutina();
    }
    
    
    public void verEjercicios1() {
        boolean continuar = true;
        while (continuar) {
            // Menú de ejercicios disponibles
            String menu = "1. Sentadillas\n"
                        + "2. Zancadas\n"
                        + "3. Dominadas\n"
                        + "4. Peso muerto\n"
                        + "5. Crunches con cable\n"
                        + "6. Fondos en paralelas\n"
                        + "7. Remo con barra\n"
                        + "8. Trotar\n"
                        + "9. Subir escaleras\n"
                        + "10. Burpees\n"
                        + "11. Saltos de cuerda\n"
                        + "12. Flexiones\n"
                        + "13. Planchas\n"
                        + "14. Extensiones de tríceps\n"
                        + "15. Elevaciones laterales\n"
                        + "16. Ver rutina actual\n"
                        + "17. Salir\n";
           
            int opcion = Integer.parseInt(JOptionPane.showInputDialog(menu + "Seleccione una opción que desea ver:"));
            switch (opcion) {
                case 1:
                    nombre_ejercicio = "Sentadillas";
                    repeticiones = "3 series de 6 a 10 repeticiones, dos veces por semana.";
                    duracion = "4 y 10 minutos a la semana";
                    mostrar();
                    agregarEjercicioARutina("Sentadillas");
                    break;
                  
                case 2:
                    nombre_ejercicio = "Zancadas";
                    repeticiones = "3 series de 10-12 repeticiones por pierna";
                    super.duracion = "entre 5 y 15 segundos por serie";
                    mostrar();
                    agregarEjercicioARutina("Zancadas");
                    break;
                
                case 3:
                    nombre_ejercicio = "Dominadas";
                    repeticiones = "1 a 3 series de 8 a 12 repeticiones";
                    duracion = "2 a 6 min aproximadamente por serie.";
                    mostrar();
                    agregarEjercicioARutina("Dominadas");
                    break;
                
                case 4:
                    nombre_ejercicio = "Peso Muerto";
                    repeticiones = "Entre 6 y 12 repeticiones.";
                    duracion = "8 a 16 min aproximadamente por serie.";
                    mostrar();
                    agregarEjercicioARutina("Peso Muerto");
                    break;
                    
                case 5:
                    nombre_ejercicio = "Crunches con cable";
                    descripcion = "Los crunches con cable son un ejercicio abdominal que se realiza con una máquina de polea o cable.";
                    repeticiones = "2 o 3 series de 10 a 20 repeticiones";
                    duracion = "2 a 7 min por serie.";
                    mostrar();
                    agregarEjercicioARutina("Crunches con cable");
                    break;
                    
                case 6:
                    nombre_ejercicio = "Fondos de paralelas";
                    descripcion = "Los fondos en paralelas son un ejercicio de fuerza utilizando nuestro peso corporal, perfecto para trabajar el pecho y los tríceps.";
                    repeticiones = "2 o 3 series de 8 a 12 repeticiones, 2 o 3 veces por semana";
                    duracion = "4 a 15 minutos por serie";
                    mostrar();
                    agregarEjercicioARutina("Fondos en paralelas");
                    break;
                    
                case 7:
                    nombre_ejercicio = "Remo con barra";
                    repeticiones = "8 a 10 repeticiones.";
                    duracion = "2.5 a 5 min.";
                    mostrar();
                    agregarEjercicioARutina("Remo con barra");
                    break;

                case 8:
                    nombre_ejercicio = "Trotar";
                    repeticiones = "30 minutos de trote continuo.";
                    duracion = "30 minutos aproximadamente por serie.";
                    mostrar();
                    agregarEjercicioARutina("Trotar");
                    break;

                case 9:
                    nombre_ejercicio = "Subir escaleras";
                    repeticiones = "3 series de 5 minutos subiendo escaleras.";
                    duracion = "5 a 10 minutos por serie.";
                    mostrar();
                    agregarEjercicioARutina("Subir escaleras");
                    break;

                case 10:
                    nombre_ejercicio = "Burpees";
                    repeticiones = "3 series de 10 repeticiones.";
                    duracion = "1 a 3 minutos por serie.";
                    mostrar();
                    agregarEjercicioARutina("Burpees");
                    break;

                case 11:
                    nombre_ejercicio = "Saltos de cuerda";
                    repeticiones = "3 series de 1 minuto.";
                    duracion = "1 a 3 minutos por serie.";
                    mostrar();
                    agregarEjercicioARutina("Saltos de cuerda");
                    break;

                case 12:
                    nombre_ejercicio = "Flexiones";
                    repeticiones = "4 series de 15 repeticiones.";
                    duracion = "3 a 5 minutos por serie.";
                    mostrar();
                    agregarEjercicioARutina("Flexiones");
                    break;

                case 13:
                    nombre_ejercicio = "Planchas";
                    repeticiones = "Mantener 1 minuto por serie.";
                    duracion = "1 minuto aproximadamente por serie.";
                    mostrar();
                    agregarEjercicioARutina("Planchas");
                    break;

                case 14:
                    nombre_ejercicio = "Extensiones de tríceps";
                    repeticiones = "3 series de 12 repeticiones.";
                    duracion = "2 a 4 minutos por serie.";
                    mostrar();
                    agregarEjercicioARutina("Extensiones de tríceps");
                    break;

                case 15:
                    nombre_ejercicio = "Elevaciones laterales";
                    repeticiones = "3 series de 12 repeticiones.";
                    duracion = "2 a 4 minutos por serie.";
                    mostrar();
                    agregarEjercicioARutina("Elevaciones laterales");
                    break;

                case 16:
                    
                     mostrarRutina();
                    break;
                
                case 0:
                    continuar = false;
                    break;
                    
                    
                
                default:
                    JOptionPane.showMessageDialog(null, "Opción inválida.");
            }
        }
    }
   public void agregarEjercicioARutina(String ejercicio) {
        // Agregamos el ejercicio solo si no existe previamente
        for (String e : rutinaPersonalizada) {
            if (e.equals(ejercicio)) {
                JOptionPane.showMessageDialog(null, ejercicio + " ya está en tu rutina.");
                return;
            }
        }
        rutinaPersonalizada.add(ejercicio);
        JOptionPane.showMessageDialog(null, ejercicio + " ha sido agregado a tu rutina.");
    }
    public void mostrarRutina() {
        if (rutinaPersonalizada.size() == 0) {
            JOptionPane.showMessageDialog(null, "No has agregado ejercicios a tu rutina.");
        } else {
            String rutina = "Tu rutina personalizada:\n";
            int contador = 1;
            // Iterar sobre la rutina y mostrar cada ejercicio
            for (int i = 0; i < rutinaPersonalizada.size(); i++) {
                rutina += contador + ". " + rutinaPersonalizada.get(i) + "\n";
                contador++;
            }
            JOptionPane.showMessageDialog(null, rutina);
        }
    }
}
    
    
