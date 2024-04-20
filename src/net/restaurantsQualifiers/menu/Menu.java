package net.restaurantsqualifiers.menu;

import javax.swing.JOptionPane;

public class Menu {

    public static int printMenu() {
        int integer = Integer.parseInt(JOptionPane.showInputDialog("""
                1. Añadir restaurante.
                2. Editar restaurante.
                3. Mostrar restaurantes.
                4. Eliminar restaurante.
                Q. Salir del programa.
                    """));

        return integer;

    }

    public static int printMenuEdit() {
        int integer = Integer.parseInt(JOptionPane.showInputDialog("""
                Que desea cambiar del restaurante
                    1.Nombre
                    2.Localizacion
                    3.horario
                    4.Puntuacion
                        """));

        return integer;

    }

}
