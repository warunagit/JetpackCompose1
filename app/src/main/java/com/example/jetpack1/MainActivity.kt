package com.example.jetpack1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.BlurredEdgeTreatment
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.blur
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpack1.ui.theme.Jetpack1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Jetpack1Theme {
                Scaffold {
                    Text(
                        text = "Hello Andoird",
                        maxLines = 2,
                        softWrap = true,
                        fontFamily = FontFamily.Monospace,
                        color = Color.Red,
                        fontStyle = FontStyle.Italic,
                        fontWeight = FontWeight.Bold,
                        lineHeight = .8.sp,
                        letterSpacing = 4.sp,
                        //fontSize = 40.sp,
                        style = MaterialTheme.typography.labelLarge,
                        modifier = Modifier
                            .padding(it)
                            .background(color = Color.Yellow)
                            .blur(5.dp,BlurredEdgeTreatment.Rectangle)
                            .padding(10.dp)
                            .background(color = Color.Green)
                            .padding(10.dp)
                            .background(color = Color.Gray, shape = CircleShape)
                            //.fillMaxWidth()
                            //.fillMaxHeight()
                            //.fillMaxWidth(.8f)
                            //.fillMaxHeight(.7f)
                            //.fillMaxSize(.9f)
                            .size(width = 300.dp, height = 400.dp)
                            .height(300.dp)
                            .border(5.dp, color = Color.Black)
                            .alpha(.6f)
                    )
                }
            }
        }
    }
}