package ir.bamap.blu.adapter.keycloak.model.login

import ir.bamap.blu.adapter.keycloak.model.enums.GrantType

data class LoginByUserPassModel(
    override val clientId: String = "",
    override val clientSecret: String = "",
    val username: String = "",
    val password: String = ""
) : LoginModel(clientId, clientSecret, GrantType.password) {

    override fun getParameters(): Map<String, Any> {
        val params = super.getParameters().toMutableMap()
        params["username"] = username
        params["password"] = password
        return params
    }
}
