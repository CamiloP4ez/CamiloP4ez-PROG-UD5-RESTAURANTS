package net.restaurantsqualifiers.menu;

import javax.swing.JOptionPane;

public class Menu {

    public static int printMenu() {
        try {
            int integer = Integer.parseInt(JOptionPane.showInputDialog("""
                    1. Añadir restaurante.
                    2. Editar restaurante.
                    3. Mostrar restaurantes.
                    4. Eliminar restaurante.
                    0. Salir del programa.
                        """));

            return integer;

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Debes ingresar un numero");
        }

        return -100;
    }

    public static int printMenuEdit() {

        try {
            int integer = Integer.parseInt(JOptionPane.showInputDialog("""
                    Que desea cambiar del restaurante
                        1.Nombre
                        2.Localizacion
                        3.horario
                        4.Puntuacion
                            """));

            return integer;

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Debes ingresar un numero");
        }
        return -100;

    }

}
