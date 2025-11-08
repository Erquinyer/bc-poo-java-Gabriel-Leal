public class BikeServiceOrder {

  //Atributos son los objetos que conforman la clase, generalmente se dejan private

  private String orderCode; // codigo de la orden
  private String serviceType; // tipo de servicio (Mantenimiento, cambio de frenos, cambio de corazas, etc)
  private double cost; // costo del servicio
  private boolean completed; // indica si el servicio fue completado
  private int estimatedHours; // Horas estimadas que se tarda el servicio

  // Constructor : Bloque de codigo que se usa para inicializar los objetos de una clase

  public BikeServiceOrder (String orderCode, String serviceType, double cost, int estimatedHours) {
    this.orderCode = orderCode;
    this.serviceType = serviceType;
    this.cost = cost;
    this.estimatedHours = estimatedHours;
    this.completed = false; // Por defecto la orden inicia como no completada
  }

  // Metodo 1 showInfo Es una acción que muestra los datos guardados en los objetos

  public void showInfo() {
    System.out.println("--- Servicio ---");
    System.out.println("# Orden: " + orderCode);
    System.out.println("Tipo de Servicio: " + serviceType);
    System.out.println("Costo: $" + cost);
    System.out.println("Horas Estimadas: " + estimatedHours);

    if (completed == true) { // Condición que valida si la tarea esta completada o en proceso e imprime el resultado correspondiente
      System.out.println("Tarea Completada");
    } else {
      System.out.println("Tarea en Proceso");
    }
    System.out.println("----------------------------");
  }

  //Metodo 2 acción que calcula el costo del servicio mas el Iva del 19%

  public double calculateCostWithIva(){
    double iva = 0.19;
    double total = cost + (cost * iva); //formula para calcular el valor total con Iva
    return total;
  }

  //Getter y Setters son metodos especiales que sirven para acceder o modificar los los valores de los atributos de un objeto

  //Metodo Get: sirve para leer el valor del atributo

  public String getOrderCode() {
    return orderCode;
  }

  //Metodo Set: permite modificar el valor del atributo

  public void setCompleted(boolean newstate){
    completed = newstate;
  }
}
