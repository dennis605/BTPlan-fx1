package model

import io.quarkus.hibernate.orm.panache.PanacheEntity

@Entity
class Person : PanacheEntity() {
}

annotation class Entity
