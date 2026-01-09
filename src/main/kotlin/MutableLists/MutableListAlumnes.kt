package org.example.MutableLists

var alumnes: MutableList<String> = mutableListOf()

fun afegir(nom: String): Boolean {
    return alumnes.add(nom)
}

fun eliminar(nom: String) {
    alumnes.remove(nom)
}

fun comprovar(nom: String): Boolean {
    var validacio = false
    for (valor in alumnes){
        if (nom == valor) validacio = true
    }
    return validacio
}

fun mostrar(): MutableList<String> {
    return alumnes
}

fun tamany(): Int {
    return alumnes.size
}