package br.com.fiap.testname

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import br.com.fiap.testname.navigation.NavigationRoutes
import br.com.fiap.testname.ui.theme.TestNameTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TestNameTheme {
                NavigationRoutes()
            }
        }
    }
}

