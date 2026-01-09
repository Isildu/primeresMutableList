package org.example.MutableLists

var numeros: MutableList<Float> = mutableListOf()
var numerosFiltrarts: MutableList<Float> = mutableListOf()

fun afegir(num: Float) {
    numeros.add(num)
}

fun eliminar(num: Float) {
    numeros.remove(num)
}

fun comprovar(num: Float): Boolean {
    for (valor in numeros){
        if (num == valor) return true
    }
    return false
}

fun mostrar2(): MutableList<Float> {
    return numeros
}

fun suma(): Float{
    var result = 0.0f
    for (x in numeros){
        result += x
    }
    return result
}

fun max(): Float{
    var result = numeros[0]
    for (x in numeros){
        if (x > result){
             result = x
        }
    }
    return result
}

fun min(): Float{
    var result = numeros[0]
    for (x in numeros){
        if (x < result){
            result = x
        }
    }
    return result
}

fun mitjana(): Float {
    var sum = suma()
    var result = sum / tamany2()
    return result
}

fun tamany2(): Int {
    return numeros.size
}

fun parells(): MutableList<Float>{
    var positiu = 0.0f
    for (x in numeros ){
        if (x < 0) positiu = x * -1
        else positiu = x
        if(positiu % 2f == 0.0f && positiu !in numerosFiltrarts) numerosFiltrarts.add(positiu)
    }
    return numerosFiltrarts
}

