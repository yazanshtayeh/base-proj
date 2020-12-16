package sample;

import java.sql.Date;

public class person {
    int ssn;
    int id;
    String name ;
    Date birthdate;
    Date expiredate;

    public person(int ssn, int id, String name, Date birthdate, Date expiredate) {
        this.ssn = ssn;
        this.id = id;
        this.name = name;
        this.birthdate = birthdate;
        this.expiredate = expiredate;
    }

    public int getSsn() {
        return ssn;
    }

    public void setSsn(int ssn) {
        this.ssn = ssn;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public Date getExpiredate() {
        return expiredate;
    }

    public void setExpiredate(Date expiredate) {
        this.expiredate = expiredate;
    }
}
