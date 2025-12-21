package ir.bamap.blu.adapter.keycloak.model.login

import ir.bamap.blu.adapter.keycloak.model.enums.GrantType

data class LoginByClientModel(
    override val clientId: String = "",
    override val clientSecret: String = "",
) : LoginModel(clientId, clientSecret, GrantType.client_credentials)