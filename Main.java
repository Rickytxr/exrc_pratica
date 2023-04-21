import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static ArrayList<Vehicle> vehicles = new ArrayList<>();



        private static void listVehicles() {

            if (vehicles.isEmpty()) {
                System.out.println("Não há veículos registrados.");
            } else {
                for (int i = 0; i < vehicles.size(); i++) {
                    Vehicle vehicle = vehicles.get(i);

                    System.out.println("Veículo #" + (i + 1));
                    System.out.println("Marca: " + vehicle.getBrand());
                    System.out.println("Modelo: " + vehicle.getModel());
                    System.out.println("Ano: " + vehicle.getYear());

                    if (vehicle instanceof SecondHandVehicle) {
                        SecondHandVehicle secondHandVehicle = (SecondHandVehicle) vehicle;
                        System.out.println("Número de proprietários anteriores: " + secondHandVehicle.getNumberOfOwners());
                    }

                    System.out.println();
                }
            }
        }


    }




