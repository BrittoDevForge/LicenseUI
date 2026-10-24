package app.brittlabs.licenseui.sample

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ListItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import app.brittlabs.licenseui.model.LicenseInfo
import app.brittlabs.licenseui.sample.ui.theme.LicenseUITheme
import app.brittlabs.licenseui.ui.LicenseItem
import app.brittlabs.licenseui.ui.LicenseScreen

class MainActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LicenseUITheme {
                LicenseScreen(
                    listOf(
                        LicenseInfo(
                            name = "Android",
                            author = "The Android Open Source Project",
                            licenseType = "Apache V2",
                            licenseText = stringResource(R.string.aosplicense)
                        ),

                        LicenseInfo(
                            name = "Android",
                            author = "The Android Open Source Project",
                            licenseType = "Apache V2",
                            licenseText = "This is super powerfull license for andorid that helpes to function android and applications via api and more"
                        ),

                        LicenseInfo(
                            name = "Android",
                            author = "The Android Open Source Project",
                            licenseType = "Apache V2",
                            licenseText = "This is super powerfull license for andorid that helpes to function android and applications via api and more"
                        ),

                        LicenseInfo(
                            name = "Android",
                            author = "The Android Open Source Project",
                            licenseType = "Apache V2",
                            licenseText = "This is super powerfull license for andorid that helpes to function android and applications via api and more"
                        ),

                        LicenseInfo(
                            name = "Android",
                            author = "The Android Open Source Project",
                            licenseType = "Apache V2",
                            licenseText = "This is super powerfull license for andorid that helpes to function android and applications via api and more"
                        ),

                        LicenseInfo(
                            name = "Android",
                            author = "The Android Open Source Project",
                            licenseType = "Apache V2",
                            licenseText = "This is super powerfull license for andorid that helpes to function android and applications via api and more"
                        ),

                        LicenseInfo(
                            name = "Android",
                            author = "The Android Open Source Project",
                            licenseType = "Apache V2",
                            licenseText = "This is super powerfull license for andorid that helpes to function android and applications via api and more"
                        ),

                        LicenseInfo(
                            name = "Android",
                            author = "The Android Open Source Project",
                            licenseType = "Apache V2",
                            licenseText = "This is super powerfull license for andorid that helpes to function android and applications via api and more"
                        ),

                        LicenseInfo(
                            name = "Android",
                            author = "The Android Open Source Project",
                            licenseType = "Apache V2",
                            licenseText = "This is super powerfull license for andorid that helpes to function android and applications via api and more"
                        ),

                        LicenseInfo(
                            name = "Android",
                            author = "The Android Open Source Project",
                            licenseType = "Apache V2",
                            licenseText = "This is super powerfull license for andorid that helpes to function android and applications via api and more"
                        ),

                        LicenseInfo(
                            name = "Android",
                            author = "The Android Open Source Project",
                            licenseType = "Apache V2",
                            licenseText = "This is super powerfull license for andorid that helpes to function android and applications via api and more"
                        ),

                        LicenseInfo(
                            name = "Android",
                            author = "The Android Open Source Project",
                            licenseType = "Apache V2",
                            licenseText = "This is super powerfull license for andorid that helpes to function android and applications via api and more"
                        ),

                        LicenseInfo(
                            name = "Android",
                            author = "The Android Open Source Project",
                            licenseType = "Apache V2",
                            licenseText = "This is super powerfull license for andorid that helpes to function android and applications via api and more"
                        ),

                        LicenseInfo(
                            name = "Android",
                            author = "The Android Open Source Project",
                            licenseType = "Apache V2",
                            licenseText = "This is super powerfull license for andorid that helpes to function android and applications via api and more"
                        )


                    )
                )
            }
        }
    }
}
