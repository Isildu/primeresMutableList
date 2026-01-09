package org.example.MutableLists

import org.example.Paquet


var paquet: MutableList<Paquet> = mutableListOf()

fun afegir(nom: Paquet) {
    paquet.add(nom)
}
/*
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
}*/