package com.felipepossari.motorcyclestore.application.entity

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "users")
data class UserEntity(
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        val id: Long?,
        val username: String = "",
        val password: String = ""
) {
}