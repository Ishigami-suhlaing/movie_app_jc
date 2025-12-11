package com.example.movieappjc

import android.util.Log
import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.movieappjc.R.*

private val EMAIL_FORMAT = "^[A-Za-z](.*)([@]{1})(.{1,})(\\.)(.{1,})"


@Composable
fun LoginScreen(

    navController: NavController
) {
    var splashScreenEvent by remember{ mutableStateOf(true)}

    if (splashScreenEvent){
        SplashScreen()
        LaunchedEffect(Unit) {
            kotlinx.coroutines.delay(3000)
            splashScreenEvent  = false
        }
    }else{

        val context = LocalContext.current

        var email by remember { mutableStateOf("") }
        var password by remember { mutableStateOf("") }

        var emailError by remember { mutableStateOf<String?>(null) }
        var passwordError by remember { (mutableStateOf<String?>(null)) }

        val testedEmail = "tester@gmail.com"
        val testedPassword = "123456"

        fun validateEmail(email: String) : Boolean{
            return EMAIL_FORMAT.toRegex().matches(email)
        }

        fun validatePassword(password: String): Boolean{
            return password.length >= 6
        }


        Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White)
        ){
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp),
                verticalArrangement = Arrangement.Center
            ){
                Image(painter = painterResource(R.drawable.composeimg), contentDescription = "compose login")
                Spacer(modifier = Modifier.height(8.dp))

                Text(
                    text = "Create your account",
                    fontSize = 24.sp,
                    modifier = Modifier.padding(bottom = 16.dp)
                )
                OutlinedTextField(
                    value = email,
                    onValueChange = {email = it},
                    label = { Text("Enter your email") },
                    modifier = Modifier.fillMaxWidth(),
                    isError = emailError != null,
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email)

                )
                Spacer(modifier = Modifier.height(8.dp))

                OutlinedTextField(
                    value = password,
                    onValueChange = {password = it},
                    label = { Text("Enter your password") },
                    modifier = Modifier.fillMaxWidth(),
                    isError = passwordError != null,
                    visualTransformation = PasswordVisualTransformation(),
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password)
                )
                Spacer(modifier = Modifier.height(8.dp))

                Button(
                    onClick = {
                        if(validateEmail(email = email) && validatePassword(password = password)){
                            if (email == testedEmail && password == testedPassword){
                                navController.navigate("home"){
                                    popUpTo("login"){
                                        inclusive = true
                                    }
                                }
                            }else{
                                Toast.makeText(context, "Incorrect Email or Password", Toast.LENGTH_SHORT).show()
                            }
                        }else{
                            if (!validateEmail(email = email)){
                                emailError = "Invalid Email Format."
                            }
                            if(!validatePassword(password = password)){
                                passwordError = "Invalid Password Format"
                            }


                        }



                    },
                    modifier = Modifier.fillMaxWidth(),
                    colors = ButtonDefaults.buttonColors(Color.Blue),
                ){
                    Text(text = "Log In", color = Color.White)
                }
            }
        }
    }


}