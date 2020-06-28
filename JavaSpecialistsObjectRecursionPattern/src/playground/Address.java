package playground;

public class Address {

    private final String street,suburb,zip,country;

    public Address(String street, String suburb, String zip, String country) {
        this.street = street;
        this.suburb = suburb;
        this.zip = zip;
        this.country = country;
    }

    @Override
    public String toString() {
        return String.format("Address{street=%s,suburb=%s,zip=%s,country=%s}",
                street,suburb,zip,country);
    }

    public StringBuilder append(StringBuilder sb){

        return sb.append("Address{street=").append(street)
                .append(",suburb=").append(suburb)
                .append(",zip=").append(zip)
                .append(",country=").append(country).append("}");
    }

}
