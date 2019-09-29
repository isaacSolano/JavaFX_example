package com.JavaFX.TL;

import com.JavaFX.BL.UsuarioBL;

import java.util.ArrayList;

public class Controller {
    UsuarioBL logica = new UsuarioBL();

    public void registrarUsuario(String paramNombre, String paramApellido){
        logica.registrarUsuario(paramNombre, paramApellido);
    }

    public ArrayList<String> obtenerUsuarios(){
        ArrayList<String> listaUsuarios = logica.obtenerUsuarios();

        return listaUsuarios;
    }
}
