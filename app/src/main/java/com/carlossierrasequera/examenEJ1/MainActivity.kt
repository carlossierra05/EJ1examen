package com.carlossierrasequera.examenEJ1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.carlossierrasequera.examenEJ1.ui.theme.EJ1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            EJ1Theme {
               listaVideojuegos()
            }
        }
    }
}

@Composable
fun VideojuegoItem(url: String, nombre: String, precio: String) {
    Text(text = "Videojuego $nombre")
    val index = 1
    AsyncImage( model = "https://loremflickr.com/400/400/seville?lock=$index")
    Text(text = "Precio $precio")
}

@Composable
fun AsyncImage(model: String) {

}


@Composable
fun listaVideojuegos () {
    LazyColumn(modifier = Modifier.padding(16.dp)) {
        items(10) { index ->
            VideojuegoItem(
                url = "https://loremflickr.com/400/400/seville?lock=$index",
                nombre = "FIFA",
                precio = "10"
            )
            VideojuegoItem(
                url = "https://loremflickr.com/400/400/pokemon?lock=$index+1",
                nombre = "COD",
                precio = "15"
            )
            VideojuegoItem(
                url = "https://loremflickr.com/400/400/marvel?lock=$index+2",
                nombre = "FORTNITE",
                precio = "20"
            )
        }
    }
}
