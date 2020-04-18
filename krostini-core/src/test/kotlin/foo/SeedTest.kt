package foo

import com.natpryce.hamkrest.assertion.assertThat
import com.natpryce.hamkrest.equalTo
import org.http4k.core.Method
import org.http4k.core.Request
import org.junit.jupiter.api.Test

class SeedTest {
    @Test
    fun whatevs() {
        assertThat(Request(Method.GET, "").bodyString(), equalTo(""))
    }
}
