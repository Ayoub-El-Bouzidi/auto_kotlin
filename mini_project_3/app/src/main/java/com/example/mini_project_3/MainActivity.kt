package com.example.mini_project_3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.mini_project_3.data.affirmations
import com.example.mini_project_3.ui.theme.Mini_project_3Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Mini_project_3Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    AffirmationsApp(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun AffirmationsApp(modifier: Modifier = Modifier) {
    // Declare and manage the affirmations list locally
    var affirmations = remember { mutableStateListOf("I am strong.", "I believe in myself.") }
    var newAffirmation by remember { mutableStateOf("") }

    Column(modifier = modifier.padding(16.dp)) {
        // TextField for entering new affirmations
        TextField(
            value = newAffirmation,
            onValueChange = { newAffirmation = it },
            placeholder = { ("Enter a new affirmation") },
            modifier = Modifier.fillMaxWidth()
        )
        // Button for adding the new affirmation
        Button(onClick = {
            if (newAffirmation.isNotBlank()) {
                affirmations.add(newAffirmation)
                newAffirmation = "" // Clear the TextField after adding
            }
        }) {
            Text("Add Affirmation")
        }
    }

    // Display the list of affirmations
    AffirmationsList(affirmations = affirmations, modifier = modifier)
}

@Composable
fun AffirmationsList(affirmations: List<String>, modifier: Modifier = Modifier) {
    LazyColumn(modifier = modifier) {
        items(affirmations) { affirmation ->
            AffirmationsCard(affirmation = affirmation)
        }
    }
}

@Composable
fun AffirmationsCard(affirmation: String, modifier: Modifier = Modifier) {
    Card(modifier = modifier.padding(8.dp)) {
        Text(
            text = affirmation,
            modifier = Modifier.padding(16.dp)
        )
    }
}
