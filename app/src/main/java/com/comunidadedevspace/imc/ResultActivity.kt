package com.comunidadedevspace.imc

import android.graphics.Color
import android.os.Bundle
import android.text.Spannable
import android.text.SpannableString
import android.text.style.ForegroundColorSpan
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.graphics.toColorInt
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

const val KEY_RESULT_IMC = "ResultActivity.KEY_IMC"


class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_result)


        val result = intent.getFloatExtra(KEY_RESULT_IMC, 0f)

        val tvResult = findViewById<TextView>(R.id.tv_result)
        val tvclassificaçao = findViewById<TextView>(R.id.tv_classificaçao)
        tvResult.text = result.toString()


        val classificacao: String = if (result <= 18.5f) {
            "MAGREZA"
        } else if (result > 18.5 && result <= 24.9f) {
            "NORMAL"
        } else if (result > 25f && result <= 29.9f) {
            "SOBREPESO"
        } else if (result > 30f && result <= 39.9f) {
            "OBESIDADE"
        } else {
            "OBESIDADE GRAVE"
        }

        tvclassificaçao.text = classificacao

        if (result <= 18.5f) {

            tvclassificaçao.text = "MAGREZA"
            tvclassificaçao.setTextColor(ContextCompat.getColor(this, R.color.green))

        } else if (result > 18.5 && result <= 24.9) {

            tvclassificaçao.text = "NORMAL"
            tvclassificaçao.setTextColor(ContextCompat.getColor(this, R.color.green))

        } else if (result > 25 && result <= 29.9) {

            tvclassificaçao.text = "SOBREPESO"
            tvclassificaçao.setTextColor(ContextCompat.getColor(this, R.color.yellow))

        } else if (result > 30 && result <= 39.9) {

            tvclassificaçao.text = "OBESIDADE"
            tvclassificaçao.setTextColor(ContextCompat.getColor(this, R.color.red))

        }  else if (result > 39.9)  {

                    tvclassificaçao.text = "OBESIDADE GRAVE"
                    tvclassificaçao.setTextColor(ContextCompat.getColor(this,R.color.red))

                }
                }
                }





















