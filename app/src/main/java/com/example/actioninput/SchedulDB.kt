package com.example.actioninput

val cityList = listOf("Dhaka","Cittagong","Rajshahi","Khulna","Cox's Bazar","Sylhet","Comilla","Noakhali","Borishal")
val busTypeEconomy = "Economy"
val busTypeBusiness = "Business"

data class BusSchedul(
  val id:Long,
  val busName:String,
  val from:String,
  val to:String,
  val departureDate:String,
  val depatureTime:String,
  val busType:String
)