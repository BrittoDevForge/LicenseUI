package app.brittlabs.licenseui.model

data class LicenseInfo(
    val name: String,
    val author: String? = null,
    val licenseType: String,
    val licenseText: String
)
