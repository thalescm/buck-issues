package machado.thales.app

/**
 * Created by thalesmachado on 12/21/17.
 */
data class Person(
        private val name: String,
        private val surname: String
) {

    fun fullName() = "$name $surname"
}
