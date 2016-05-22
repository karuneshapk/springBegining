package pojosInject;

import pojosAutowared.annotation.AutowaredAddress;

/**
 * Created by user on 05.05.2016.
 */
@AutowaredAddress
public class Address implements IAddress {
    private Long id;
    private String street;
    private String city;
    private String coutnry;
    private String email;

    public Address(Long id, String street, String city, String coutnry, String email) {
        this.id = id;
        this.street = street;
        this.city = city;
        this.coutnry = coutnry;
        this.email = email;
    }

    public Address() {
    }

    public String getStreet() {
        System.out.println("Street " + street);
        return street;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCoutnry() {
        return coutnry;
    }

    public void setCoutnry(String coutnry) {
        this.coutnry = coutnry;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
