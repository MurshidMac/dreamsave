package com.example.dreamsave.repository.Impl

import com.example.dreamsave.db.viewmodels.models.Movie
import com.example.dreamsave.db.viewmodels.models.Movies
import com.example.dreamsave.db.viewmodels.models.Rating
import com.example.dreamsave.service.MovieApi
import org.json.JSONObject
import java.io.BufferedInputStream
import java.io.BufferedReader
import java.net.URL
import java.net.URLConnection

class MoviesImpl: MovieApi{
    override suspend fun getMovies(): Movies {

        val url = URL("http://www.omdbapi.com/?i=tt3896198&apikey=a8bbdd85")
        val connection:URLConnection = url.openConnection()
        connection.connect()

        val bufferedInputStream = BufferedInputStream(connection.getInputStream())
        val bufferedreader:BufferedReader = bufferedInputStream.bufferedReader()

        val stringBuffer = StringBuffer()
        for (line:String in bufferedreader.readLines()){
            stringBuffer.append(line)
        }

        bufferedreader.close()

        val fullJson = stringBuffer.toString()

        val jsonObjectMovies = JSONObject(fullJson)

        val jsonTitle = jsonObjectMovies.getString("Title")
        val jsonYear = jsonObjectMovies.getString("Year")
        val jsonRated = jsonObjectMovies.getString("Rated")
        val jsonReleased = jsonObjectMovies.getString("Released")
        val jsonRuntime = jsonObjectMovies.getString("Runtime")
        val jsonGenre = jsonObjectMovies.getString("Genre")
        val jsonDirector = jsonObjectMovies.getString("Director")
        val jsonWriter = jsonObjectMovies.getString("Writer")
        val jsonActors = jsonObjectMovies.getString("Actors")
        val jsonPlot = jsonObjectMovies.getString("Plot")
        val jsonLanguage = jsonObjectMovies.getString("Language")
        val jsonCountry = jsonObjectMovies.getString("Country")
        val jsonAwards = jsonObjectMovies.getString("Awards")
        val jsonPoster = jsonObjectMovies.getString("Poster")
        val jsonRatingArray = jsonObjectMovies.getJSONArray("Ratings");
        val jsonRating = jsonRatingArray.getJSONObject(0)
        val jsonMetascore = jsonObjectMovies.getString("Metascore")
        val imdbRating = jsonObjectMovies.getString("imdbRating")
        val imdbVotes = jsonObjectMovies.getString("imdbVotes")
        val imdbID = jsonObjectMovies.getString("imdbID")
        val Type = jsonObjectMovies.getString("Type")
        val DVD = jsonObjectMovies.getString("DVD")
        val BoxOffice = jsonObjectMovies.getString("BoxOffice")
        val Production = jsonObjectMovies.getString("Production")
        val Website = jsonObjectMovies.getString("Website")
        val Response = jsonObjectMovies.getString("Response")


        return Movies(listOf(
            Movie(jsonTitle,
                jsonYear,
                jsonRated,
                jsonReleased,
                jsonRuntime,
                jsonGenre,
                jsonDirector,
                jsonWriter,
                jsonActors,
                jsonPlot,
                jsonLanguage,
                jsonCountry,
                jsonAwards,
                jsonPoster,
                listOf(Rating(jsonRating.getString("Source"),jsonRating.getString("Value"))),
                jsonMetascore,
                imdbRating,
                imdbVotes,
                imdbID,
                Type,
                DVD,
                BoxOffice,
                Production,
                Website,
                Response
            )
        ))



//        return Movies(listOf(
//            Movie("Guardians of the Galaxy Vol. 2",
//                 "2017",
//                     "PG-13",
//                    "05 May 2017",
//                     "136 min",
//                     "Action, Adventure, Comedy, Sci-Fi",
//                     "James Gunn",
//                    "James Gunn, Dan Abnett (based on the Marvel comics by), Andy Lanning (based on the Marvel comics by), Steve Englehart (Star-Lord created by), Steve Gan (Star-Lord created by), Jim Starlin (Gamora and Drax created by), Stan Lee (Groot created by), Larry Lieber (Groot created by), Jack Kirby (Groot created by), Bill Mantlo (Rocket Raccoon created by), Keith Giffen (Rocket Raccoon created by), Steve Gerber (Howard the Duck created by), Val Mayerik (Howard the Duck created by)",
//                    "Chris Pratt, Zoe Saldana, Dave Bautista, Vin Diesel",
//                    "The Guardians struggle to keep together as a team while dealing with their personal family issues, notably Star-Lord's encounter with his father the ambitious celestial being Ego.",
//                     "English",
//                     "USA",
//                    "Nominated for 1 Oscar. Another 15 wins & 57 nominations.",
//                     "https://m.media-amazon.com/images/M/MV5BNjM0NTc0NzItM2FlYS00YzEwLWE0YmUtNTA2ZWIzODc2OTgxXkEyXkFqcGdeQXVyNTgwNzIyNzg@._V1_SX300.jpg",
//                listOf(Rating("Metacritic","67/100")),
//                     "67",
//                     "7.6",
//                     "583,183",
//                     "tt3896198",
//                     "movie",
//                    "10 Jul 2017",
//                     "$389,813,101",
//                     "Marvel Studios, Walt Disney Pictures",
//                     "N/A",
//                     "True"
//            )
//        ))
    }

}