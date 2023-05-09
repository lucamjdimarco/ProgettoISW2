package models;

import java.util.Date;

public class TicketJira {

    private final String key;
    private final Date createdDate;
    private final Date resolvedDate;

    public TicketJira(String key, Date create, Date resolved) {
        this.key = key;
        this.createdDate = create;
        this.resolvedDate = resolved;

    }

    public String getKey() {
        return key;
    }

    public Date getCreated() {
        return createdDate;
    }

    public Date getResolved() {
        return resolvedDate;
    }




}
