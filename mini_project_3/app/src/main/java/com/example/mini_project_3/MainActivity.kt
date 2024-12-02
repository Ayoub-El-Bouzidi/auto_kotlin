package com.example.mini_project_3

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
import com.example.mini_project_3.data.affirmations
import com.example.mini_project_3.ui.theme.Mini_project_3Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Mini_project_3Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    AffirmationsList(affirmations = affirmations)
                }
            }
        }
    }
}

@Composable
fun AffirmationsList(affirmations:List<Striong>, modifier : Modifier = Modifier){
    LazyColumn {
        items(affirmations){affirmation->
            Text(

            )

        }
    }
}
