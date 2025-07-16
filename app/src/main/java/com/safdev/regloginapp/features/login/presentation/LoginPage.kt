package com.safdev.regloginapp.features.login.presentation

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.input.TextFieldState
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Check
import androidx.compose.material.icons.outlined.Email
import androidx.compose.material.icons.outlined.Lock
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.safdev.regloginapp.R
import com.safdev.regloginapp.features.login.comp.AppTextField
import com.safdev.regloginapp.features.login.comp.AuthOption

/** Author : Fahim Shahriar
 * On :- 11:58 PM ; 7/15/2025
 **/


@Composable
fun LoginPage(modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 20.dp),
        verticalArrangement = Arrangement.SpaceAround
    ) {
        Column {
            Image(
                painter = painterResource(id = R.drawable.login),
                contentDescription = null,
                contentScale = ContentScale.FillHeight,
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxWidth(0.3f)
            )

            Spacer(modifier = Modifier.height(16.dp))

            Text(
                text = "Login",
                fontWeight = FontWeight.Bold,
                fontSize = 40.sp
            )
        }

        AppTextField(
            textFieldState = TextFieldState(),
            hint = "Email",
            leadingIcon = Icons.Outlined.Email,
            keyboardType = KeyboardType.Email,
            trailingIcon = Icons.Outlined.Check,
            modifier = Modifier.fillMaxWidth(),
        )

        AppTextField(
            textFieldState = TextFieldState(),
            hint = "Password",
            leadingIcon = Icons.Outlined.Lock,
            trailingText = "Forgot?",
            modifier = Modifier.fillMaxWidth(),
        )

        Button(
            onClick = {

            },
            modifier = Modifier
                .fillMaxWidth(),
        ) {
            Text(
                text = "Login",
                fontSize = 18.sp,
                modifier = Modifier.padding(vertical = 8.dp)
            )
        }

        Text(
            text = "Or, login with...",
            fontSize = 15.sp,
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .alpha(0.5f),
        )

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceAround,
        ) {
            AuthOption(
                image = R.drawable.google,
                modifier = Modifier
                    .clickable{

                }
            )
            AuthOption(
                image = R.drawable.facebook,
                modifier = Modifier
                    .clickable{

                }
            )
            AuthOption(
                image = R.drawable.apple,
                tint = MaterialTheme.colorScheme.onBackground,
                modifier = Modifier
                    .clickable{

                }
            )
        }

        Row(
            modifier = Modifier.align(Alignment.CenterHorizontally)
        ) {
            Text(
                text = "Don't have an account?",
                fontSize = 16.sp,
            )
            Text(
                text = "Register",
                fontSize = 16.sp,
                color = MaterialTheme.colorScheme.primary,
                fontWeight = FontWeight.SemiBold,
                modifier = Modifier.clickable{
                    // Handle sign up click
                }
            )
        }

        Spacer( modifier = Modifier.height(2.dp))

    }
}




@Preview(showBackground = true, showSystemUi = true)
@Composable
fun LoginPagePreview() {
    LoginPage()
}