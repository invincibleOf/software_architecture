## Patrón que usamos

- **Tipo:** Estructurar
- **Patrón:** Patrón Bridge

Se eligió Bridge porque el escenario tiene dos dimensiones que varían de forma independiente:
el tipo de notificación (Mensaje, Alerta, Advertencia, Confirmación) y la plataforma donde se
muestra (Web, Móvil, Escritorio).

Resolverlo con herencia tradicional generaría una explosión combinatoria de tipos X plataformas 
12 clases hoy, y crecimiento multiplicativo al agregar cualquiera de las dos).