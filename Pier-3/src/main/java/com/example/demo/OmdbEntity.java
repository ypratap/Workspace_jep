package com.example.demo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor

@JsonIgnoreProperties(ignoreUnknown = true)
public class OmdbEntity {

	private String Title;
	private String Year;
	private String Rated;
	private String Released;
	private String Runtime;
	private String Genre;
	private String Director;
	private String Writer;
	private String Actors;
	private String Plot;
	private String Language;
	private String Country;
	private String Awards;
	private String Poster;
	private Ratings[] ratings;
	private String Metascore;
	private String imdbRating;
	private String imdbVotes;
	private String imdbID;
	private String Type;
	private String totalSeasons;
	private String Response;

}
