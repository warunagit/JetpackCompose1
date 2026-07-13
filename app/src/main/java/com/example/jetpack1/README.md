//https://www.youtube.com/watch?v=FCmRdSnqON4
// 21.56

1
basic compose view, non auto drawable
setContent {
Jetpack1Theme {
Text(text = "Hello Andoird")
}
}

2
add compossable layout - Scaffold
Scaffold {
Text(text = "Hello Andoird", 
modifier = Modifier.padding(it))
}
//it-> expression for initial padding values/system pre defined values

3
add extra element modifies
fontSize = 50.sp,
fontFamily = FontFamily.Cursive,
modifier = Modifier.padding(it)
//other modifiers..
.padding(it)
.background(color = Color.Yellow)
.blur(5.dp,BlurredEdgeTreatment.Rectangle)
.padding(10.dp)
.background(color = Color.Green)
.padding(5.dp)
.background(color = Color.Gray, shape = CircleShape)
//.fillMaxWidth()
//.fillMaxHeight()
//.fillMaxWidth(.8f)
//.fillMaxHeight(.7f)
//.fillMaxSize(.9f)
.size(width = 200.dp, height = 400.dp)
.height(300.dp)
)

ctrl+p -> view all layout parameters
applys in progressive mode, one after one

4
scaffold
UI can write within the theme scope or within Scaffold

5
enable auto  scroll layout
.verticalScroll(rememberScrollState()),

6
enable state management to type texts into text fields

7
context in compose must initialize manually
val context = LocalContext.current

8

