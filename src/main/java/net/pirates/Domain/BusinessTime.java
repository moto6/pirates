package net.pirates.Domain;

import javax.persistence.*;

@Entity
public class BusinessTime {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(foreignKey = @ForeignKey(name = "fk_business_times"))
    private Store store;

    private Days day;
    private String open;
    private String close;

    public BusinessTime() {
    }

    public BusinessTime(Days day, String open, String close) {
        this.day = day;
        this.open = open;
        this.close = close;
    }

    public Days getDay() {
        return day;
    }

    public void setDay(Days day) {
        this.day = day;
    }

    public String getOpen() {
        return open;
    }

    public void setOpen(String open) {
        this.open = open;
    }

    public String getClose() {
        return close;
    }

    public void setClose(String close) {
        this.close = close;
    }
}
