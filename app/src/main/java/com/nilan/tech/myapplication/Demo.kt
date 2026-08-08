package com.nilan.tech.myapplication

fun main() {
    println("Hi")


    val runnable = (object: Runnable {
        override fun run() {
            println("Hi there")
        }
    })

    val run: Runnable = Test()
    val run1: Runnable = TestRun

}

class Test : Runnable {
    override fun run() {
        print("test")
    }
}

object TestRun: Runnable {
    override fun run() {
        println("Hi there")
    }
}
