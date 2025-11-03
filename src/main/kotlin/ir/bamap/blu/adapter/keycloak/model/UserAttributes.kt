package ir.bamap.blu.adapter.keycloak.model

class UserAttributes : HashMap<String, MutableSet<Any?>>() {
    fun addValue(key: String, value: Any?) {
        val values = this.get(key)
        if (values != null) {
            values.add(value)
            return
        }

        this[key] = mutableSetOf(value)
    }

    fun getFirstValueOrNull(key: String?): Any? {
        val values = this[key] ?: return null

        return values.stream().findFirst().orElse(null)
    }

    fun getFirstValueOrDefault(key: String?, defaultValue: Any?): Any? {
        val value = getFirstValueOrNull(key)
        if (value != null) return value

        return defaultValue
    }

    fun getFirstValueAsStringOrNull(key: String?): String? {
        val value = getFirstValueOrNull(key) ?: return null

        return value.toString()
    }
}