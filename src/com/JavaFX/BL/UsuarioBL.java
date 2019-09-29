package com.JavaFX.BL;

import java.util.ArrayList;

public class UsuarioBL {
    ArrayList<Usuario> listaUsuarios = new ArrayList<Usuario>();

    public void registrarUsuario(String paramNombre, String paramApellido){
        Usuario nuevoUsuario = new Usuario(paramNombre, paramApellido);

        listaUsuarios.add(nuevoUsuario);
    }

    public ArrayList<String> obtenerUsuarios(){
        ArrayList<String> retornarListaUsuarios = new ArrayList<String>();

        for(Usuario usuario : listaUsuarios){
            String infoUsuario = usuario.toString();

            retornarListaUsuarios.add(infoUsuario);
        }
        return retornarListaUsuarios;
    }
}
