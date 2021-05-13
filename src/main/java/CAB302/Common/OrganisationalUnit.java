package CAB302.Common;

import org.hibernate.SessionFactory;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "OrganisationalUnit")
public class OrganisationalUnit extends BaseObject {

    @Column(name = "name")
    private String unitName;

    @Column(name = "name")
    public String getUnitName() { return this.unitName; }
    public void setUnitName(String unitName) { this.unitName = unitName; }

    @Column(name = "credit")
    private int availableCredit;

    @Column(name = "credit")
    public int getAvailableCredit() { return this.availableCredit; }
    public void setAvailableCredit(int availableCredit) { this.availableCredit = availableCredit; }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "organisationalUnit")
    private List<User> users = new ArrayList<User>();

    public OrganisationalUnit() { }
}