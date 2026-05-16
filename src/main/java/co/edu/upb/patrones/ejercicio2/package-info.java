/**
 * Ejercicio 2 — Notificaciones en distintas plataformas.
 *
 * Escenario:
 *   Aplicación que gestiona la visualización de notificaciones en diferentes
 *   plataformas (escritorio, móvil, web). Las notificaciones pueden ser de
 *   distintos tipos (mensaje, alerta, advertencia, confirmación) y cada tipo
 *   puede mostrarse de distintas formas según la plataforma.
 *
 * Problema:
 *   Si se usa herencia tradicional aparecen clases como NotificacionMensajeWeb,
 *   NotificacionAlertaWeb, NotificacionMensajeMovil, NotificacionAlertaMovil,
 *   etc., produciendo una explosión combinatoria de subclases.
 *
 * Beneficios esperados:
 *   - Separación de responsabilidades entre la notificación y el medio.
 *   - Escalabilidad para agregar nuevas plataformas o tipos sin modificar el resto.
 *   - Reducción de clases.
 *   - Flexibilidad en tiempo de ejecución (cambiar la plataforma dinámicamente).
 *
 * TODO:
 *   1) Identificar el tipo de patrón (Creacional / Estructural / Comportamiento).
 *   2) Seleccionar el patrón concreto y justificarlo.
 *   3) Diseñar el diagrama de clases.
 *   4) Crear las clases/interfaces necesarias en este paquete e implementar la solución.
 */
package co.edu.upb.patrones.ejercicio2;
