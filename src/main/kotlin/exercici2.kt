package org.example

import org.example.MutableLists.afegir
import org.example.MutableLists.comprovar
import org.example.MutableLists.eliminar
import org.example.MutableLists.max
import org.example.MutableLists.min
import org.example.MutableLists.mitjana
import org.example.MutableLists.mostrar2
import org.example.MutableLists.parells
import org.example.MutableLists.suma
import org.example.MutableLists.tamany2

fun main() {
    println("Funcions amb numeros que poden ser decimals per el extra:")
    menuEx2()
}
fun mostrarMenuEx2(){
    println("OPCIONS:\n" +
            "1. Afegit numero a la llista \n" +
            "2. Eliminar numero de la llista\n" +
            "3. Mostrar tots els números de la llista (de menor a major).\n" + //extra de: Mostrar la llista ordenada de menor a major (sense modificar la llista original).
            "4. Calcular la suma, el valor màxim, el mínim i la mitjana.\n" +
            "5. Mostrar només els números parells.(Sempre que no tinguin decimals)\n" +
            "6. Sortir")
}
fun menuEx2() {
    do {
        var numero: Float
        mostrarMenuEx2()
        var opcio = readInt("Escolleix e introdueix el numero de la opcio que vulguis escollir:", "No as introduit cap numero", "El numero introduit no equival a cap funcio", 1, 6)
        when (opcio){
            1 -> {
                numero = readFloat("Donam un numero per afegir a la llista", "Numero no reconegut")
                var comprovacio = comprovar(numero)
                if(comprovacio){
                    println("Aquest numero ja existeix en la llista")
                }
                else{
                    afegir(numero)
                    println("El numero $numero a sigut afegit correctament")
                }
            }
            2 -> {
                numero = readFloat("Donam un numero per eliminar de la llista", "Numero no reconegut")
                var comprovacio = comprovar(numero)
                if(!comprovacio){
                    println("Aquest numero no existeix en la llista")
                }
                else{
                    eliminar(numero)
                    println("El numero $numero a sigut eliminat correctament")
                }
            }
            3 -> {
                var comprovacio = tamany2()
                if (comprovacio > 0) println("Els numeros de la llista son ${mostrar2().sorted()}")
                else println("no se an trobat numeros en la llista")
            }
            4 ->{
                var comprovacio = tamany2()
                if (comprovacio > 0){
                    println("la suma de tots els numeros es ${suma()}")
                    println("El valor maxim es es ${max()}")
                    println("El valor minim es es ${min()}")
                    println("la mitjana de tots els numeros es ${mitjana()}")
                }else println("La llista esta buida TROS DE QUÒNIAM.")
            }
            5 -> {
                var parells = parells()
                if (parells.size > 0) println("Els numeros parells son: ${parells}")
                else println("no se an trobat numeros parells")
            }
            6 -> println("Gracies per la seva visita")
        }
    }while (opcio != 6)
}