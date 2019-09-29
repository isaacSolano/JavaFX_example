package com.JavaFX.UI;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;

import java.util.ArrayList;

import com.JavaFX.TL.Controller;

public class UIController {
    public Label outputEstado;

    public TextField inputNombre;
    public TextField inputApellido;

    public Pane panelUsuarios;

    Controller gestor = new Controller();

    public void registrarUsuario(ActionEvent actionEvent){
        String nombre = inputNombre.getText();
        String apellido = inputApellido.getText();

        gestor.registrarUsuario(nombre, apellido);

        outputEstado.setText("El usuario nombre: " + nombre + ", apellido: " + apellido + " se registro correctamente");
    }

    public void listarUsuarios(ActionEvent actionEvent){
        ArrayList<String> listaUsuarios = gestor.obtenerUsuarios();

        for(String usuario : listaUsuarios){
            Label infoUsuario = new Label(usuario);

            infoUsuario.

            panelUsuarios.getChildren().add(infoUsuario);
            System.out.println(usuario);
        }
    }
}
