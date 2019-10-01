package com.JavaFX.UI;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;


import java.util.ArrayList;

import com.JavaFX.TL.Controller;

public class UIController {
    public Label outputEstado;
    public TextField inputNombre;
    public TextField inputApellido;
    public GridPane panelUsuarios;

    Controller gestor = new Controller();

    public void registrarUsuario(ActionEvent actionEvent){
        String nombre = inputNombre.getText();
        String apellido = inputApellido.getText();

        gestor.registrarUsuario(nombre, apellido);

        outputEstado.setText("El usuario nombre: " + nombre + ", apellido: " + apellido + " se registro correctamente");
    }

    public void listarUsuarios(ActionEvent actionEvent){
        ArrayList<String> listaUsuarios = gestor.obtenerUsuarios();
        int index = 1;

        panelUsuarios.add(new Label("<-- Informacion de usuarios -->"), 1, 0);

        for(String usuario : listaUsuarios){
            panelUsuarios.add(new Label(usuario), 1, index++);

            System.out.println(usuario);
        }
    }
}