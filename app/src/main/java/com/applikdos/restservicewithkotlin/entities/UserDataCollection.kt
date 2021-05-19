package com.applikdos.restservicewithkotlin.entities

class UserDataCollection : ArrayList<UserDataCollectionItem>()

data class UserDataCollectionItem(
    val Actors: List<String>,
    val Director: String,
    val Genre: List<String>,
    val Languages: List<String>,
    val Plot: String,
    val Poster: Poster,
    val Ratings: List<Rating>,
    val Title: String,
    val Writer: List<String>,
    val Year: String
)

data class Poster(
    val Extension: String,
    val Uri: String
)

data class Rating(
    val Source: String,
    val Value: String
)
