package com.payall.hibernate;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "accounts", schema = "payall", catalog = "")
public class AccountsEntity {
    private int idaccount;
    private String cardnumber;
    private String ownername;
    private String ownersurname;
    private int securecode;
    private double totalsum;
    private int iduser;
    private Date expdate;

    @Id
    @Column(name = "idaccount")
    public int getIdaccount() {
        return idaccount;
    }

    public void setIdaccount(int idaccount) {
        this.idaccount = idaccount;
    }

    @Basic
    @Column(name = "cardnumber")
    public String getCardnumber() {
        return cardnumber;
    }

    public void setCardnumber(String cardnumber) {
        this.cardnumber = cardnumber;
    }

    @Basic
    @Column(name = "ownername")
    public String getOwnername() {
        return ownername;
    }

    public void setOwnername(String ownername) {
        this.ownername = ownername;
    }

    @Basic
    @Column(name = "ownersurname")
    public String getOwnersurname() {
        return ownersurname;
    }

    public void setOwnersurname(String ownersurname) {
        this.ownersurname = ownersurname;
    }

    @Basic
    @Column(name = "securecode")
    public int getSecurecode() {
        return securecode;
    }

    public void setSecurecode(int securecode) {
        this.securecode = securecode;
    }

    @Basic
    @Column(name = "totalsum")
    public double getTotalsum() {
        return totalsum;
    }

    public void setTotalsum(double totalsum) {
        this.totalsum = totalsum;
    }

    @Basic
    @Column(name = "iduser")
    public int getIduser() {
        return iduser;
    }

    public void setIduser(int iduser) {
        this.iduser = iduser;
    }

    @Basic
    @Column(name = "expdate")
    public Date getExpdate() {
        return expdate;
    }

    public void setExpdate(Date expdate) {
        this.expdate = expdate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AccountsEntity that = (AccountsEntity) o;

        if (idaccount != that.idaccount) return false;
        if (securecode != that.securecode) return false;
        if (Double.compare(that.totalsum, totalsum) != 0) return false;
        if (iduser != that.iduser) return false;
        if (cardnumber != null ? !cardnumber.equals(that.cardnumber) : that.cardnumber != null) return false;
        if (ownername != null ? !ownername.equals(that.ownername) : that.ownername != null) return false;
        if (ownersurname != null ? !ownersurname.equals(that.ownersurname) : that.ownersurname != null) return false;
        if (expdate != null ? !expdate.equals(that.expdate) : that.expdate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = idaccount;
        result = 31 * result + (cardnumber != null ? cardnumber.hashCode() : 0);
        result = 31 * result + (ownername != null ? ownername.hashCode() : 0);
        result = 31 * result + (ownersurname != null ? ownersurname.hashCode() : 0);
        result = 31 * result + securecode;
        temp = Double.doubleToLongBits(totalsum);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + iduser;
        result = 31 * result + (expdate != null ? expdate.hashCode() : 0);
        return result;
    }
}
