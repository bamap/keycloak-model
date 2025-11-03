package ir.bamap.blu.adapter.keycloak.model.login

import ir.bamap.blu.adapter.keycloak.model.enums.GrantType

class LoginByUserPassModel(
    val clientId: String = "",
    val clientSecret: String = "",
    val username: String = "",
    val password: String = ""
) : LoginModel {

    val grantType: GrantType = GrantType.password

    override fun getParameters(): Map<String, Any> {
        return mapOf(
            "grant_type" to grantType,
            "client_id" to clientId,
            "client_secret" to clientSecret,
            "username" to username,
            "password" to password,
        )
    }
}
