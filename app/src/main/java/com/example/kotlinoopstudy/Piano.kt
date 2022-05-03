package com.example.kotlinoopstudy

class Piano:HouseDecor,Instrument {

    override var roomName: String
        get() = "Kitchen"
        set(value) {}

    override fun info() {
       println("info")
    }


    var brand : String? = null
    var digital : Boolean? = null



}


