package co.edu.sena.gabriel.sem2;

public class ServiceType {
  // Atributos
  private int typeId;
  private String name;
  private double baseCost;
  private String description;

  // Constructor
  public ServiceType(int typeId, String name, double baseCost, String description) {
    this.typeId = typeId;
    this.name = name;
    this.baseCost = baseCost;
    this.description = description;
  }

  // Mostrar información
  public void showInfo() {
    System.out.println("---- Tipo de Servicio ----");
    System.out.println("ID: " + typeId);
    System.out.println("Servicio: " + name);
    System.out.println("Costo Base: $" + baseCost);
    System.out.println("Descripción: " + description);
    System.out.println("--------------------------");
  }

  // Getters
  public int getTypeId() {
    return typeId;
  }

  public double getBaseCost() {
    return baseCost;
  }

  public String getName() {
    return name;
  }

}
