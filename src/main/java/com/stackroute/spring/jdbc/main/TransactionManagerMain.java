package com.stackroute.spring.jdbc.main;

import com.stackroute.spring.jdbc.model.Actor;
import com.stackroute.spring.jdbc.model.Movie;
import com.stackroute.spring.jdbc.service.MovieManagerImpl;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.stackroute.spring.jdbc.service.MovieManager;

public class TransactionManagerMain {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");

		MovieManager movieManager = ctx.getBean("movieManager" ,MovieManagerImpl.class);

		Movie movie = createDummyMovie();
		movieManager.createMovie(movie);

		ctx.close();
	}

	private static Movie createDummyMovie() {
	    Movie movie=new Movie();
		movie.setMovieId(109);
		movie.setMovieName("Kalank");
		movie.setMovieReleaseYear(2019);
		movie.setMovieRating(3.5f);
        Actor actor=new Actor();
		actor.setId(1);
		actor.setName("Varun");
		movie.setActor(actor);
		return movie;
	}

}
