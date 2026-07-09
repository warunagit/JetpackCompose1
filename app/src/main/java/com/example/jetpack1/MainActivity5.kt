package com.example.jetpack1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetpack1.ui.theme.Jetpack1Theme
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.paddingFrom
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.ui.unit.sp

class MainActivity5 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Jetpack1Theme {
                Scaffold(
                    modifier = Modifier
                        .fillMaxSize()
                ) {
                    Box(
                        //Box is just a wrapper
                        modifier = Modifier
                            .padding(it)
                            .fillMaxSize()
                            .background(Color.Yellow)){
                        SignUpUi()
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun SignUpUi(){
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top
    ) {
        Text(
            text = "Sign Up",
            fontSize = 40.sp,
            modifier = Modifier.padding(top = 100.dp)

        )
        Image(
            painter = painterResource(id = R.drawable.ic_launcher_foreground),
            contentDescription = "Image"
        )
        OutlinedTextField(
            label = {Text("User Name")},
            value = "",
            onValueChange = {}
        )
        OutlinedTextField(
            label = {Text("Email")},
            value = "",
            modifier = Modifier.padding(top = 20.dp),
            onValueChange = {}
        )
        OutlinedTextField(
            label = {Text("Password")},
            value = "",
            modifier = Modifier.padding(top = 20.dp),
            onValueChange = {}
        )
        Button( onClick = {}, modifier = Modifier.padding(top = 20.dp)) {
            Text(text = "Sign Up")
        }
    }
}
