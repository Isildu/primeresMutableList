package org.example.Data_Clases

data class Paquet(var destinatari: String,
                  var direccioEntrega: String,
                  var dataCompra: String,
                  var dataEntrega: String?,
                  var esDelicat: Boolean)