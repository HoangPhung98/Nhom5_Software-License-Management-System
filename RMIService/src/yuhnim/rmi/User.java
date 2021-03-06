package yuhnim.rmi;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

public class User implements Serializable{
    private static final long serialVersionUID = 227L;
    private String name;
    private ArrayList<LicenceData> licences;

    public User() {
    }

    public User(String name, ArrayList<LicenceData> licences) {
        this.name = name;
        this.licences = licences;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<LicenceData> getLicences() {
        return this.licences;
    }

    public void setLicences(ArrayList<LicenceData> licences) {
        this.licences = licences;
    }

    public User name(String name) {
        this.name = name;
        return this;
    }

    public User licences(ArrayList<LicenceData> licences) {
        this.licences = licences;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof User)) {
            return false;
        }
        User User = (User) o;
        return Objects.equals(name, User.name) && Objects.equals(licences, User.licences);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, licences);
    }

    @Override
    public String toString() {
        return "{" + " name='" + getName() + "'" + ", licences='" + getLicences() + "'" + "}";
    }

}