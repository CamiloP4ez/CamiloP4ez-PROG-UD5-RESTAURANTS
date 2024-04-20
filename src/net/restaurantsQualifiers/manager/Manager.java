package net.restaurantsqualifiers.manager;

import net.restaurantsqualifiers.menu.Menu;
import net.restaurantsqualifiers.restaurant.Restaurant;
import net.restaurantsqualifiers.utils.UtilitiesDos;

import java.util.ArrayList;
import java.util.Collections;

import javax.swing.JOptionPane;

public class Manager {
    private ArrayList<Restaurant> restaurants = new ArrayList<Restaurant>();

    public ArrayList<Restaurant> getRestaurants() {
        return restaurants;
    }

    public void setRestaurants(ArrayList<Restaurant> restaurants) {
        this.restaurants = restaurants;
    }

    public void addRestaurant(Restaurant restaurant) {
        restaurants.add(restaurant);

    }

    public void showRestaurants() {
        for (int i = 0; i < restaurants.size(); i++) {
            JOptionPane.showMessageDialog(null, restaurants.get(i).toString());
        }
    }

    public void updateRestaurant(String name) {
        for (int i = 0; i < restaurants.size(); i++) {
            if (name.equals(restaurants.get(i).getName())) {
                switch (Menu.printMenuEdit()) {
                    case 1:
                        restaurants.get(i).setName(UtilitiesDos.newName());

                        break;
                    case 2:
                        restaurants.get(i).setLocation(UtilitiesDos.newLocation());

                        break;
                    case 3:
                        restaurants.get(i).setSchedule(UtilitiesDos.newSchedule());

                        break;
                    case 4:
                        restaurants.get(i).setRate(UtilitiesDos.newRate());

                        break;

                    default:
                        break;
                }

            }
        }

    }

    public void sortRestaurants() {
        Collections.sort(restaurants, (r1, r2) -> Float.compare(r2.getRate(), r1.getRate()));
        JOptionPane.showMessageDialog(null, restaurants.toString());
    }

    public void deleteRestaurant(String name) {
        for (int i = 0; i < restaurants.size(); i++) {
            if (name.equals(restaurants.get(i).getName())) {
                restaurants.remove(i);
            }

        }
    }

}
