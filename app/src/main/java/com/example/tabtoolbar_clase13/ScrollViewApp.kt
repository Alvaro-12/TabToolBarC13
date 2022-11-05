package com.example.tabtoolbar_clase13

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class ScrollViewApp : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_scroll_view_app)
    }

    fun seleccinaFruta(Vista: View){
        when(Vista.id){
            R.id.bananas -> Toast.makeText(this, "son bananas", Toast.LENGTH_SHORT).show()
            R.id.cerezas-> Toast.makeText(this,"Son cerezas",Toast.LENGTH_SHORT).show()
            R.id.frambuesas-> Toast.makeText(this,"Son frambuesas",Toast.LENGTH_SHORT).show()
            R.id.fresas-> Toast.makeText(this,"Son fresas",Toast.LENGTH_SHORT).show()
            R.id.kiwis-> Toast.makeText(this,"Son kiwi",Toast.LENGTH_SHORT).show()
            R.id.mangos-> Toast.makeText(this,"Son mango",Toast.LENGTH_SHORT).show()
            R.id.manzanas-> Toast.makeText(this,"Son manzana",Toast.LENGTH_SHORT).show()
            R.id.melon-> Toast.makeText(this,"Son melon",Toast.LENGTH_SHORT).show()
            R.id.naranjas-> Toast.makeText(this,"Son naranjas",Toast.LENGTH_SHORT).show()
            R.id.pera-> Toast.makeText(this,"Son peras",Toast.LENGTH_SHORT).show()
            R.id.pina-> Toast.makeText(this,"Son piñas",Toast.LENGTH_SHORT).show()
            R.id.sandia-> Toast.makeText(this,"Son sandias",Toast.LENGTH_SHORT).show()
            R.id.uvas-> Toast.makeText(this,"Son uvas",Toast.LENGTH_SHORT).show()
            R.id.zarzamora-> Toast.makeText(this,"Son zarzamoras",Toast.LENGTH_SHORT).show()

        }
    }
}