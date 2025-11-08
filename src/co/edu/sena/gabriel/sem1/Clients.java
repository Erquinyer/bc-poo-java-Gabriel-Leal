public class Clients {

  //Atributos que definen la clase clientes

  private int idClient;
  private String name;
  private String email;
  private String phone;
  private int registeredOrders;

  // Constructor

  public Clients( int idClient, String name, String email, String phone){

    this.idClient = idClient;
    this.name = name;
    this.email = email;
    this.phone = phone;
    this.registeredOrders = 0; //inicia sin ordenes
  }

  // Metodo 1 Muestra en pantalla la información de cada cliente,

  public void showInformation (){

    System.out.println("--- Cliente ---");
    System.out.println("Id Cliente:" + idClient);
    System.out.println("Nombre: " + name);
    System.out.println("Email: " + email);
    System.out.println("Telefono: " + phone);
    System.out.println("Ordenes Registradas:" + registeredOrders);
    System.out.println("----------------------------");
  }

  //Metodo 2 Valida que cada vez que un cliente haga una orden, este metodo sume 1 a su contador

  public void registerOrders(){
    registeredOrders++;
  }

  //Metodo 3 Valida si el cliente es activo si el numero de ordenes registradas  es mayor a 0

  public boolean clientIsActive(){
    return registeredOrders >0;
  }

  //Metodo 4 Get lee la información del atributo que tiene name
  public String getName() {
    return name;
  }
}
