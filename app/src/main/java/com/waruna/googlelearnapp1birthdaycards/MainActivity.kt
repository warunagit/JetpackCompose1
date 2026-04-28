package com.waruna.googlelearnapp1birthdaycards

import android.graphics.Color
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.AlignmentLine
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.waruna.googlelearnapp1birthdaycards.ui.theme.GoogleLearnApp1BirthdayCardsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            GoogleLearnApp1BirthdayCardsTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    GreetingColumn(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

//THIS iS TO DEFINE HOW THE UI SHOULD LOOKS LIKE
@Composable
fun GreetingColumn(name: String, modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Waruna")
        Text("Yasantha")
    }
}
@Composable
fun GreetingRow(name: String, modifier: Modifier = Modifier) {
    Row(
        modifier = Modifier.fillMaxSize(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center,
    ) {
        Text("Warasdsauna")
        Text("Yasasdsaantha")
    }
}

@Composable
fun GreetingBox(name: String, modifier: Modifier = Modifier) {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.TopCenter
    ) {
        Text("xxxxx", modifier = Modifier.align(Alignment.TopStart))
        Spacer(Modifier.height(10.dp))
        Text("yyyyy", modifier = Modifier.align(Alignment.BottomEnd))
    }
}

//this is to draw the preview with annotation
//calling what to view one by one
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    GreetingColumn("Android Row")
    GreetingRow("Android Column")
    GreetingBox("Android Box")
}

