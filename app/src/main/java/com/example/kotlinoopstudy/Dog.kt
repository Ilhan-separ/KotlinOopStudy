package com.example.kotlinoopstudy

class Dog : Animal() {

    fun test(){
        super.noise()
    }

    override fun noise(){
        println("hev hev")
    }


}