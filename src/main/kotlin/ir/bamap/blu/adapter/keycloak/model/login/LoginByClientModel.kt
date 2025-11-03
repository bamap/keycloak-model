package ir.bamap.blu.adapter.keycloak.model.login

import ir.bamap.blu.adapter.keycloak.model.enums.GrantType

class LoginByClientModel(
    val clientId: String = "",
    val clientSecret: String = "",
) : LoginModel {
    val grantType: GrantType = GrantType.client_credentials

    override fun getParameters(): Map<String, Any> {
        return mapOf(
            "grant_type" to grantType,
            "client_id" to clientId,
            "client_secret" to clientSecret
        )
    }
}