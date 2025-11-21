package co.edu.sena.gabriel.sem2;

import co.edu.sena.gabriel.sem1.BikeServiceOrder;
import co.edu.sena.gabriel.sem1.Clients;

public class Main {
  public static void main(String[] args) {

    System.out.println("=== SISTEMA DE SERVICIO DE BICICLETAS - SEMANA 2 ===\n");

    // Crear gestor
    ServiceManager manager = new ServiceManager();

    // Crear clientes
    Clients c1 = new Clients(1, "Julian", "julian@mail.com", "123456789");
    Clients c2 = new Clients(2, "Laura", "laura@mail.com", "987654321");

    manager.addClient(c1);
    manager.addClient(c2);

    // Crear bicicletas
    Bicycle b1 = new Bicycle(1, "Giant", "Escape 3", 29);
    Bicycle b2 = new Bicycle(2, "Trek", "Marlin 5", 27.5);

    manager.addBicycle(b1);
    manager.addBicycle(b2);

    // Crear tipos de servicio
    ServiceType t1 = new ServiceType(101, "Mantenimiento General", 50000, "Revisión completa de frenos, cambios y limpieza");
    ServiceType t2 = new ServiceType(102, "Cambio de Llantas", 30000, "Incluye mano de obra");

    manager.addServiceType(t1);
    manager.addServiceType(t2);

    // Crear órdenes
    BikeServiceOrder o1 = new BikeServiceOrder("0001", t1.getName(), t1.getBaseCost(), 3);
    BikeServiceOrder o2 = new BikeServiceOrder("0002", t2.getName(), t2.getBaseCost(), 1);

    manager.addOrder(o1);
    manager.addOrder(o2);

    // Mostrar todo
    manager.listClients();
    manager.listBicycles();
    manager.listServiceTypes();
    manager.listOrders();

    System.out.println("\n=== FIN DEL PROGRAMA ===");
  }
}
