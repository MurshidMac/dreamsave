package com.example.dreamsave.db.viewmodels.models

data class Movies(
    val Movies: List<Movie>
)

data class Movie(
    val Title: String,
    val Year:String,
    val Rated:String,
    val Released: String,
    val Runtime: String,
    val Genre: String,
    val Director: String,
    val Writer: String,
    val Actors: String,
    val Plot: String,
    val Language: String,
    val Country: String,
    val Awards: String,
    val Poster: String,
    val Ratings: List<Rating>,
    val Metascore: String,
    val imdbRating: String,
    val imdbVotes: String,
    val imdbID: String,
    val Type: String,
    val DVD: String,
    val BoxOffice: String,
    val Production: String,
    val Website: String,
    val Response: String
)

data class Rating(
    val Source: String,
    val Value: String,
)


//{
//    "Title": "Guardians of the Galaxy Vol. 2",
//    "Year": "2017",
//    "Rated": "PG-13",
//    "Released": "05 May 2017",
//    "Runtime": "136 min",
//    "Genre": "Action, Adventure, Comedy, Sci-Fi",
//    "Director": "James Gunn",
//    "Writer": "James Gunn, Dan Abnett (based on the Marvel comics by), Andy Lanning (based on the Marvel comics by), Steve Englehart (Star-Lord created by), Steve Gan (Star-Lord created by), Jim Starlin (Gamora and Drax created by), Stan Lee (Groot created by), Larry Lieber (Groot created by), Jack Kirby (Groot created by), Bill Mantlo (Rocket Raccoon created by), Keith Giffen (Rocket Raccoon created by), Steve Gerber (Howard the Duck created by), Val Mayerik (Howard the Duck created by)",
//    "Actors": "Chris Pratt, Zoe Saldana, Dave Bautista, Vin Diesel",
//    "Plot": "The Guardians struggle to keep together as a team while dealing with their personal family issues, notably Star-Lord's encounter with his father the ambitious celestial being Ego.",
//    "Language": "English",
//    "Country": "USA",
//    "Awards": "Nominated for 1 Oscar. Another 15 wins & 57 nominations.",
//    "Poster": "https://m.media-amazon.com/images/M/MV5BNjM0NTc0NzItM2FlYS00YzEwLWE0YmUtNTA2ZWIzODc2OTgxXkEyXkFqcGdeQXVyNTgwNzIyNzg@._V1_SX300.jpg",
//    "Ratings": [
//    {
//        "Source": "Internet Movie Database",
//        "Value": "7.6/10"
//    },
//    {
//        "Source": "Rotten Tomatoes",
//        "Value": "85%"
//    },
//    {
//        "Source": "Metacritic",
//        "Value": "67/100"
//    }
//    ],
//    "Metascore": "67",
//    "imdbRating": "7.6",
//    "imdbVotes": "583,183",
//    "imdbID": "tt3896198",
//    "Type": "movie",
//    "DVD": "10 Jul 2017",
//    "BoxOffice": "$389,813,101",
//    "Production": "Marvel Studios, Walt Disney Pictures",
//    "Website": "N/A",
//    "Response": "True"
//}