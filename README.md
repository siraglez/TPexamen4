link al repositorio: https://github.com/siraglez/TPexamen4.git

# Implementación del Problema de Parar:

Este código consiste en varias clases Java que simulan el problema de parar de Alan Turing.

## Simulación problema parar:

* La primera parte del código tiene dos clases: `InevitableHalt` y `NeverHalt` en el paquete `simulacionProblemaParar`.
* **`InevitableHalt`**: Esta clase implementa un programa que se detiene inevitablemente. En su método `main`, inicializa un contador `numero` en 10 y luego ejecuta un bucle `while` que imprime el valor de `numero` en cada iteración y luego decrementa `numero` en uno. El bucle se ejecuta hasta que `numero` es menor o igual a 0, lo que hace que el programa se detenga.
* **`NeverHalt`**: Por otro lado, esta clase implementa un programa que nunca se detiene. Al igual que `InevitableHalt`, tiene un método `main`, pero en este caso inicializa `numero` en 0 y ejecuta un bucle `while(true)` que imprime el valor de `numero` en cada iteración y luego lo incrementa en uno. Dado que la condición del bucle es siempre verdadera (`true`), este programa se ejecutará indefinidamente sin detenerse.

## Comprobación problema parar:

* La siguiente parte del código contiene las clases `HaltChecker` y `Reverser` en el paquete `comprobacionProblemaParar`.
* **`HaltChecker`**: Esta clase contiene un método estático `checkHalt` que verifica si un programa se detiene o no. Toma como entrada el código del programa y una entrada específica para ese programa. Si el código del programa es "countDown" y la entrada es mayor que 0, se asume que el programa se detendrá y se devuelve `true`; de lo contrario, se devuelve `false`.
* **`Reverser`**: Esta clase extiende `JFrame` y es una interfaz de usuario básica para comprobar si un programa se detiene o no. Tiene un botón "Comprobar" que al hacer clic solicita al usuario que ingrese el código del programa y una entrada específica. Luego utiliza el método `checkHalt` de `HaltChecker` para determinar si el programa se detiene o no. Si se detecta que el programa se detiene, muestra un mensaje indicando que el programa entra en un bucle infinito; de lo contrario, muestra un mensaje indicando que el programa termina inmediatamente.
