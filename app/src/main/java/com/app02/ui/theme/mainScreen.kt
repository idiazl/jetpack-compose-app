package com.app02.ui.theme

import android.app.ListActivity
import android.content.Context
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import android.content.Intent
import android.util.JsonReader
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.ui.Modifier
import androidx.core.content.ContextCompat.startActivity
import com.app02.SecondActivity

@Composable
fun MainScreen (){
    val scrollState = rememberScrollState()
    val context = LocalContext.current
    val ciudades = arrayOf(
        "Amazonas",
        "Áncash",
        "Apurímac",
        "Arequipa",
        "Ayacucho",
        "Cajamarca",
        "Callao",
        "Cusco",
        "Huancavelica",
        "Huánuco",
        "Ica",
        "Junín",
        "La Libertad",
        "Lambayeque",
        "Lima",
        "Loreto",
        "Madre de Dios",
        "Moquegua",
        "Pasco",
        "Piura",
        "Puno",
        "San Martín",
        "Tacna",
        "Tumbes",
        "Ucayali"
    )
    Column( Modifier.verticalScroll(state = scrollState)){
        for (index in ciudades.indices) {
            Button(
                onClick = {
                    val intent = Intent(context, SecondActivity::class.java)
                    intent.putExtra("name", ciudades[index])
                    context.startActivity(intent)

                },
                Modifier.size(width = 150.dp,height = 35.dp)
                // Uses ButtonDefaults.ContentPadding by default

            ) {
                Text(text = ciudades[index])
            }
        }
    }
}