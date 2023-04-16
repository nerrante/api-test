package io.github.manuelernesto.playerapi

import io.github.manuelernesto.playerapi.model.Player
import io.github.manuelernesto.playerapi.repository.PlayerRepository
import io.github.manuelernesto.playerapi.service.PlayerService
import io.mockk.every
import io.mockk.mockk
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.data.repository.findByIdOrNull

@SpringBootTest
class PlayerApiApplicationTests {
    lateinit var playerService: PlayerService
    lateinit var playerRepository: PlayerRepository

    @BeforeEach
    fun setup () {
        playerRepository = mockk()
        playerService = PlayerService(playerRepository)
    }
    @Test
    fun `Returns player`() {
        val player1 = buildPlayerEntity()
        val playerID: Long = 12345
        every { playerRepository.findByIdOrNull(playerID)
        } returns player1

        val result = playerService.getById(12345)
        assert(result.name == "John Q. Player")
        assert(result.age == 23)
        assert(result.nationality == "American")
    }

}

fun buildPlayerEntity(
    id: Long = 12345,
    name: String = "John Q. Player",
    age: Int = 23,
    nationality: String = "American"
) = Player(
    id,
    name,
    age,
    nationality
)