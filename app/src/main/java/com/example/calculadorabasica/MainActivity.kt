package com.example.calculadorabasica

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private var operador: String? = null
    private var temporal: String? = null
    private var etingreso: EditText? = null

    private var btn1: Button? = null
    private var btn2: Button? = null
    private var btn3: Button? = null
    private var btn4: Button? = null
    private var btn5: Button? = null
    private var btn6: Button? = null
    private var btn7: Button? = null
    private var btn8: Button? = null
    private var btn9: Button? = null
    private var btn0: Button? = null
    private var btnpunto: Button? = null

    private var btnsuma: Button? = null
    private var btnresta: Button? = null
    private var btnpor: Button? = null
    private var btnsobre: Button? = null
    private var btnigual: Button? = null
    private var btndel: Button? = null
    private var btnac: Button? = null
    private var tvsigno: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etingreso = findViewById<EditText>(R.id.etIngreso)
        btn1 = findViewById<Button>(R.id.btn1)
        btn2 = findViewById<Button>(R.id.btn2)
        btn3 = findViewById<Button>(R.id.btn3)
        btn4 = findViewById<Button>(R.id.btn4)
        btn5 = findViewById<Button>(R.id.btn5)
        btn6 = findViewById<Button>(R.id.btn6)
        btn7 = findViewById<Button>(R.id.btn7)
        btn8 = findViewById<Button>(R.id.btn8)
        btn9 = findViewById<Button>(R.id.btn9)
        btn0 = findViewById<Button>(R.id.btn0)
        btnpunto = findViewById<Button>(R.id.btnpunto)
        btnsuma = findViewById<Button>(R.id.btnmas)
        btnresta = findViewById<Button>(R.id.btnmenos)
        btnpor = findViewById<Button>(R.id.btnpor)
        btnsobre = findViewById<Button>(R.id.btndivision)
        btnigual = findViewById<Button>(R.id.btnigual)
        btndel = findViewById<Button>(R.id.btndel)
        btnac = findViewById<Button>(R.id.btnac)
        tvsigno = findViewById<TextView>(R.id.tvsigno)

        btn1!!.setOnClickListener(this)
        btn2!!.setOnClickListener(this)
        btn3!!.setOnClickListener(this)
        btn4!!.setOnClickListener(this)
        btn5!!.setOnClickListener(this)
        btn6!!.setOnClickListener(this)
        btn7!!.setOnClickListener(this)
        btn8!!.setOnClickListener(this)
        btn9!!.setOnClickListener(this)
        btn0!!.setOnClickListener(this)
        btnpunto!!.setOnClickListener(this)
        btnsuma!!.setOnClickListener(this)
        btnresta!!.setOnClickListener(this)
        btnpor!!.setOnClickListener(this)
        btnsobre!!.setOnClickListener(this)
        btnigual!!.setOnClickListener(this)
        btndel!!.setOnClickListener(this)
        btnac!!.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        var resultado: Float =0f

        when(v?.id){
            R.id.btn1 -> etingreso?.setText(etingreso?.text.toString() + "1")
            R.id.btn2 -> etingreso?.setText(etingreso?.text.toString() + "2")
            R.id.btn3 -> etingreso?.setText(etingreso?.text.toString() + "3")
            R.id.btn4 -> etingreso?.setText(etingreso?.text.toString() + "4")
            R.id.btn5 -> etingreso?.setText(etingreso?.text.toString() + "5")
            R.id.btn6 -> etingreso?.setText(etingreso?.text.toString() + "6")
            R.id.btn7 -> etingreso?.setText(etingreso?.text.toString() + "7")
            R.id.btn8 -> etingreso?.setText(etingreso?.text.toString() + "8")
            R.id.btn9 -> etingreso?.setText(etingreso?.text.toString() + "9")
            R.id.btn0 -> etingreso?.setText(etingreso?.text.toString() + "0")
            R.id.btnpunto -> etingreso?.setText(etingreso?.text.toString() + ".")

            R.id.btnmas ->{
                temporal=etingreso?.text.toString()
                etingreso?.setText("")
                operador="+"
            }

            R.id.btnmenos ->{
                temporal=etingreso?.text.toString()
                etingreso?.setText("")
                operador="-"
            }

            R.id.btnpor ->{
                temporal=etingreso?.text.toString()
                etingreso?.setText("")
                operador="*"
            }

            R.id.btndivision ->{
                temporal=etingreso?.text.toString()
                etingreso?.setText("")
                operador="/"
        }

            R.id.btnigual ->{
                when(operador){
                    "+" ->{
                        resultado=temporal?.toFloat()!!+etingreso?.text.toString().toFloat()
                        etingreso?.setText(resultado.toString())
                    }
                    "-" ->{
                        resultado=temporal?.toFloat()!!-etingreso?.text.toString().toFloat()
                        etingreso?.setText(resultado.toString())
                    }
                    "*" ->{
                        resultado=temporal?.toFloat()!!*etingreso?.text.toString().toFloat()
                        etingreso?.setText(resultado.toString())
                    }
                    "/" ->{
                        resultado=temporal?.toFloat()!!/etingreso?.text.toString().toFloat()
                        etingreso?.setText(resultado.toString())
                    }
                }
            }

            R.id.btndel ->{
                var cadena= etingreso?.text.toString()
                if((cadena!=null)&&(!cadena.equals(""))){
                    cadena=cadena.substring(0, cadena.length-1)
                    etingreso?.setText(cadena)
                }
            }

            R.id.btnac ->{
                etingreso?.setText("")
                operador=""
            }
        }

    }
}
