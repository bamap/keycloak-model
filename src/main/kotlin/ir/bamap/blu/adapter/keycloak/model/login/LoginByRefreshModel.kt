package ir.bamap.blu.adapter.keycloak.model.login

import ir.bamap.blu.adapter.keycloak.model.enums.GrantType

class LoginByRefreshModel(
    val clientId: String = "",
    val clientSecret: String = "",
    val refreshToken: String = "",
) : LoginModel {

    val grantType: GrantType = GrantType.refresh_token

    override fun getParameters(): Map<String, Any> {
        return mapOf(
            "grant_type" to grantType,
            "client_id" to clientId,
            "client_secret" to clientSecret,
            "refresh_token" to refreshToken
        )
    }
}