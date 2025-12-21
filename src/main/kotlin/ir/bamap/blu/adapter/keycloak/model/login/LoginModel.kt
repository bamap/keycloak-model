package ir.bamap.blu.adapter.keycloak.model.login

import ir.bamap.blu.adapter.keycloak.model.enums.GrantType

sealed class LoginModel(
    open val clientId: String = "",
    open val clientSecret: String = "",
    val grantType: GrantType,
) {

    open fun getParameters(): Map<String, Any> {
        return mapOf(
            "grant_type" to grantType,
            "client_id" to clientId,
            "client_secret" to clientSecret
        )
    }
}