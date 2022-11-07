package packages
// A sintaxe para importar código é a seguinte:
// import packagename.ClassName / import packagename.functionName / import packagename.propertyName


import kotlin.math.PI
import kotlin.math.cos // Cosine
import kotlin.random.Random

// As vezes você está usando multiplas bibliotecas que possuem classes ou funções com o mesmo nome
// a palavra-chave 'as' permite você mudar nomes enquanto está importando

import kotlin.math.E as euler

// Para importar tudo de um pacote use um '*'
import kotlin.math.*
fun main() {
//    Você pode usar o nome por extenso do pacote diretamente no código, o código pode ser menos legível por conta
//    dos nomes dos pacotes, mas a sua origem é absolutamente clara
    println(euler)
    println(kotlin.math.E)
    println(PI)
    println(cos(PI))
    println(cos(2 * PI))
    println(Random.nextInt(1, 11))
}