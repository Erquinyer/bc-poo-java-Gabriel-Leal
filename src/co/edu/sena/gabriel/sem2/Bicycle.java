package co.edu.sena.gabriel.sem2;

public class Bicycle {
  // Atributos
  private int bikeId;
  private String brand;
  private String model;
  private double wheelSize;
  private boolean available;

  // Constructor
  public Bicycle(int bikeId, String brand, String model, double wheelSize) {
    this.bikeId = bikeId;
    this.brand = brand;
    this.model = model;
    this.wheelSize = wheelSize;
    this.available = true; // por defecto disponible
  }

  // Métodos de información
  public void showInfo() {
    System.out.println("---- Bicicleta ----");
    System.out.println("ID: " + bikeId);
    System.out.println("Marca: " + brand);
    System.out.println("Modelo: " + model);
    System.out.println("Tamaño Rueda: " + wheelSize);
    System.out.println("Disponible: " + (available ? "Sí" : "No"));
    System.out.println("--------------------");
  }

  // Getters
  public int getBikeId() {
    return bikeId;
  }

  public String getBrand() {
    return brand;
  }

  public boolean isAvailable() {
    return available;
  }

  // Setters
  public void setAvailable(boolean available) {
    this.available = available;
  }
}
