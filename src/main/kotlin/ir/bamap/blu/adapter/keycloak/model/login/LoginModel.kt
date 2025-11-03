package ir.bamap.blu.adapter.keycloak.model.login

sealed interface LoginModel {
    fun getParameters(): Map<String, Any>
}