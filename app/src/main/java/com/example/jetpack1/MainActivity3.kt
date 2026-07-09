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
import androidx.compose.ui.draw.blur
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpack1.ui.theme.Jetpack1Theme

class MainActivity3 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Jetpack1Theme {
                Scaffold {

                    Column(modifier = Modifier.padding(it)){
                        Image(
                            painter = painterResource(R.drawable.star_on),
                            contentDescription = null,
                            alignment = Alignment.TopEnd,
                            contentScale = ContentScale.Fit,
                            modifier = Modifier
                                .padding(it)
                                .background(color = Color.Green)
                                .border(15.dp, color = Color.Yellow, shape = RoundedCornerShape(35))
                                .fillMaxSize(.3f)
                        )
                        Image(
                            painter = painterResource(R.drawable.ic_menu_send),
                            contentDescription = null,
                            alignment = Alignment.TopEnd,
                            contentScale = ContentScale.Fit,
                            modifier = Modifier
                                .padding(it)
                                .background(color = Color.Green)
                                .border(15.dp, color = Color.Yellow, shape = RoundedCornerShape(35))
                                .fillMaxSize(.3f)
                                .blur(5.dp, BlurredEdgeTreatment.Rectangle)
                        )
                        Text(
                            text = "HELLO",
                            fontSize = 50.sp,
                            modifier = Modifier
                                .padding(it)
                        )
                        Button(onClick = {}) {
                            Text(text = "HELLO 1")
                        }
                        Button(onClick = {}) {
                            Text(text = "HELLO 2")
                        }
                        //inner layout
                        Row(modifier = Modifier.padding(it)) {
                            Button(onClick = {}) {
                                Text(text = "HELLO 3")
                            }
                            Button(onClick = {}) {
                                Text(text = "HELLO 4")
                            }
                        }
                    }

                }
            }
        }
    }
}