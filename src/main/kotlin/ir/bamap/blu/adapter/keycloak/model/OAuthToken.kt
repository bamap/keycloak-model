package ir.bamap.blu.adapter.keycloak.model

import com.fasterxml.jackson.annotation.JsonProperty
import java.util.*

class OAuthToken(
    @field:JsonProperty(value = "access_token")
    val accessToken: String? = null,

    @field:JsonProperty(value ="refresh_token")
    val refreshToken: String? = null,

    val scope: String? = null,

    @field:JsonProperty(value = "token_type")
    val tokenType: String? = null,

    @field:JsonProperty(value = "expires_in")
    val expiresIn: Long = 0L,

    @field:JsonProperty(value = "refresh_expires_in")
    val refreshExpiresIn: Long = 0L
) {

    fun isValid(): Boolean {
        val now = Date().time / 1000
        return accessToken != null && expiresIn > now
    }

    fun getAuthorizationToken(): String = "$tokenType $accessToken"
}
