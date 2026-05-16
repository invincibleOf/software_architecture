/**
 * Ejercicio 1 — Personalización de automóviles.
 *
 * Escenario:
 *   Aplicación para una compañía automotriz que permite a los clientes
 *   personalizar y ordenar un automóvil. Un Automóvil puede tener muchas
 *   configuraciones opcionales: tipo de motor, color, llantas, sistema de
 *   sonido, interiores, techo solar, navegación GPS, etc.
 *
 * Problema:
 *   Crear un Automóvil con múltiples configuraciones lleva al "constructor
 *   telescópico" o a múltiples constructores sobrecargados.
 *
 * Beneficios esperados:
 *   - Legibilidad y claridad para construir objetos con muchos parámetros.
 *   - Inmutabilidad del objeto resultante.
 *   - Flexibilidad para omitir atributos opcionales.
 *   - Separación entre la lógica de construcción y la representación.
 *
 * TODO:
 *   1) Identificar el tipo de patrón (Creacional / Estructural / Comportamiento).
 *   2) Seleccionar el patrón concreto y justificarlo.
 *   3) Diseñar el diagrama de clases.
 *   4) Implementar la solución.
 */
package co.edu.upb.patrones.ejercicio1;
