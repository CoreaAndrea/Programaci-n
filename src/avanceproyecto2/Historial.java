
package avanceproyecto2;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javax.swing.JOptionPane;

public class Historial {
    public void mostrarHistorial(Instructor instructor) {
        
         String historial = "Instructores seleccionados:\n";
        for (Instructor selectedInstructor : instructor.getI_Seleccionado()) {
            historial += "Instructor: " + selectedInstructor.getInstructor() + 
                         " - Día: " + selectedInstructor.getDia() + 
                         " - Hora: " + selectedInstructor.getHora() + "\n";
        }
        JOptionPane.showMessageDialog(null, historial);
    }

    
    public void mostrarRutina(Crear_Rutina crearRutina) {
        if (crearRutina != null) {
            crearRutina.mostrarRutina();  
        } else {
            JOptionPane.showMessageDialog(null, "No se ha creado ninguna rutina.");
        }
    }

    
    public void guardarHistorial(Crear_Rutina crearRutina, Instructor instructor) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("historial.dat"))) {
            oos.writeObject(crearRutina);
            oos.writeObject(instructor);
            JOptionPane.showMessageDialog(null, "Historial y rutina guardados correctamente en historial.dat.");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al guardar el historial.");
        }
    }

    
    public void cargarHistorial() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("historial.dat"))) {
            Crear_Rutina rutinaCargada = (Crear_Rutina) ois.readObject();
            Instructor instructorCargado = (Instructor) ois.readObject();

            JOptionPane.showMessageDialog(null, "Datos cargados correctamente.");
            mostrarRutina(rutinaCargada);
            mostrarHistorial(instructorCargado);

        } catch (IOException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "No se encontraron datos guardados.");
        }
    }
}