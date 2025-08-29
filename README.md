# Documentación de Paquetes - cugdl.progra2

Este documento proporciona una visión general de todos los paquetes y clases en el proyecto cugdl.progra2.

## 1. Paquete: cugdl.progra2.math

Este paquete contiene clases relacionadas con operaciones matemáticas y cálculos.

### 1.1 RandomNumberGenerator

Clase que demuestra la generación de números aleatorios en Java.

**Métodos principales:**
- `main(String[] args)`: Genera y muestra un número aleatorio entre 0.0 y 1.0 utilizando la clase Math.

### 1.2 HypotenuseCalculator

Clase para calcular la hipotenusa de un triángulo rectángulo utilizando el teorema de Pitágoras.

**Métodos principales:**
- `main(String[] args)`: Demuestra el cálculo de la hipotenusa con valores predefinidos (sideA = 3.0, sideB = 4.0).
- `pythagoras(double sideA, double sideB)`: Calcula la hipotenusa a partir de los catetos usando la fórmula c = √(a² + b²).

### 1.3 TrigonometryExercise

Clase que demuestra el uso de funciones trigonométricas básicas.

**Métodos principales:**
- `main(String[] args)`: Calcula y muestra el valor en radianes, seno y coseno de un ángulo dado en grados (45.0 grados).
- `getRadians(double angleInDegrees)`: Convierte un ángulo de grados a radianes utilizando la fórmula: radianes = grados * π / 180.

## 2. Paquete: cugdl.progra2.aritmetica

Este paquete contiene clases para realizar operaciones aritméticas con diferentes tipos de datos numéricos.

### 2.1 IntegerOperations

Clase que implementa operaciones aritméticas básicas con números enteros.

**Métodos principales:**
- `main(String[] args)`: Demuestra las operaciones aritméticas con valores predefinidos (a = 10, b = 20, c = 5).
- `sum(int left_value, int right_value)`: Realiza la suma de dos enteros.
- `substract(int left_value, int right_value)`: Realiza la resta de dos enteros.
- `multiply(int left_value, int right_value)`: Realiza la multiplicación de dos enteros.
- `divide(int left_value, int right_value)`: Realiza la división de dos enteros.
- `modulo(int left_value, int right_value)`: Calcula el resto de la división de dos enteros.

### 2.2 FloatingPointOperations

Clase que implementa operaciones con números de punto flotante.

**Métodos principales:**
- `main(String[] args)`: Calcula y muestra el área de un círculo con un radio dado (10.5f).
- `getCircleArea(float radius)`: Calcula el área de un círculo utilizando la fórmula: área = π * radio².

## 3. Paquete: cugdl.progra2.convertions

Este paquete contiene clases relacionadas con la conversión de tipos de datos en Java.

### 3.1 CharBooleanExercise

Clase que demuestra el uso de los tipos de datos char y boolean, así como la conversión implícita de char a su valor ASCII.

**Métodos principales:**
- `main(String[] args)`: Muestra el valor ASCII del carácter 'ñ' y demuestra el uso del tipo de dato boolean con una variable `isJavaFun`.

### 3.2 TypeCastingExercise

Clase que demuestra el casting (conversión) entre diferentes tipos de datos numéricos en Java.

**Métodos principales:**
- `main(String[] args)`: Demuestra la conversión explícita (casting) de un valor double (100.4) a int, y de un valor int (25) a double.
