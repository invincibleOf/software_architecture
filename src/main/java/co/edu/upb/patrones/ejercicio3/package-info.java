/**
 * Ejercicio 3 — Chat grupal.
 *
 * Escenario:
 *   Aplicación de chat grupal. Los usuarios pueden enviarse mensajes entre sí
 *   dentro de una sala de chat. Gestionar interacciones directas entre cada
 *   usuario haría que cada uno deba conocer y comunicarse con todos los demás,
 *   generando alta dependencia entre objetos.
 *
 * Problema:
 *   Sin un intermediario, cada usuario tendría que mantener referencias directas
 *   a todos los demás, lo que produce un sistema difícil de escalar y mantener.
 *   Agregar o eliminar usuarios obliga a actualizar muchas relaciones.
 *
 * Beneficios esperados:
 *   - Facilita el mantenimiento (agregar/eliminar usuarios sin tocar al resto).
 *   - Lógica de comunicación centralizada en lugar de dispersa.
 *   - Reduce la complejidad de una red de interacciones punto a punto.
 *
 * TODO:
 *   1) Identificar el tipo de patrón (Creacional / Estructural / Comportamiento).
 *   2) Seleccionar el patrón concreto y justificarlo.
 *   3) Diseñar el diagrama de clases.
 *   4) Crear las clases/interfaces necesarias en este paquete e implementar la solución.
 */
package co.edu.upb.patrones.ejercicio3;
