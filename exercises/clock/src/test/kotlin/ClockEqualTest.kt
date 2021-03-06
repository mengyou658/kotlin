import org.junit.Ignore
import org.junit.Test
import kotlin.test.assertNotEquals
import kotlin.test.assertEquals

class ClockEqualTest {

    @Ignore
    @Test
    fun clocksWithSameTimeAreEqual() {
        assertEquals(Clock(15, 37), Clock(15, 37))
    }

    @Ignore
    @Test
    fun clocksAMinuteApartAreNotEqual() {
        assertNotEquals(Clock(15, 36), Clock(15, 37))
    }

    @Ignore
    @Test
    fun clocksAnHourApartAreNotEqual() {
        assertNotEquals(Clock(14, 37), Clock(15, 37))
    }

    @Ignore
    @Test
    fun clocksWithHourOverflow() {
        assertEquals(Clock(10, 37), Clock(34, 37))
    }

    @Ignore
    @Test
    fun clocksWithHourOverflowBySeveralDays() {
        assertEquals(Clock(3, 11), Clock(99, 11))
    }

    @Ignore
    @Test
    fun clocksWithNegateHour() {
        assertEquals(Clock(22, 40), Clock(-2, 40))
    }

    @Ignore
    @Test
    fun clocksWithNegativeHourThatWraps() {
        assertEquals(Clock(17, 3), Clock(-31, 3))
    }

    @Ignore
    @Test
    fun clocksWithNegativeHourThatWrapsMultipleTimes() {
        assertEquals(Clock(13, 49), Clock(-83, 49))
    }

    @Ignore
    @Test
    fun clocksWithMinuteOverflow() {
        assertEquals(Clock(0, 1), Clock(0, 1441))
    }

    @Ignore
    @Test
    fun clocksWithMinuteOverflowBySeveralDays() {
        assertEquals(Clock(2, 2), Clock(2, 4322))
    }

    @Ignore
    @Test
    fun clocksWithNegativeMinutes() {
        assertEquals(Clock(2, 40), Clock(3, -20))
    }

    @Ignore
    @Test
    fun clocksWithNegativeMinutesThatWraps() {
        assertEquals(Clock(4, 10), Clock(5, -1490))
    }

    @Ignore
    @Test
    fun clocksWithNegativeMinutesThatWrapsMultipleTimes() {
        assertEquals(Clock(6, 15), Clock(6, -4305))
    }

    @Ignore
    @Test
    fun clocksWithNegativeHoursAndMinutes() {
        assertEquals(Clock(7, 32), Clock(-12, -268))
    }

    @Ignore
    @Test
    fun clocksWithNegativeHoursAndMinutesThatWrap() {
        assertEquals(Clock(18, 7), Clock(-54, -11513))
    }

}
