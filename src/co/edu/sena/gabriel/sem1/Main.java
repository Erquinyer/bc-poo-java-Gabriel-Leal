public class Main {
  public static void main(String[] args) {

    System.out.println("== SISTEMA DE SERVICIO DE BICICLETAS ==");

    //Se crean los objetos de la clase Clients

    Clients client1 = new Clients(001, "Julian","julian@mail.com", "123456789");
    Clients client2 = new Clients(002, "Andres","andres@mail.com", "123456776");
    Clients client3 = new Clients(003, "Maria","maria@mail.com", "987654321");
    Clients client4 = new Clients(004, "Niko","Niko@mail.com", "126782097");
    Clients client5 = new Clients(005, "Laura","Laura@mail.com", "536782989");

    //Imprime en pantalla la información de los clientes

    System.out.println("== CLIENTES REGISTRADOS ==");
    client1.showInformation();
    client2.showInformation();
    client3.showInformation();
    client4.showInformation();
    client5.showInformation();

    //Se Crean los objetos de la clase BikeServiceOrder

    BikeServiceOrder order1 = new BikeServiceOrder("0001","Mantenimiento", 90000, 3);
    BikeServiceOrder order2 = new BikeServiceOrder("0002","Cambio de Corazas", 60000, 1);
    BikeServiceOrder order3 = new BikeServiceOrder("0003","Servicio de Pintura", 120000, 6);
    BikeServiceOrder order4 = new BikeServiceOrder("0004","Cambio de Zapatas", 15000, 1);
    BikeServiceOrder order5 = new BikeServiceOrder("0005","Cambio de Cadena", 75000, 2);

    //Muestra las ordenes creadas

    System.out.println("== ORDENES DE SERVICIO ==");
    order1.showInfo();
    order2.showInfo();
    order3.showInfo();
    order4.showInfo();
    order5.showInfo();

    //Esto simula que un cliente registro una orden

    client1.registerOrders();
    client2.registerOrders();
    client4.registerOrders();
    client5.registerOrders();
    client1.registerOrders();

    //Verifica que los clientes estan activos

    System.out.println("== ESTADO DE CLIENTES ==");
    System.out.println(client1.getName() + " Activo?: " + client1.clientIsActive());
    System.out.println(client2.getName() + " Activo?: " + client2.clientIsActive());
    System.out.println(client3.getName() + " Activo?: " + client3.clientIsActive());
    System.out.println(client4.getName() + " Activo?: " + client4.clientIsActive());
    System.out.println(client5.getName() + " Activo?: " + client5.clientIsActive());
    System.out.println("----------------------------");

    //Completar una orden de servicio

    System.out.println("== ESTADO ACTUALIZADO DE LAS ORDENES ==");
    order1.setCompleted(true);
    order1.showInfo();
    order3.setCompleted(true);
    order3.showInfo();
    order4.setCompleted(true);
    order4.showInfo();
    order5.showInfo();

    //Calcular y mostrar el valor total con IVA

    System.out.println("== COSTO TOTAL DE LAS ORDENES CON IVA ==");
    System.out.println("Orden 1 ="  + order1.calculateCostWithIva());
    System.out.println("Orden 2 ="  + order2.calculateCostWithIva());
    System.out.println("Orden 3 ="  + order3.calculateCostWithIva());
    System.out.println("Orden 4 ="  + order4.calculateCostWithIva());
    System.out.println("Orden 5 ="  + order5.calculateCostWithIva());
    System.out.println("----------------------------");

    //Muestra el las ordenes que tiene cada cliente
    System.out.println("ORDENES ACTALIZADAS DE CLIENTES");
    client1.showInformation();
    client2.showInformation();
    client3.showInformation();
    client4.showInformation();
    client5.showInformation();

    //Imprime Texto que dice Tarea finalizada

    System.out.println("== FIN DEL PROGRAMA ==");
  }
}
