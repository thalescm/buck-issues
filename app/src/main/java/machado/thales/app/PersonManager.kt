package machado.thales.app

/**
 * Created by thalesmachado on 12/21/17.
 */

interface PersonManager {

    fun login(): Person

    companion object {

        private var singleton_instance: PersonManager? = null

        fun getInstance(): PersonManager {
            return singleton_instance ?:
                    PersonManagerImpl().apply {
                        singleton_instance = this
                    }
        }

        fun setInstance(instace: PersonManager?) {
            singleton_instance = instace
        }
    }
}

open class PersonManagerImpl : PersonManager {

    override fun login(): Person {
        // go to the server and login...
        return Person("Thales", "Machado")
    }
}
