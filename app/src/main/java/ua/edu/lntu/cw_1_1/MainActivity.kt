package ua.edu.lntu.cw_1_1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import ua.edu.lntu.cw_1_1.ui.theme.IPZ_CW_1_1_Primich_MariyaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            IPZ_CW_1_1_Primich_MariyaTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    GreetingWithSubtitle(
                        name = "Примич Марія",
                        subtitle = "Старанно виконує"
                    )
                }
            }
        }
    }
}

@Composable
fun GreetingWithSubtitle(name: String, subtitle: String) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = name,
            fontSize = 38.sp
        )
        Spacer(modifier = Modifier.height(5.dp))
        Text(
            text = subtitle,
            fontSize = 25.sp
        )
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    IPZ_CW_1_1_Primich_MariyaTheme {
        GreetingWithSubtitle(
            name = "Примич Марія",
            subtitle = "Старанно виконує"
        )
    }
}
