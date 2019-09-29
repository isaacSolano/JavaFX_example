package com.JavaFX.BL;

public class Usuario {
    private String nombre;
    private String apellido;

    public Usuario(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String toString(){
        String infoUsuario = "Nombre: " + this.nombre + " Apellido: " + this.apellido;

        return infoUsuario;
    }
}
