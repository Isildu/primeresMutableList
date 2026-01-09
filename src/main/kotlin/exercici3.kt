package org.example

import org.example.MutableLists.afegir
import org.example.MutableLists.comprovar
import org.example.MutableLists.eliminar
import org.example.MutableLists.mostrar
import org.example.MutableLists.tamany

fun main() {
    menuP()
}
fun mostrarMenuP(){
    println("OPCIONS:\n" +
            "1. Afegit nou Paquet \n" +
            "2. Mostrar tots els paquets \n" +
            "3. Mostrar només els paquets pendents d’entrega \n" +
            "4. Mostrar totsa els noms\n" +
            "5. Indicar quants elements hi ha a la llista.\n" +
            "6. Sortir")
}
fun menuP() {
    do {
        var nom = ""
        mostrarMenuP()
        var opcio = readInt("Escolleix e introdueix el numero de la opcio que vulguis escollir:", "No as introduit cap numero", "El numero introduit no equival a cap funcio", 1, 6)
        when (opcio){
            1 -> {
                nom = readSentence("Donam el nom del alumna a introduir en la llista.", "ERROR")
                var comprovacio = comprovar(nom)
                if(comprovacio){
                    println("Aquest nom ja existeix en la llista")
                }
                else{
                    afegir(nom.lowercase())
                    println("El nom ${nom.lowercase()} a sigut afegit correctament")
                }
            }
            2 -> {
                nom = readSentence("Donam el nom del alumna a eliminar de la llista.", "ERROR")
                var comprovacio = comprovar(nom)
                if(!comprovacio){
                    println("Aquest nom no se a trobqat en la llista")
                }
                else{
                    eliminar(nom.lowercase())
                    println("El nom ${nom.lowercase()} a sigut eliminat correctament")
                }
            }
            3 -> {
                nom = readSentence("Donam el nom del alumna a comprovar si es troba en la llista.", "ERROR")
                var comprovacio = comprovar(nom)
                if(!comprovacio){
                    println("Aquest nom no se a trobqat en la llista")
                }
                else{
                    println("El nom ${nom.lowercase()} Existeix en la llista")
                }
            }
            4 -> println("Els noms de la llista son ${mostrar()}")
            5 -> println("Hi ha un total de ${tamany()} noms a la llista.")
            6 -> println("Gracies per la seva visita")
        }
    }while (opcio != 6)
}