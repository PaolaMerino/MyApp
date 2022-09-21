//Paola Carolina Merino Contreras
package com.example.myapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println("Hola estudiantes de programacion IV")
        VariableyConstantes()
        EjercicioValVar()
        TiposDeDatos()
        TiposDeDatosDeducidosExplicitos()
    }
    fun Saludo(){
        println("Hola estudiantes desde la funcion saludo")
    }
    private fun VariableyConstantes(){
        //Variable
        var MyPrimeraVariable = "Hola estudiantes de ingenieria"
        println(MyPrimeraVariable)

        MyPrimeraVariable ="Aqui cambiamos el valor de la variable"
        println(MyPrimeraVariable)

        //Constante
        val MyPrimeraConstante = "Esto es una constante"
        println(MyPrimeraConstante)
        //No puede ser modificado su valor

        val MiSegundaConstante:String=MyPrimeraVariable
        println(MiSegundaConstante)

        val MiNumero = 1
        val MiNumero2 = 2.2



    }
    fun EjercicioValVar(){
        println("Hola Alumno")
        val Nombre:String = "Pedro"

        var apellido:String = "Lopes"
        apellido = "Lopez"

        var edad:Int = 21
        edad = 22

        var salario = 1200
        salario = 1220

        //Concatenar
        var NombreCompleto = Nombre + " " +apellido
        println(NombreCompleto)

        val AñoNacimiento = 2000
        //Crear variable
        var AñoActual= Calendar.getInstance().get(Calendar.YEAR)
        var Edad = AñoActual-AñoNacimiento
        println("Tu edad es: " + Edad)



    }

    private fun TiposDeDatos(){
        //Enteros (Byte, short, int, Long)
        val myInt = 1
        val myInt2 = 3
        val myInt3: Int = myInt + myInt2
        println(myInt3)
        //Decimal (Float, double)
        val myFloat = 1.7f
        val myFloat2:Float =1.7f

        val myDouble = 1.3
        val myDouble2:Double =1.4
        val myDouble3:Double =5.0

        val mySumaDouble = myDouble+myDouble2+myDouble3
        println (mySumaDouble)

        //boolean (bool)

        val myBoolean:Boolean = true
        val myBoolean2:Boolean = false //Variable esplicita variable:variable
        val myBoolean3:Boolean = true
        println(myBoolean==myBoolean2)
        println(myBoolean&&myBoolean3)

    }

    private fun TiposDeDatosDeducidosExplicitos(){
        //Tipos de datos
        //Sirve para mostrar que tipo de datos esta mostrando en este caso int, int
        //Int
        var EnteroExplicito:Int = 45
        println(EnteroExplicito.javaClass)
        var EneteroDeducido = 35 //Ahorrar que tipo de variable o constante es
        println(EneteroDeducido .javaClass)

        //Double
        var FlotanteExplicito:Float = 45.45f
        println(FlotanteExplicito.javaClass)
        var FlotanteExplicito2:Double = 45.45
        println(FlotanteExplicito2.javaClass)
        var FlotanteDeducido = 35.35
        println(FlotanteDeducido.javaClass)

        //Long o largo
        var FLargoExplicito:Long = 454545
        println(FLargoExplicito.javaClass)
        var LargoDeducido = 353535
        println(LargoDeducido.javaClass)

        //Texto
        var TextoExplicito:String = "45"
        println(TextoExplicito.javaClass)
        var TextoDeducido:String = "45"
        println(TextoDeducido.javaClass)

        //Convertir datos de texto a entero
        EnteroExplicito=TextoExplicito.toInt()
        println(TextoExplicito.javaClass)

        EneteroDeducido=TextoDeducido.toInt()
        println(TextoDeducido.javaClass)





    }





}

