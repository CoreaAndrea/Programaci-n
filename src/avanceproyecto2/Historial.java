
package avanceproyecto2;


import javax.swing.JOptionPane;

public class Historial {
    public void mostrarHistorial(Instructor instructor) {
        if (instructor.getI_Seleccionado().isEmpty()) {
            JOptionPane.showMessageDialog(null, "No ha seleccionado ningún instructor.");
        } else {
            String historial = "Instructores seleccionados:\n";
            for (Instructor selectedInstructor : instructor.getI_Seleccionado()) {
                historial += "Instructor: " + selectedInstructor.getInstructor() + " - Día: " + selectedInstructor.getDia() + " - Hora: " + selectedInstructor.getHora() + "\n";
            }
            JOptionPane.showMessageDialog(null, historial);
        }
    }
    public void mostrarRutina(Crear_Rutina crearRutina) {
        if (crearRutina != null) {
            crearRutina.mostrarRutina();  
        } else {
            JOptionPane.showMessageDialog(null, "No se ha creado ninguna rutina.");
        }
    }
    
}
    

