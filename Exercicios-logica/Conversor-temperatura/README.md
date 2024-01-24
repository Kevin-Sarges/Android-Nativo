## Conversor de temperatura

Existem três padrões principais de temperatura usados no mundo: Celsius, Fahrenheit e Kelvin.

No código inicial fornecido no snippet abaixo, escreva um programa que converta uma temperatura de um padrão a outro usando estas fórmulas:

- Celsius para Fahrenheit: °F = 9/5 (°C) + 32.
- Kelvin para Celsius: °C = K - 273,15
- Fahrenheit para Kelvin: K = 5/9 (°F - 32) + 273,15

O método `String.format("%.2f", /* measurement */ )` é usado para converter um número em um tipo `String` com duas casas decimais.

```kotlin
fun main() {
  // Fill in the code.
}

fun printFinalTemperature(
  initialMeasurement: Double,
  initialUnit: String,
  finalUnit: String,
  conversionFormula: (Double) -> Double
) {
  val finalMeasurement = String.format("%.2f", conversionFormula(initialMeasurement)) // two decimal places
  println("$initialMeasurement degrees $initialUnit is $finalMeasurement degrees $finalUnit.")
}
```

#### Objetivo

Complete a função `main()` para chamar a função `printFinalTemperature()` e mostrar as linhas abaixo. É necessário transmitir argumentos para a fórmula de conversão e a temperatura. Dica: use valores `Double` para evitar truncamentos de números `Integer` durante as operações de divisão.

##### retorno esperado:

```shell
27.0 degrees Celsius is 80.60 degrees Fahrenheit.
350.0 degrees Kelvin is 76.85 degrees Celsius.
10.0 degrees Fahrenheit is 260.93 degrees Kelvin.
```
