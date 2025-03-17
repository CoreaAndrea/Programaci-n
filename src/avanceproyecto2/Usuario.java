
package avanceproyecto2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Usuario implements Serializable{
    private String nombre;
    private String apellido;
    private String contrasena;
    private String usuario;
    private static ArrayList<Usuario> usuarios = new ArrayList<>();

    public Usuario(String nombre, String apellido, String usuario, String contrasena) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.contrasena = contrasena;
        this.usuario = usuario;
    }

    public Usuario() {
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public static ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public static void setUsuarios(ArrayList<Usuario> usuarios) {
        Usuario.usuarios = usuarios;
    }
    public void archivo(){
        try{
            FileOutputStream archivo = new FileOutputStream("Clientes.usuario");
            ObjectOutputStream output = new ObjectOutputStream(archivo);
            output.writeObject(usuarios);
            output.close();
            archivo.close();
            System.out.println("Usuarios guardados: " + usuarios.size());
            for (Usuario u : usuarios) {
             System.out.println("Usuario: " + u.getUsuario() + ", Contraseña: " + u.getContrasena());
        }
         } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al guardar usuarios.");
        }
    
    }
    public void buscarUsuario(){
        try {
        FileInputStream archivo = new FileInputStream("Clientes.usuario");
        ObjectInputStream input = new ObjectInputStream(archivo);
        Object obj = input.readObject();
        
        try {
            usuarios = (ArrayList<Usuario>) obj;  
            System.out.println("Usuarios cargados correctamente");
        } catch (ClassCastException e) {
            usuarios = new ArrayList<>();
            System.out.println("El archivo no contiene un ArrayList<Usuario> válido");
        }
        
        input.close();
        archivo.close();
    } catch (IOException | ClassNotFoundException e) {
        System.out.println("Error al leer el archivo: " + e.getMessage());
        usuarios = new ArrayList<>();
    }

    
    }
     public void crear_cuenta(){
        nombre = JOptionPane.showInputDialog("Ingrese su nombre: ");
        apellido = JOptionPane.showInputDialog("Ingrese su apellido: ");
        usuario = JOptionPane.showInputDialog("Ingrese un usuario para ingresar al sistema: ");
        contrasena = JOptionPane.showInputDialog("Ingrese una contrasena para ingresar al sistema: ");
        
        usuarios.add(new Usuario(nombre, apellido, usuario, contrasena));
        archivo();
        JOptionPane.showMessageDialog(null, "Cuenta creada exitosamente.");
     
    }  
    public boolean login(){
        int intentos = 0; 
        boolean loginExitoso = false;
        
        while (intentos < 3 && !loginExitoso) {
            String usuario_i = JOptionPane.showInputDialog("Ingrese su usuario: ");
            String contrasena_i = JOptionPane.showInputDialog("Ingrese su clave: ");
        
            System.out.println("Usuario ingresado: " + usuario_i);
            System.out.println("Contraseña ingresada: " + contrasena_i);

       
           for (Usuario u : usuarios) {
                if (u.getUsuario().equals(usuario_i) && u.getContrasena().equals(contrasena_i)) {
                JOptionPane.showMessageDialog(null, "Inicio de sesión exitoso. Bienvenido " + u.getNombre() + "!");
                loginExitoso = true; 
                return true;
            }
        }
        
        intentos++; 
        if (intentos < 3) {
            JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos. ");
        }
    }
    
    
    if (!loginExitoso) {
        JOptionPane.showMessageDialog(null, "Has agotado los 3 intentos. Intenta más tarde.");
    }

    return false;
    }
}