
package avanceproyecto2;

import javax.swing.JOptionPane;

public  abstract class Ejercicios {
   protected String nombre_ejercicio;
   protected String descripcion;
   protected String repeticiones; // cambiar en diagrama
   protected String duracion;

    public Ejercicios(String nombre_ejercicio, String descripcion, String repeticiones, String duracion) {
        this.nombre_ejercicio = nombre_ejercicio;
        this.descripcion = descripcion;
        this.repeticiones = repeticiones;
        this.duracion = duracion;
    }

    public Ejercicios() {
    }
    
    

    public String getNombre_ejercicio() {
        return nombre_ejercicio;
    }

    public void setNombre_ejercicio(String nombre_ejercicio) {
        this.nombre_ejercicio = nombre_ejercicio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getRepeticiones() {
        return repeticiones;
    }

    public void setRepeticiones(String repeticiones) {
        this.repeticiones = repeticiones;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    
    
    public void verEjercicios(){
       boolean continuar = true;
       while (continuar) {
            String menu = "1. Sentadillas\n"
                        + "2. Zancadas\n"
                        + "3. Dominadas\n"
                        + "4. Peso muerto\n"
                        + "5. Crunches con cable\n"
                        + "6. Fondos en paralelas \n"
                        + "7. Remo con barra \n"
                        + "8. Salir\n";
           
            int opcion = Integer.parseInt(JOptionPane.showInputDialog(menu + "Seleccione una opción que desea ver:"));
            switch (opcion) {
                case 1:
                    nombre_ejercicio = "Sentadillas";
                    descripcion = "es un ejercicio que consiste en flexionar las rodillas y"
                            + " bajar el cuerpo hasta quedar en cuclillas";
                    repeticiones = " 3 series de 6 a 10 repeticiones, dos veces por semana. ";
                    duracion ="4 y 10 minutos a la semana ";
                    mostrar();
                    break;
                  
                case 2: 
                    nombre_ejercicio = "Zancadas";
                    descripcion = "La zancada es un ejercicio de fitness"
                            + " trabajar los músculos de muslos y glúteos. ";
                    repeticiones = "3 series de 10-12 repeticiones por pierna ";
                    duracion = "entre 5 y 15 segundos por serie";
                    mostrar();
                    break;
                
                case 3:
                    nombre_ejercicio = "Dominadas";
                    descripcion = " consiste en levantar el cuerpo mientras se está colgado de una barra."
                            + " Se trata de un ejercicio de fuerza que utiliza el peso corporal como carga. ";
                    repeticiones = " 1 a 3 series de 8 a 12 repeticiones";   
                    duracion = "2 a 6 min aproximadamente por serie.";  
                    mostrar();
                    break;
                
                case 4: 
                    nombre_ejercicio = "Peso Muerto";
                    descripcion = "El peso muerto es un ejercicio de fuerza que consiste en levantar una barra "
                            + "desde el suelo hasta la cintura";
                    repeticiones = "Entre 6 y 12 repeticiones. ";
                    duracion = " 8 a 16 min aproximadamente por serie.";
                    mostrar();
                    break;
                    
                case 5:
                    nombre_ejercicio = "Crunches con cable";
                    descripcion = "Los crunches con cable son un ejercicio abdominal que se realiza con una máquina de "
                            + "polea o cable";
                    repeticiones = "2 o 3 series de 10 a 20 repeticiones";
                    duracion = " 2 a 7 min por serie.";
                    mostrar();
                    break;
                    
                case 6:
                    nombre_ejercicio = "Fondos de paralelas";
                    descripcion = "Los fondos en paralelas son un ejercicios de fuerza utilizando nuestro peso corporal, "
                            + "perfecto para trabajar el pecho y los tríceps.";
                    repeticiones = "2 o 3 series de 8 a 12 repeticiones, 2 o 3 veces por semana";
                    duracion = "4 a 15 minutos por serie";
                    mostrar();
                    break;
                    
                case 7:
                    nombre_ejercicio = "Remo con barra";
                    descripcion = "es un ejercicio de fuerza que se realiza con una barra y que ayuda a desarrollar la espalda, "
                            + "los hombros, los brazos y los glúteos";
                    repeticiones = "8 a 10 repeticiones.";
                    duracion = " 2.5 a 5 min.";
                    mostrar();
                    break;
                
                case 8:
                    continuar = false;
                    break;
                
                
                default:
                    JOptionPane.showMessageDialog(null, "Opción inválida.");
                       
                }
           }
       
    }
    
    public void resistencia(){
       boolean continuar = true;
       while (continuar) {
            String menu = "1. Trotar\n"
                        + "2. Subir escaleras\n"
                        + "3. Burpees\n"
                        + "4. Saltos de cuerda\n"
                        + "5. Salir\n";
           
            int opcion = Integer.parseInt(JOptionPane.showInputDialog(menu + "Seleccione una opción que desea ver:"));
            switch (opcion) {
                case 1:
                    nombre_ejercicio = "Trotar";
                    descripcion = "Trotar es un ejercicio cardiovascular ideal para mejorar la resistencia y quemar calorías.";
                    repeticiones = "30 minutos a un ritmo moderado, 3-4 veces por semana";
                    duracion = "De 20 a 40 minutos por sesión";
                    mostrar();
                    break;
                    
                case 2:
                    nombre_ejercicio = "Subir escaleras";
                    descripcion = "Subir escaleras trabaja las piernas, los glúteos y mejora la resistencia.";
                    repeticiones = "3 series de 10-15 minutos, 2-3 veces por semana";
                    duracion = "De 15 a 20 minutos por serie";
                    mostrar();
                    break;
                    
                case 3:
                    nombre_ejercicio = "Burpees";
                    descripcion = "Los burpees son un ejercicio completo de cuerpo que mejora la fuerza y resistencia.";
                    repeticiones = "3 series de 10-15 repeticiones";
                    duracion = "2-3 minutos por serie";
                    mostrar();
                    break;
                    
                case 4:
                    nombre_ejercicio = "Saltos de cuerda";
                    descripcion = "El salto de cuerda es un ejercicio cardiovascular excelente para mejorar el ritmo y la agilidad.";
                    repeticiones = "3 series de 2-3 minutos";
                    duracion = "De 5 a 10 minutos por sesión";
                    mostrar();
                    break;
                 
                case 5:
                    continuar = false;
                    break;
                
                
                default:
                    JOptionPane.showMessageDialog(null, "Opción inválida.");
                
                }
            }
        }
   public void masa_muscular(){
       boolean continuar = true;
       while (continuar) {
            String menu = "1. Flexiones\n"
                        + "2. Planchas\n"
                        + "3. Extensiones de triceps\n"
                        + "4. Elevaciones laterales de hombros\n"
                        + "5. Salir\n";
           
            int opcion = Integer.parseInt(JOptionPane.showInputDialog(menu + "Seleccione una opción que desea ver:"));
            switch (opcion) {
                case 1:
                    nombre_ejercicio = "Flexiones";
                    descripcion = "Las flexiones son un ejercicio de fuerza que trabaja principalmente el pecho, "
                            + "los hombros y los tríceps.";
                    repeticiones = "3 series de 10-15 repeticiones";
                    duracion = "De 5 a 10 minutos por serie";
                    mostrar();
                    break;
                    
                case 2:
                    nombre_ejercicio = "Planchas";
                    descripcion = "La plancha es un ejercicio de isometría que trabaja todo el core,"
                            + " incluyendo abdominales y espalda baja.";
                    repeticiones = "Mantener 30-60 segundos por serie, 3-4 series";
                    duracion = "De 2 a 4 minutos por sesión";
                    mostrar();
                    break;
                
                case 3:
                    nombre_ejercicio = "Extensiones de triceps";
                    descripcion = "Las extensiones de tríceps son un ejercicio para trabajar la parte"
                            + " posterior de los brazos.";
                    repeticiones = "3 series de 10-12 repeticiones";
                    duracion = "De 3 a 5 minutos por serie";
                    mostrar();
                    break;
                    
                case 4:
                    nombre_ejercicio = "Elevaciones laterales de hombros";
                    descripcion = "Las elevaciones laterales son un ejercicio de aislamiento para trabajar los hombros.";
                    repeticiones = "3 series de 10-15 repeticiones";
                    duracion = "De 3 a 6 minutos por serie";
                    mostrar();
                    break;
                
                case 5:
                    continuar = false;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción inválida.");
                    continue;
                    
                }
            }
        }
   public void mostrar(){
        String informacion = "Nombre del Ejercicio: " +  nombre_ejercicio +"\n"
                          + "Descripcion: " + descripcion + "\n"
                          + "Numero de Repeticiones: " + repeticiones +"\n"
                          + "Duracion: " + duracion + "\n";
                                    
        JOptionPane.showMessageDialog(null, informacion);
                            
               
   }
   
   
   
   public void recomendacion(){
       
        }   
       // el usuario va a poder agregar una recomendacion para algun ejercicio
    }

