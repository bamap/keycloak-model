package ir.bamap.blu.adapter.keycloak.model

import java.util.*

class UserRepresentation(
    val id: UUID? = null,
    val username: String? = null,
    val firstName: String? = null,
    val lastName: String? = null,
    val email: String? = null,
    val emailVerified: Boolean? = null,
    val enabled: Boolean? = null,
    val createdTimestamp: Long? = null,
    val attributes: UserAttributes = UserAttributes()
) {
}