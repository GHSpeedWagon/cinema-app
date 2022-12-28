package spring.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import spring.dao.AbstractDao;
import spring.dao.TicketDao;
import spring.model.Ticket;

@Repository
public class TicketDaoImpl extends AbstractDao<Ticket> implements TicketDao {
    public TicketDaoImpl(SessionFactory factory) {
        super(factory, Ticket.class);
    }
}
