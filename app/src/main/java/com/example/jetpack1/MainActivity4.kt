package com.example.jetpack1


import android.R
import android.graphics.drawable.Icon
import androidx.compose.ui.graphics.Color
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.BlurredEdgeTreatment
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.blur
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpack1.ui.theme.Jetpack1Theme

class MainActivity4 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Jetpack1Theme {
                Scaffold {
                        //inner layout
                   Column(
                       modifier = Modifier
                          .padding(it)
                          .fillMaxSize(.5f)
                           .padding(50.dp)
                          .background(Color.Yellow),
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.Bottom
                       ) {
                           Button(onClick = {}) {
                              Text(text = "HELLO 3")
                           }
                           Button(onClick = {}) {
                             Text(text = "HELLO 4")
                           }
                       }
                    Row(
                        modifier = Modifier
                            .padding(it)
                            .alpha(.2f)
                            .fillMaxSize(.5f)
                            .background(Color.Yellow),
                        horizontalArrangement = Arrangement.Center,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Button(onClick = {}) {
                            Text(text = "HELLO 5")
                        }
                        Button(onClick = {}) {
                            Text(text = "HELLO 6")
                        }
                    }
                   }
                }
            }
        }
    }
