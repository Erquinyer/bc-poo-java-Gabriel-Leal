package co.edu.sena.gabriel.sem1;

public class BikeServiceOrder {

  private String orderCode;
  private String serviceType;
  private double cost;
  private boolean completed;
  private int estimatedHours;

  public BikeServiceOrder(String orderCode, String serviceType, double cost, int estimatedHours) {
    this.orderCode = orderCode;
    this.serviceType = serviceType;
    this.cost = cost;
    this.estimatedHours = estimatedHours;
    this.completed = false; // ✔ Ahora sí respeta el valor enviado
  }

  public void showInfo() {
    System.out.println("--- Servicio ---");
    System.out.println("# Orden: " + orderCode);
    System.out.println("Tipo de Servicio: " + serviceType);
    System.out.println("Costo: $" + cost);
    System.out.println("Horas Estimadas: " + estimatedHours);

    if (completed) {
      System.out.println("Tarea Completada");
    } else {
      System.out.println("Tarea en Proceso");
    }

    System.out.println("----------------------------");
  }

  public double calculateCostWithIva() {
    double iva = 0.19;
    return cost + (cost * iva);
  }

  public String getOrderCode() {
    return orderCode;
  }

  public void setCompleted(boolean newState) {
    this.completed = newState;
  }
}
