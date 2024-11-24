# TAED2 - Trabajo Práctico 4

## Simulaciones con Generación de Números Aleatorios

Este proyecto implementa una simulación básica de un algoritmo genético utilizando el lenguaje de programación Java. El algoritmo busca generar una cadena de caracteres óptima mediante la cruzación y evaluación de cadenas aleatorias.

## Objetivo

El objetivo del proyecto es simular el proceso de un algoritmo genético, donde se generan cadenas de caracteres aleatorias y se realizan cruces entre ellas para obtener una cadena que maximice un valor evaluado.

## Descripción del Programa

- Generación de Cadenas Aleatorias: Se utiliza la función Random de Java para generar cadenas de caracteres binarias (0 y 1) de longitud 20.

- Evaluación de Cadenas: Cada cadena se evalúa calculando su puntuación, donde cada dígito de la cadena se multiplica por 2 y se suma para obtener el score de la cadena.

- Cruce de Cadenas: Se realiza un cruce bit a bit entre dos cadenas. Si los bits son iguales, se coloca un '1' en la nueva cadena, de lo contrario, un '0'.

- Iteración y Selección: Se itera el proceso de generación y cruce, seleccionando la cadena con el puntaje más alto hasta que se alcanza el score óptimo (MAX_LENGTH \* 2).

## Resultados

Al finalizar la ejecución, el programa mostrará:

- El número de iteraciones necesarias para llegar a la cadena óptima.

- El número total de cadenas generadas.

- La sucesión de cadenas aptas que llevaron a encontrar la cadena óptima.

## Consideraciones

- La longitud de la cadena generada es de 20, como se exige.

- Se controla el número de iteraciones y cruces necesarios para la solución.

- Todas las cadenas aptas se almacenan y se imprimen al finalizar el algoritmo.

Este proyecto es una representación sencilla de los conceptos básicos de un algoritmo genético.
