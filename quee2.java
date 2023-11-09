// Define an interface for describing countries
interface CountryDescription {
    void describeCountry();
}

// Create a base Country class that all specific country classes will extend
class Country implements CountryDescription {
    protected String name;
    protected String capital;
    protected int population;

    public Country(String name, String capital, int population) {
        this.name = name;
        this.capital = capital;
        this.population = population;
    }

    public void describeCountry() {
        System.out.println("Country: " + name);
        System.out.println("Capital: " + capital);
        System.out.println("Population: " + population + " million");
    }
}

// Create specific country classes that extend the base Country class
class USA extends Country {
    public USA() {
        super("United States of America", "Washington, D.C.", 331);
    }
}

class France extends Country {
    public France() {
        super("France", "Paris", 67);
    }
}

// You can create classes for other countries in a similar way

class CountryDemo {
    public static void main(String[] args) {
        CountryDescription usa = new USA();
        CountryDescription france = new France();

        usa.describeCountry();
        france.describeCountry();
    }
}