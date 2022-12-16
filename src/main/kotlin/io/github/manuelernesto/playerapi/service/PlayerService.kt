package io.github.manuelernesto.playerapi.service

import io.github.manuelernesto.playerapi.model.Player
import io.github.manuelernesto.playerapi.repository.PlayerRepository
import org.springframework.data.repository.*
import org.springframework.http.HttpStatus
import org.springframework.stereotype.Service
import org.springframework.web.server.ResponseStatusException

@Service
class PlayerService (val repository: PlayerRepository) {

        fun getAll(): List<Player> = repository.findAll()

        fun getById(id: Long): Player = repository.findByIdOrNull(id) ?:
        throw ResponseStatusException(HttpStatus.NOT_FOUND)

        fun create(player: Player): Player = repository.save(player)

        fun remove(id: Long) {
            if (repository.existsById(id)) repository.deleteById(id)
            else throw ResponseStatusException(HttpStatus.NOT_FOUND)
        }

        fun update(id: Long, player: Player): Player {
            return if (repository.existsById(id)) {
                player.id = id
                repository.save(player)
            } else throw ResponseStatusException(HttpStatus.NOT_FOUND)
        }
    }