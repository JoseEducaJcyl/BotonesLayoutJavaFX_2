# BotonesLayoutJavaFX_2

Pequeño proyecto de ejemplo para JavaFX que demuestra cómo **abrir múltiples ventanas** desde una aplicación principal.

## ¿Qué hace?

Al ejecutar el programa, se muestra una ventana principal con un único botón que dice "Abrir Ventana".  
Cuando el usuario hace clic en ese botón, se abre una **segunda ventana (secundaria)** completamente independiente, que muestra un mensaje de bienvenida.

## ¿Cómo funciona internamente?

- La ventana principal es un `Stage` (escenario) creado por JavaFX.
- El botón tiene un evento (`setOnAction`) que llama a un método privado.
- Ese método crea un **nuevo objeto `Stage`** , le asigna su propio título (`"Ventana Secundaria"`), una escena con una etiqueta y la hace visible con `.show()`.
- La ventana secundaria es independiente: se puede mover, minimizar o cerrar sin afectar a la principal.

## ¿Para qué sirve este ejemplo?

Es la base para aprender a crear:
- Diálogos modales.
- Formularios emergentes.
- Ventanas de ayuda o configuración.

## Requisitos y ejecución

- Java 11 o superior.
- Maven.

Clona el repositorio y ejecuta:
```bash
mvn javafx:run
