package com.example.kotlinoopstudy

class User :People {

    var name : String? = null
    var age : Int? = null


    constructor(nameInput:String,ageInput:Int){
        this.name=nameInput
        this.age=ageInput
    }



}