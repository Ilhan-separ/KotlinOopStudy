package com.example.kotlinoopstudy

open class Musician(name: String, instrument: String, age: Int) {

    var name :String?= name
        private set
        public get
    
    private var instrument : String? = instrument
    
    
    var age : Int? = age
        private set
        get

    private val bandName :String = "Royal Blood"


    fun returnBandName(password : String) :String {
        if (password == "password")
            return bandName
        else
            return "Wrong password"
    }


}