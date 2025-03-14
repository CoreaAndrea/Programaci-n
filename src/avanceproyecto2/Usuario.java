
package avanceproyecto2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Usuario {
    private String nombre;
    private String apellido;
    private String contrasena;
    private String usuario;
    private static ArrayList<Usuario> usuarios = new ArrayList<>();

    public Usuario(String nombre, String apellido, String contrasena, String usuario) {
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
            FileOutputStream archivo = new FileOutputStream("Clientes.usuarios");
            ObjectOutputStream output = new ObjectOutputStream(archivo);
            output.writeObject(usuarios);
            output.close();
            archivo.close();
         } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al guardar usuarios.");
        }
    
    }
    public void buscarUsuario(){
        try {
            FileInputStream archivo = new FileInputStream("Clientes.usuarios");
            ObjectInputStream input = new ObjectInputStream(archivo);
            usuarios = (ArrayList<Usuario>) input.readObject();
            input.close();
            archivo.close();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("No se encontró el archivo de usuarios.");
        }
    
    }
     public void crear_cuenta(){
        nombre = JOptionPane.showInputDialog("Ingrese su nombre: ");
        apellido = JOptionPane.showInputDialog("Ingrese su apellido: ");
        usuario = JOptionPane.showInputDialog("Ingrese una clave para ingresar al sistema: ");
        contrasena = JOptionPane.showInputDialog("Ingrese una contrasena para ingresar al sistema: ");
        
        usuarios.add(new Usuario(nombre, apellido, contrasena, usuario));
        archivo();
        JOptionPane.showMessageDialog(null, "Cuenta creada exitosamente.");
     
    }  
    public boolean login(){
        buscarUsuario();
        String usuario_i = JOptionPane.showInputDialog("Ingrese su usuario: ");
        String contrasena_i = JOptionPane.showInputDialog("Ingrese su clave: ");
        
        for (Usuario u : usuarios){
            if (u.getUsuario().equals(usuario_i) && u.getContrasena().equals(contrasena_i)) {
                JOptionPane.showMessageDialog(null, "Inicio de sesión exitoso. Bienvenido " + u.getNombre() + "!");
                return true;
            }
            
        }
        JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos.");
        return false;
     
    }
    
    
}
