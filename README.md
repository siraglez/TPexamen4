link al repositorio: https://github.com/siraglez/TPexamen4.git


# Implementación del Problema de Parar:

Este código consiste en varias clases Java que simulan el problema de parar de Alan Turing.


## Simulación problema parar:

* La primera parte del código tiene dos clases: `InevitableHalt` y `NeverHalt` en el paquete `simulacionProblemaParar`.
* La clase `InevitableHatl` implementa un programa que cuenta hacia abajo desde un número específico hasta cero y luego se detiene.
* Por otro lado, la clase `NeverHalt` implementa un programa que cuenta hacia arriba infinitamente sin detenerse nunca.

## Comprobación problema parar:

* La siguiente parte del código contiene las clases `HaltChecker` y `Reverser` en el paquete `comprobacionProblemaParar`.
* La clase `HaltChecker` tiene un método `checkHalt` que simula verificar si un programa se detiene o no según el código del programa y una entrada específica proporcionada.
* La clase `Reverser` es un programa interactivo que solicita al usuario el código del programa y una entrada específica.
* Luego, utiliza el `altChecker` para determinar si el programa correspondiente se detendrá o no.
* Si el programa se detiene, `Reverser` entra en un bucle infinito, y si no se detiene, termina inmediatamente.
