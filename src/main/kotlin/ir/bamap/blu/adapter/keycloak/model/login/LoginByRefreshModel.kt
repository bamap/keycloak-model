package ir.bamap.blu.adapter.keycloak.model.login

import ir.bamap.blu.adapter.keycloak.model.enums.GrantType

data class LoginByRefreshModel(
    override val clientId: String = "",
    override val clientSecret: String = "",
    val refreshToken: String = "",
) : LoginModel(clientId, clientSecret, GrantType.refresh_token) {

    override fun getParameters(): Map<String, Any> {
        val params = super.getParameters().toMutableMap()
        params["refresh_token"] = refreshToken
        return params
    }
}