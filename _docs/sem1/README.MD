# Semana 01 - Introducción a la Programación Orientada a Objetos (POO)

---

## 📝 Descripción

Durante esta semana se desarrolló un sistema básico para la **gestión de servicios de bicicletas**, aplicando los conceptos fundamentales de la **programación orientada a objetos** (POO).  
Se implementaron dos clases principales que representan los objetos del dominio: **BikeServiceOrder** y **Clients**, junto con una clase **Main** para demostrar su funcionamiento.

## 🎯 Objetivos Cumplidos
- [x] Implementar clase principal del dominio (`BikeServiceOrder`)
- [x] Implementar clase secundaria relacionada (`Clients`)
- [x] Crear programa de demostración (`Main`)
- [x] Documentar análisis del dominio (`ANALISIS.md`)

## 📂 Archivos Entregados

- `src/BikeServiceOrder.java` — Clase principal del dominio. Representa una orden de servicio de bicicleta con atributos como tipo de servicio, costo, horas estimadas y estado.
- `src/Clients.java` — Clase secundaria relacionada. Representa al cliente asociado al servicio, con información de contacto y registro de órdenes.
- `src/Main.java` — Programa principal que crea objetos de ambas clases y demuestra su interacción.
- `docs/ANALISIS.md` — Documento con el análisis del dominio, justificación del diseño y comparación entre POO y programación estructurada.

## 🚀 Instrucciones de Ejecución

---
```bash
cd src
javac *.java
java Main
```
---
## Salida Esperada

```
== SISTEMA DE SERVICIO DE BICICLETAS ==
== CLIENTES REGISTRADOS ==
--- Cliente ---
Id Cliente:1
Nombre: Julian
Email: julian@mail.com
Telefono: 123456789
Ordenes Registradas:0
----------------------------
--- Cliente ---
Id Cliente:2
Nombre: Andres
Email: andres@mail.com
Telefono: 123456776
Ordenes Registradas:0
----------------------------
--- Cliente ---
Id Cliente:3
Nombre: Maria
Email: maria@mail.com
Telefono: 987654321
Ordenes Registradas:0
----------------------------
--- Cliente ---
Id Cliente:4
Nombre: Niko
Email: Niko@mail.com
Telefono: 126782097
Ordenes Registradas:0
----------------------------
--- Cliente ---
Id Cliente:5
Nombre: Laura
Email: Laura@mail.com
Telefono: 536782989
Ordenes Registradas:0
----------------------------
== ORDENES DE SERVICIO ==
--- Servicio ---
# Orden: 0001
Tipo de Servicio: Mantenimiento
Costo: $90000.0
Horas Estimadas: 3
Tarea en Proceso
----------------------------
--- Servicio ---
# Orden: 0002
Tipo de Servicio: Cambio de Corazas
Costo: $60000.0
Horas Estimadas: 1
Tarea en Proceso
----------------------------
--- Servicio ---
# Orden: 0003
Tipo de Servicio: Servicio de Pintura
Costo: $120000.0
Horas Estimadas: 6
Tarea en Proceso
----------------------------
--- Servicio ---
# Orden: 0004
Tipo de Servicio: Cambio de Zapatas
Costo: $15000.0
Horas Estimadas: 1
Tarea en Proceso
----------------------------
--- Servicio ---
# Orden: 0005
Tipo de Servicio: Cambio de Cadena
Costo: $75000.0
Horas Estimadas: 2
Tarea en Proceso
----------------------------
== ESTADO DE CLIENTES ==
Julian Activo?: true
Andres Activo?: true
Maria Activo?: false
Niko Activo?: true
Laura Activo?: true
----------------------------
== ESTADO ACTUALIZADO DE LAS ORDENES ==
--- Servicio ---
# Orden: 0001
Tipo de Servicio: Mantenimiento
Costo: $90000.0
Horas Estimadas: 3
Tarea Completada
----------------------------
--- Servicio ---
# Orden: 0003
Tipo de Servicio: Servicio de Pintura
Costo: $120000.0
Horas Estimadas: 6
Tarea Completada
----------------------------
--- Servicio ---
# Orden: 0004
Tipo de Servicio: Cambio de Zapatas
Costo: $15000.0
Horas Estimadas: 1
Tarea Completada
----------------------------
--- Servicio ---
# Orden: 0005
Tipo de Servicio: Cambio de Cadena
Costo: $75000.0
Horas Estimadas: 2
Tarea en Proceso
----------------------------
== COSTO TOTAL DE LAS ORDENES CON IVA ==
Orden 1 =107100.0
Orden 2 =71400.0
Orden 3 =142800.0
Orden 4 =17850.0
Orden 5 =89250.0
----------------------------
ORDENES ACTALIZADAS DE CLIENTES
--- Cliente ---
Id Cliente:1
Nombre: Julian
Email: julian@mail.com
Telefono: 123456789
Ordenes Registradas:2
----------------------------
--- Cliente ---
Id Cliente:2
Nombre: Andres
Email: andres@mail.com
Telefono: 123456776
Ordenes Registradas:1
----------------------------
--- Cliente ---
Id Cliente:3
Nombre: Maria
Email: maria@mail.com
Telefono: 987654321
Ordenes Registradas:0
----------------------------
--- Cliente ---
Id Cliente:4
Nombre: Niko
Email: Niko@mail.com
Telefono: 126782097
Ordenes Registradas:1
----------------------------
--- Cliente ---
Id Cliente:5
Nombre: Laura
Email: Laura@mail.com
Telefono: 536782989
Ordenes Registradas:1
----------------------------
== FIN DEL PROGRAMA ==
```
## Conceptos Aplicados

---

- Clases y objetos

- Atributos y métodos

- Constructores

- Encapsulación (getters y setters)

- Relaciones entre clases

- Uso de System.out.println() para mostrar información

