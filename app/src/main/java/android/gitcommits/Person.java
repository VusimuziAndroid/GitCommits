package android.gitcommits;

/**
 * Created by ABVN237 on 9/6/2016.
 */
public class Person {
    private String name;
    private String country;
    private String twitter;

    Person(String name,String country,String twitter){
        this.name=name;
        this.country=country;
        this.twitter=twitter;
    }
    public String getName(){
        return this.name;
    }
    public String getCountry(){
        return this.country;
    }
    public String getTwitter(){
        return this.twitter;
    }
}
