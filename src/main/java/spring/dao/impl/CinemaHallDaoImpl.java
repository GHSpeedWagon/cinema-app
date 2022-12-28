package spring.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import spring.dao.AbstractDao;
import spring.dao.CinemaHallDao;
import spring.model.CinemaHall;

@Repository
public class CinemaHallDaoImpl extends AbstractDao<CinemaHall> implements CinemaHallDao {
    public CinemaHallDaoImpl(SessionFactory factory) {
        super(factory, CinemaHall.class);
    }
}
