package spring.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import spring.dao.AbstractDao;
import spring.dao.MovieDao;
import spring.model.Movie;

@Repository
public class MovieDaoImpl extends AbstractDao<Movie> implements MovieDao {
    public MovieDaoImpl(SessionFactory factory) {
        super(factory, Movie.class);
    }
}
