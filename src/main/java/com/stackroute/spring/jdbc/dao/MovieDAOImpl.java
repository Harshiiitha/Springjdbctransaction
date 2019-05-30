package com.stackroute.spring.jdbc.dao;

import javax.sql.DataSource;

import com.stackroute.spring.jdbc.model.Movie;
import org.springframework.jdbc.core.JdbcTemplate;

public class MovieDAOImpl implements MovieDAO{

	private DataSource dataSource;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	public void create(Movie movie) {
		String queryMovie = "insert into Movie  values (?,?,?,?)";
		String queryActor= "insert into Actor values (?,?)";

		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

		jdbcTemplate.update(queryMovie, new Object[] {movie.getMovieId(),movie.getMovieName(),movie.getMovieReleaseYear(),movie.getMovieRating()});
		System.out.println("Inserted into Movie Table Successfully");
		jdbcTemplate.update(queryActor, new Object[] {(movie.getActor()).getId(), (movie.getActor()).getName()});
		System.out.println("Inserted into Actor Table Successfully");
	}

}
