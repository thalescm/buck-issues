package machado.thales.core

import org.junit.Assert.assertEquals
import org.junit.Test

/**
 * Created by thalesmachado on 12/19/17.
 */
class InternalEventsTest {

    @Test
    fun testEventsAreEqual() {
        assertEquals(InternalEvents.EVENT1, InternalEvents.EVENT2)
    }

    @Test
    fun addition_isCorrect() {
        assertEquals(1 + 1, 2)
    }
}
