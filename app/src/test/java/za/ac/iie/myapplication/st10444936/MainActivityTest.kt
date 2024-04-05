package za.ac.iie.myapplication.st10444936

import org.junit.Test
import org.junit.Assert.*

class MainActivityTest {

    @Test
    fun testwhenstatement() {
        //Test the when statement
        val result = when (30) {

            30 -> "Steve Biko, A South African anti-apartheid activist who was the leader of Black Consciousness Movement in the late 1960s from South African Students Organization."
            39 -> "Malcom - X, A prominent figure in the Nation of Islam and leader of the Black Power Movement that emerged in the 1960s."
            57 -> "Stokely Carmichael, A U.S Civil Rights activist who in the 1960s came up with the slogan “Black Power” from Black Nationalism."
            else -> "Nobody died at this age"
        }

        assertEquals("Nobody died at this age", result)
    }
}

