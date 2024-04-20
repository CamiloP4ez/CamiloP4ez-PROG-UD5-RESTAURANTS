import javax.swing.JOptionPane;
import net.restaurantsqualifiers.manager.Manager;
import net.restaurantsqualifiers.menu.Menu;
import net.restaurantsqualifiers.utils.UtilitiesDos;

public class Main {
    public static void main(String[] args) throws Exception {
        Manager manager = new Manager();
        boolean keepAsking = true;
        while (keepAsking) {
            switch (Menu.printMenu()) {
                case 1:
                    manager.addRestaurant(UtilitiesDos.getInfo());
                    JOptionPane.showMessageDialog(null, "restaurante aÃ±adido");

                    break;

                case 2:
                    manager.showRestaurants();
                    String name = JOptionPane.showInputDialog("dame el nombre del restaurante a modificar");
                    manager.updateRestaurant(name);
                    break;
                case 3:
                    manager.sortRestaurants();
                    break;
                case 4:
                    manager.showRestaurants();
                    name = JOptionPane.showInputDialog("dame el nombre del restaurante a modificar");
                    manager.deleteRestaurant(name);
                    break;

                default:
                    break;
            }
        }

    }
}