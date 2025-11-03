package ir.bamap.blu.adapter.keycloak.model

import com.fasterxml.jackson.annotation.JsonAlias
import java.util.*

class OAuthToken(
    @field:JsonAlias(value = ["accessToken", "access_token"])
    val accessToken: String? = null,

    @field:JsonAlias(value = ["refreshToken", "refresh_token"])
    val refreshToken: String? = null,

    val scope: String? = null,

    @field:JsonAlias(value = ["tokenType", "token_type"])
    val tokenType: String? = null,

    @field:JsonAlias(value = ["expiresIn", "expires_in"])
    val expiresIn: Long = 0L,

    @field:JsonAlias(value = ["refreshExpiresIn", "refresh_expires_in"])
    val refreshExpiresIn: Long = 0L
) {

    fun isValid(): Boolean {
        val now = Date().time / 1000
        return accessToken != null && expiresIn > now
    }

    fun getAuthorizationToken(): String = "$tokenType $accessToken"
}
