package buzz.sonne

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import buzz.sonne.ui.theme.AndroidComposeProjectTemplateTheme


@Composable
fun App() {
    AndroidComposeProjectTemplateTheme {
        Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
            Surface(modifier = Modifier.fillMaxSize().padding(innerPadding)) {
                // TODO
            }
        }
    }
}