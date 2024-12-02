package com.example.tuto_3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.tuto_3.ui.theme.Tuto_3Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            setContent {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(16.dp),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.ic_profile),
                        contentDescription = "Photo de profil",
                        modifier = Modifier.size(128.dp)
                    )
                    Spacer(modifier = Modifier.height(8.dp))
                    Text(text = "Madani Ali", style = MaterialTheme.typography.h5)
                    Text(text = "Développeur Android", style = MaterialTheme.typography.body1)
                    Spacer(modifier = Modifier.height(16.dp))
                    Button(onClick = { println("Carte de visite partagée !") }) {
                        Text(text = "Partager")
                    }
                }
            }
            }
        }
    }
}

