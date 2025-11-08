# Análisis Orientado a Objetos - Taller de Bicicletas "Ruedas Ágiles"

**Estudiante:** Gabriel Alejandro Leal Hernandez

**Ficha:** 3228973A

--- 

## 1. Identificación del Dominio

---

**Nombre del negocio:** Ruedas Agiles  
**Tipo:** Taller de mantenimiento y reparación de bicicletas  
**Descripción:** Ruedas Ágiles es un taller especializado en bicicletas que ofrece servicios de mantenimiento preventivo, reparaciones mecánicas, venta de repuestos originales y ensamble de bicicletas personalizadas. Cuenta con 5 mecánicos certificados, inventario de 500 referencias de repuestos y atiende ciclistas urbanos, deportivos y recreativos. Realiza 80 servicios semanales.

---

## 2. Objetos Identificados

---

### Objeto Principal: BikeServiceOrder
**¿Qué es?:** Representa una orden de servicio generada en el taller.  
Cada orden contiene la información sobre el trabajo solicitado, el costo y su estado actual (en proceso o completada).
**Atributos identificados:**

- `orderCode:` String - Codigo de la orden
- `serviceType:` String - Tipo de Servicio
- `cost:` double - Costo de la Orden
- `completed:` boolean - Indica si es servicio esta completado
- `estimatedHours:` int - Horas que tarda el servicio

**Métodos identificados:**
- `showInfo():` Muestra la información de la orden
- `calculateCostWithIva():` Calcula el costo total de la orden + IVA 19%
- `getOrderCode():` Sirve para leer el valor del atributo
- `setCompleted(boolean)`: Sirve para modificar el valor del atributo

### Objeto Secundario: Clients
**¿Qué es?:** Representa a la persona que solicita los servicios del taller.  
Cada cliente puede tener una o más órdenes de servicio registradas.

**Atributos identificados:**
- `idClient`: int - Identificador unico de cliente
- `name`: String - Nombre de cliente
- `email`: String - Email de cliente
- `phone`: String - Telefono de cliente
- `registeredOrders`: int - Cantidad de Ordenes que tiene el cliente

**Métodos identificados:**
- `showInformation()`: Muestra la información de los usuarios
- `registerOrders()`: Incrementa el número de ordenes registradas al cliente
- `clientIsActive()`: Valida si el cliente es activo si el numero de ordenes registradas  es mayor a 0
- `getName()`: Lee la información del atributo name

---

## 3. Relación entre Objetos

---

**Tipo de relación:** Asociación Simple

**Descripción:** Un cliente puede tener varias órdenes de servicio registradas en el sistema. Cada orden pertenece a un cliente específico. En este modelo inicial, la relación se mantiene a nivel conceptual (no se programó dentro de las clases), pero el flujo del programa refleja que los clientes realizan las órdenes y su cantidad se actualiza según el número de servicios solicitados.

---

## 4. Justificación del Diseño

---

**¿Por qué elegí estos objetos?**

Los objetos “Cliente” y “BikeServiceOrder” representan las dos entidades principales del dominio. Un taller no puede operar sin clientes ni sin órdenes de servicio, por lo que son los elementos esenciales del negocio.

**¿Por qué estos atributos son importantes?**

Cada atributo permite almacenar información necesaria para gestionar el taller:
- Los datos personales del cliente permiten identificarlo y contactarlo.
- Los datos de la orden permiten calcular costos, registrar tiempos y hacer seguimiento al estado del trabajo.


**¿Por qué estos métodos son necesarios?**

Cada método implementa una acción del mundo real:
- `showInformation()` y `showInfo()` muestran la información.
- `registerOrders()` y `setCompleted()` permiten modificar el estado de los objetos.
- `calcularCostoConIVA()` agrega lógica funcional al sistema.
- Los getters permiten acceder a los datos de manera controlada.


---

## 5. Comparación: POO vs Programación Estructurada

---

**Sin POO (Estructurado):**  
El programa tendría que usar solo variables y funciones sueltas.  
Por ejemplo, listas separadas para nombres, correos, costos y estados.  
Esto haría más difícil mantener el código, ya que los datos no estarían agrupados por cliente ni por orden.

**Con POO:**  
Cada clase agrupa sus propios datos y comportamientos.  
Un objeto “Cliente” almacena su propia información y sabe cómo mostrarse o actualizarse.  
Una “BikeServiceOrder” conoce su costo y puede calcular su total con IVA.

``` java

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
```

**Ventajas específicas en mi dominio:**
1. Permite crear y manejar fácilmente múltiples clientes y órdenes sin confusión.
2. Hace que el código sea más organizado y fácil de mantener.
3. Facilita agregar nuevas funciones (por ejemplo, descuentos o historial de servicios) sin romper el programa.

---
## 3. Decisiones de Diseño

**¿Por qué elegí estos atributos?**  
Elegí estos atributos porque representan los datos esenciales de cada entidad en mi dominio asignado:
- En `Cliente`, los datos de identificación y contacto son los mínimos necesarios para asociar órdenes a una persona.
- En `BikeServiceOrder`, el tipo de servicio, costo y tiempo son fundamentales para el control del trabajo en el taller.
- El atributo `completed` permite controlar el estado del servicio y simular un flujo real de trabajo.

**¿Qué validaciones implementé?**  
Aunque el proyecto no exige validaciones complejas, se cuidó la coherencia de los datos:
- Todas las órdenes se inicializan con `completada = false` (en proceso).
- Los métodos `registrarOrden()` y `setCompleted()` actualizan los estados de forma controlada.
- Se garantiza que cada código de orden y de cliente sea único al crear los objetos.

**¿Qué relaciones identifiqué?**  
Se identificó una relación de **asociación uno a muchos (1..*)**:
> Un cliente puede tener múltiples órdenes de servicio.  
Cada orden pertenece a un cliente determinado, aunque en esta versión la relación se representa solo de forma conceptual en el código.

---

## 4. Justificación del Diseño

**¿Por qué elegí estos objetos?**  
Porque representan los elementos principales del dominio: los clientes y las órdenes.  
Sin estos dos actores, el negocio no podría operar.

**¿Por qué estos atributos son importantes?**  
Los atributos fueron elegidos para reflejar la información más relevante del negocio y permitir un control claro de los servicios y clientes.

**¿Por qué estos métodos son necesarios?**  
Los métodos representan acciones reales del sistema: mostrar información, actualizar estados, calcular costos y obtener datos específicos.  
Además, se aplicó encapsulamiento mediante el uso de `getters` y `setters`.

---

## 5. Dificultades Encontradas

Durante el desarrollo se presentaron algunas dificultades que ayudaron a fortalecer la comprensión de los conceptos de POO:

- **Comprender la relación entre clases:**  
  Al principio fue un reto entender cómo una clase (Cliente) podía estar relacionada con otra (BikeServiceOrder) sin depender directamente de su código.  
  Esto se resolvió al usar una relación conceptual y manejar los vínculos desde el `Main`.

- **Ejecución desde la terminal:**  
  Fue necesario aprender a compilar las clases una por una usando `javac` y luego ejecutar con `java Main`, entendiendo cómo Java busca el método `main()`.

- **Organización del flujo de salida:**  
  Se practicó el uso de `System.out.println()` para estructurar la información en secciones legibles y con saltos de línea.
