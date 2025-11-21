package co.edu.sena.gabriel.sem2;

import co.edu.sena.gabriel.sem1.BikeServiceOrder;
import co.edu.sena.gabriel.sem1.Clients;

import java.util.ArrayList;

public class ServiceManager {
  private ArrayList<Clients> clients = new ArrayList<>();
  private ArrayList<Bicycle> bicycles = new ArrayList<>();
  private ArrayList<ServiceType> serviceTypes = new ArrayList<>();
  private ArrayList<BikeServiceOrder> orders = new ArrayList<>();

  // Agregar un cliente
  public void addClient(Clients client) {
    clients.add(client);
  }

  // Agregar bicicleta
  public void addBicycle(Bicycle bike) {
    bicycles.add(bike);
  }

  // Agregar tipo de servicio
  public void addServiceType(ServiceType type) {
    serviceTypes.add(type);
  }

  // Agregar orden
  public void addOrder(BikeServiceOrder order) {
    orders.add(order);
  }

  // Listar clientes
  public void listClients() {
    System.out.println("=== LISTA DE CLIENTES ===");
    for (Clients c : clients) {
      c.showInformation();
    }
  }

  // Listar bicicletas
  public void listBicycles() {
    System.out.println("=== LISTA DE BICICLETAS ===");
    for (Bicycle b : bicycles) {
      b.showInfo();
    }
  }

  // Listar servicios disponibles
  public void listServiceTypes() {
    System.out.println("=== TIPOS DE SERVICIO ===");
    for (ServiceType s : serviceTypes) {
      s.showInfo();
    }
  }

  // Listar órdenes
  public void listOrders() {
    System.out.println("=== ÓRDENES REGISTRADAS ===");
    for (BikeServiceOrder o : orders) {
      o.showInfo();
    }
  }
}
