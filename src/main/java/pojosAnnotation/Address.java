package pojosAnnotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * Created by user on 05.05.2016.
 */
@Service("addressA")
public class Address implements IAddress {

    @Value("1")
    private Long id;

    @Value("Mira")
    private String street;

    @Value("Minsk")
    private String city;

    @Value("Belarus")
    private String coutnry;

    @Value("sam@lm.com")
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



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStreet() {
        return street;
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

    public String toString() {
        return street + "-" + city + "-" + coutnry + "-" + email;
    }

    public String getAddress() {
        System.out.println("street");
        return street;
    }
}
