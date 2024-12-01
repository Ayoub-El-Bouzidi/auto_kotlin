package com.example.miniproject

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ModifierLocalBeyondBoundsLayout
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.miniproject.data.affirmations
import com.example.miniproject.ui.theme.MiniProjectTheme
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.TextField
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.input.TextFieldValue


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MiniProjectTheme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    AffirmationApp()
                }
            }
        }
    }
}
@Preview
@Composable
fun AffirmationApp() {
    MaterialTheme(
        colorScheme = lightColorScheme(
            primary = Color(0xFF6200EE),
            onPrimary = Color.White,
            background = Color(0xFFF5F5F5),
            surface = Color.White,
            onSurface = Color.Black
        )
    ) {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {

        }
    }
}

@Composable
fun AffirmationList(affirmations: List<String>){
    LazyColumn(
        modifier = Modifier.padding(dimensionResource(id = R.dimen.padding_small))
    ) {
        items(affirmations){affirmation->
            AffirmationCard(affirmation)
        }
    }
}
@Composable
fun AffirmationCard(affirmation:String){
    val isClicked = remember { mutableStateOf(false) }
    val backgroundColor = if(isClicked.value){
        Color(0xFFBB86FC)
    }
    else{
        Color(0xFF625b71)
    }
    Card(
        modifier = Modifier.fillMaxWidth()
        .padding(5.dp)
            .clickable{
                isClicked.value = !isClicked.value
            },
        colors = androidx.compose.material3.CardDefaults.cardColors(containerColor = backgroundColor)
    ) {

        Text(
            text = affirmation,
            style = MaterialTheme.typography.bodyLarge,
            modifier = Modifier.padding(16.dp),
        )
    }
}
