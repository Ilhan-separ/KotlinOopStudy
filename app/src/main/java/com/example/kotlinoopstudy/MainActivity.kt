package com.example.kotlinoopstudy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //constructor
        var myUser = User("Kalender",75)
        myUser.name = "Bela"
        myUser.age = 24

        //Encapsulation
        var myMusician = Musician("paşo","guitar",34)
        //myMusician.age = 50
        println(myMusician.age)
        println(myMusician.returnBandName("password"))

        //Inheritance
        var mySuperMusician = SuperMusician("Kımız","bass",34)
        //println(mySuperMusician.instrument)
        println(mySuperMusician.name)
        println(mySuperMusician.returnBandName("passworld"))
        mySuperMusician.sing()

        //Polymorphism

        //Static Polymorphism
        var myMathematics = Mathematics()
        println(myMathematics.sum())
        println(myMathematics.sum(10,5))
        println(myMathematics.sum(10,5,3))

        //Dynamic Polymorphism
        var animal = Animal()
        animal.noise()

        var karabas = Dog()
        karabas.test()
        karabas.noise()

        //Abstract & Interface

        //var people = People()
        var myPiano = Piano()
        myPiano.brand = "brand"
        myPiano.digital = true
        println(myPiano.roomName)
        myPiano.info()
        myPiano.piano()

        //Lambda

        val testString = {myString : String -> println(myString)}
        testString("Lambda Test String")

        val multiplyLambda = {a:Int,b:Int -> a*b}
        println(multiplyLambda(5,4))

        val sumLambda : (Int,Int) -> Int = {a,b -> a+b}
        println(sumLambda(7,3))

        //asynchronous
        //callback function

        fun downloadTest(url:String,completion : (Musician) -> Unit){
            val mike = Musician("Mike Kerr","Bass",31)
            completion(mike)
        }
        downloadTest("royalblood.co",{musician ->
            println(musician.name)
        })

    }
}