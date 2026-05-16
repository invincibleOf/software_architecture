# software_architecture

Actividad 1 — Patrones de diseño (Arquitectura de Software 1).

## Estructura

```
src/main/java/co/edu/upb/patrones/
├── ejercicio1/   → Automóvil personalizable
├── ejercicio2/   → Notificaciones en distintas plataformas
└── ejercicio3/   → Chat grupal
```

Cada paquete contiene:
- `package-info.java` — escenario, problema y beneficios esperados (tomados del PDF).
- `Main.java` — punto de entrada vacío para probar la solución.

## Qué hay que hacer (resumen del PDF)

Para cada uno de los 3 ejercicios:

1. Identificar el **tipo de patrón** (Estructural, Comportamiento, Creacional).
2. Seleccionar el **patrón concreto** y justificar la elección.
3. Diseñar el **diagrama de clases** de la solución.
4. Desarrollar el **código** en este proyecto.

## Ejecutar

Con Maven:

```bash
mvn -q -DskipTests package
java -cp target/classes co.edu.upb.patrones.ejercicio1.Main
java -cp target/classes co.edu.upb.patrones.ejercicio2.Main
java -cp target/classes co.edu.upb.patrones.ejercicio3.Main
```

Sin Maven (sólo `javac`):

```bash
mkdir -p target/classes
find src/main/java -name "*.java" > sources.txt
javac -d target/classes @sources.txt
java -cp target/classes co.edu.upb.patrones.ejercicio1.Main
```

## Tests

```bash
mvn test
```
