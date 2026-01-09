package org.example.MutableLists

var alumnes: MutableList<String> = mutableListOf()

fun afegir(nom: String) {
    alumnes.add(nom)
}

fun eliminar(nom: String) {
    alumnes.remove(nom)
}

fun comprovar(nom: String): Boolean {
    for (valor in alumnes){
        if (nom == valor) return true
    }
    return false
}

fun mostrar(): MutableList<String> {
    return alumnes
}

fun tamany(): Int {
    return alumnes.size
}