
package avanceproyecto2;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Instructor {
    private String instructor;
    private String dia;
    private String hora;
    private ArrayList<Instructor> i_Seleccionado = new ArrayList<>();
    private static final int contador = 3;

    public Instructor(String instructor, String dia, String hora) {
        this.instructor = instructor;
        this.dia = dia;
        this.hora = hora;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public ArrayList<Instructor> getI_Seleccionado() {
        return i_Seleccionado;
    }

    public void setI_Seleccionado(ArrayList<Instructor> i_Seleccionado) {
        this.i_Seleccionado = i_Seleccionado;
    }
    

    

    public Instructor() {
    }
    
    
    
    public void verInformacion(){
        boolean continuar = true;
        while (continuar) {
            String menu = "1. Andres Lopez \n"
                        + "2. Mariana Martinez\n"
                        + "3. Alexander Molina\n"
                        + "4. Gorge Mora\n"
                        + "5. Salir\n";
           
            int opcion = Integer.parseInt(JOptionPane.showInputDialog(menu + "Seleccione al instructor que desea: "));
            switch (opcion) {
                case 1:
                    instructor = "Andres Lopez";
                    dia = "Martes";
                    hora = "6:00 am a 8:00 am";
                    mostrar_info();
                    break;
                    
                case 2:
                    instructor = "Mariana Martinez";
                    dia = "jueves";
                    hora = "8:00 am a 10:00 am";
                    mostrar_info();
                    break;
                    
                case 3:
                    instructor = "Alexander Molina";
                    dia = "Viernes";
                    hora = "2:00 am a 4:00 am";
                    mostrar_info();
                    break;
                    
                case 4:
                    instructor = "Gorge Mora";
                    dia = "Lunes";
                    hora = "4:00 pm a 6:00 pm";
                    mostrar_info();
                    break;
                    
                case 5:
                    continuar = false;
                    break;
                
                
                default:
                    JOptionPane.showMessageDialog(null, "Opción inválida.");
          
                }
            }
        }
    private void mostrar_info(){
        String informacion = "Nombre del Ejercicio: " +  instructor +"\n"
                          + "Dia: " + dia + "\n"
                          + "Numero de Repeticiones: " + hora +"\n";
        
         JOptionPane.showMessageDialog(null, informacion);
        
                          
    }
    
    public void elegir(){
        boolean continuar = true;
        
        while (continuar) {
            String menu = "1. Andres Lopez\n"
                       + "2. Mariana Martinez\n"
                       + "3. Alexander Molina\n"
                       + "4. Gorge Mora\n"
                       + "5. Ver instructores seleccionados\n"
                       + "6. Salir\n";

            int opcion = Integer.parseInt(JOptionPane.showInputDialog(menu + "Seleccione el instructor que desea agregar: "));
            switch (opcion){
                case 1:
                    if (i_Seleccionado.size() < contador){
                        agregarInstructor(new Instructor("Andres Lopez", "Martes", "6:00 am a 8:00 am"));
                        
                    }else{
                        JOptionPane.showMessageDialog(null, "Ya ha seleccionado el máximo de instructores.");
                    }
                    break;
                
                case 2:
                    if (i_Seleccionado.size() < contador){
                        agregarInstructor(new Instructor("Mariana Martinez", "Jueves", "8:00 am a 10:00 am"));
                        
                    }else{
                        JOptionPane.showMessageDialog(null, "Ya ha seleccionado el máximo de instructores.");
                    }
                    break;
                    
                case 3:
                    if (i_Seleccionado.size() < contador){
                        agregarInstructor(new Instructor("Alexander Molina", "Viernes", "2:00 am a 4:00 am"));
                    }else{
                        JOptionPane.showMessageDialog(null, "Ya ha seleccionado el máximo de instructores.");    
                    
                    }
                    break;
                    
                case 4:
                    if (i_Seleccionado.size() < contador){
                        agregarInstructor(new Instructor("Gorge Mora", "Lunes", "4:00 pm a 6:00 pm")); 
                    
                    }else{
                        JOptionPane.showMessageDialog(null, "Ya ha seleccionado el máximo de instructores."); 
      
                    }
                    break;
                    
                case 5:
                    mostrar();
                    break;
                
                case 6:
                    continuar = false;
                    break;
                
                default:
                    JOptionPane.showMessageDialog(null, "Opción inválida.");
                 
                    
                }
            }
   
    }
    private void agregarInstructor(Instructor instructor) {
        i_Seleccionado.add(instructor);
        JOptionPane.showMessageDialog(null, "Instructor agregado: " + instructor.instructor);
    }
    private void mostrar() {
        if(i_Seleccionado.size() == 0){
            JOptionPane.showMessageDialog(null, "No ha seleccionado ningún instructor.");
            
        }else{
            String seleccionados = "Intructores para sus entrenamientos:\n";
            for(Instructor in : i_Seleccionado){
                seleccionados += "Instructor: " + in.instructor + " - Día: " + in.dia + " - Hora: " + in.hora + "\n";
                
            }
            JOptionPane.showMessageDialog(null, seleccionados);
             
        }
    }
}

    

