package com.cartodevisita

import android.os.Bundle
import android.widget.Space
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.Phone
import androidx.compose.material.icons.rounded.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.cartodevisita.ui.theme.CartãoDeVisitaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CartãoDeVisitaTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MainComponent()
                }
            }
        }
    }
}

@Composable
fun LogoImageAndroid() {
    val logo = painterResource(R.drawable.android_logo)

    Image(
        painter = logo,
        contentDescription = null,
        contentScale = ContentScale.Fit,
        modifier = Modifier.width(150.dp)
    )

}

@Composable
fun User() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Kevin Sarges", textAlign = TextAlign.Center, fontSize = 30.sp)
        Text(text = "Mobile Developer Android", fontWeight = FontWeight.Bold, color = Color(0xFF3ddc84),)
    }
}

@Composable
fun ContactUser(icon: ImageVector, descricaoIcon: String, contato: String) {
    Row {
        Icon(icon, contentDescription = descricaoIcon, tint = Color(0xFF3ddc84))
        Text(text = contato, modifier = Modifier.padding(start = 20.dp))
    }
}

@Composable
fun ContactsUser() {
    val icon = Icons.Rounded

    Column{
        ContactUser(
            icon.Phone,
            descricaoIcon = "Telefone",
            contato = "(91) 9 85206041",
        )
        ContactUser(
            icon.Share,
            descricaoIcon = "Social midia",
            contato = "@kevin-sarges",
        )
        ContactUser(
            icon.Email,
            descricaoIcon = "Email",
            contato = "kevinsarges08@gmail.com",
        )
    }
}

@Composable
fun InfoUser() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFD2E8D4)),
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                LogoImageAndroid()
                User()
            }
        }
        Spacer(modifier = Modifier.height(150.dp))
        Box(
            modifier = Modifier
                .padding(vertical = 50.dp)
        ) {
            ContactsUser()
        }
    }
}


@Composable
fun MainComponent() {
    InfoUser()
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    CartãoDeVisitaTheme {
        MainComponent()
    }
}