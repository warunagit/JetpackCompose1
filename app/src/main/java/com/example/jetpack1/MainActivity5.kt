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
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
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
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

class MainActivity5 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Jetpack1Theme {
                //can write UI here or can write with in the scaffold
                Scaffold(
                    //scaffold is the rule for UI
                    modifier = Modifier
                        .fillMaxSize()
                ) {
                    Box(
                        //Box is just a wrapper
                        modifier = Modifier
                            .padding(it)
                            .fillMaxSize()
                            .background(Color.Yellow.copy(.5f))){
                        //can call as a method or write here
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
    val userName = remember {
        mutableStateOf<String>("")
    }
    Column(
        modifier = Modifier.fillMaxSize()
            .verticalScroll(rememberScrollState()),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "Sign Up",
            fontSize = 40.sp,
            fontStyle = FontStyle.Italic,
            fontWeight = FontWeight.Bold
            //modifier = Modifier.padding(top = 100.dp)
        )
        Image(
            painter = painterResource(id = R.drawable.ic_launcher_foreground),
            contentDescription = "Image",
            Modifier.size(200.dp)
        )
        Spacer(modifier = Modifier.size(25.dp))
        OutlinedTextField(
            label = {Text("User Name", modifier = Modifier.size(40.dp))},
            value = userName.value,
            onValueChange = {
                userName.value = it
            }
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
        Button( onClick = {},
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 85.dp)
                .padding(top = 20.dp)) {
            Text(text = "Sign Up")
        }
    }
}