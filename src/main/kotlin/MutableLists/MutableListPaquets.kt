package org.example.MutableLists

import org.example.Data_Clases.Paquet
import org.example.readInt
import org.example.readSentence
import java.time.LocalDate


var paquet: MutableList<Paquet> = mutableListOf()

fun afegir() {
    var id = tamanyP() + 1
    var destinatari = readSentence("Nom del destinatari", "ERROR")
    var direccio = readSentence("direccio a entregar", "ERROR")
    var dataCompra = readSentence("Quan va comprar el paquet", "ERROR")
    //var entrega = readInt("El paquet a sigut entregat? (1=Si/2=No)", "Numero incorrecta", "El numero no es ni 1 ni 2", 1, 2)
    //var confEntrega: Boolean = false
    //if (entrega == 1) confEntrega = true
    var delicat = readInt("El paquet es delicat? (1=Si/2=No)", "Numero incorrecta", "El numero no es ni 1 ni 2", 1, 2)
    var confDelicat: Boolean = false
    if (delicat == 1) confDelicat = true
    paquet.add(Paquet(id,destinatari,direccio,dataCompra, null, confDelicat))
}
fun mostrarP(): MutableList<Paquet> {
    return paquet
}
fun mostrarPPendents(){
    var cont = 0
    for (x in 0 until paquet.size){
       if (paquet[x].dataEntrega == null) {
           println(paquet[x])
           cont ++
       }
    }
    if (cont == 0) println("tots els paquets entregats")
}
fun entregat(num: Int){
    paquet[num].dataEntrega = LocalDate.now().toString()
}
/*
fun comprovarP(nom: String): Boolean {
    for (valor in alumnes){
        if (nom == valor) return true
    }
    return false
}*/
/*
fun eliminar(nom: String) {
    alumnes.remove(nom)
}





fun tamany(): Int {
    return alumnes.size
}*/
fun tamanyP(): Int {
    return paquet.size
}