package net.restaurantsqualifiers.utils;

import javax.swing.JOptionPane;

import net.restaurantsqualifiers.restaurant.Restaurant;

public class UtilitiesDos {
    public static Restaurant getInfo() {
        String name = JOptionPane.showInputDialog("dame el nombre de tu restaurante");
        String location = JOptionPane.showInputDialog("dame la ubicacion de tu restaurante");
        String schedule = JOptionPane.showInputDialog("dame el horario de tu restaurante");
        float rate = Float
                .parseFloat(JOptionPane.showInputDialog("dame la calificacion de tu restaurante"));
        Restaurant newRestaurant = new Restaurant(name, location, schedule, rate);
        return newRestaurant;
    }

    public static String newName() {

        return JOptionPane.showInputDialog("dame el nombre de tu restaurante");
    }

    public static String newLocation() {

        return JOptionPane.showInputDialog("dame la ubicacion de tu restaurante");
    }

    public static String newSchedule() {

        return JOptionPane.showInputDialog("dame el horario de tu restaurante");
    }

    public static float newRate() {

        return Float.parseFloat(JOptionPane.showInputDialog("dame la calificacion de tu restaurante"));
    }

}
