package org.example

import org.example.MutableLists.afegir
import org.example.MutableLists.comprovar
import org.example.MutableLists.eliminar
import org.example.MutableLists.mostrar
import org.example.MutableLists.mostrarP
import org.example.MutableLists.mostrarPPendents
import org.example.MutableLists.paquet
import org.example.MutableLists.tamany
import org.example.MutableLists.tamanyP

fun main() {
    menuP()
}
fun mostrarMenuP(){
    println("OPCIONS:\n" +
            "1. Afegit nou Paquet \n" +
            "2. Mostrar tots els paquets \n" +
            "3. Mostrar només els paquets pendents d’entrega \n" +
            "4. Mostrar un paquet com entregat\n" +
            "5. Mostrar tots els paquets delicats.\n" +
            "6. Comptar quants paquets s’han entregat i quants queden pendents.\n" +
            "7. Sortir")
}
fun menuP() {
    do {
        var id: Int
        mostrarMenuP()
        var opcio = readInt("Escolleix e introdueix el numero de la opcio que vulguis escollir:", "No as introduit cap numero", "El numero introduit no equival a cap funcio", 1, 7)
        when (opcio){
            1 -> {
               afegir()
            }
            2 -> {
                if (tamanyP() > 0) println(mostrarP())
                else println("No se an trobat paquets")
            }
            3 -> {
                mostrarPPendents()
            }
            4 -> {
                if (tamanyP() > 0){
                    id = readInt("Donguim la id del paquet entregat (ex. 1)", "Numero incorrecta", "el numero de las id disponibles  el numero 1 es la minima i el ${tamanyP()} es el mes gran", 1, tamanyP())
                    entregat(id)
                }
            }
            5 -> println("Hi ha un total de ${tamany()} noms a la llista.")
            6 -> println("Gracies per la seva visita")
        }
    }while (opcio != 6)
}