package machado.thales.app

import com.nubank.android.common.http.auth.MockPerson
import org.junit.Test
import kotlin.test.assertEquals

/**
 * Created by thalesmachado on 12/21/17.
 */
class PersonManagerTest {

    @Test
    fun testPersonManager_LoginAsThales() {
        val manager = PersonManager.getInstance()
        val expected = MockPerson.getInstanceForPersonName("thales")
        assertEquals(expected, manager.login())
    }
}
