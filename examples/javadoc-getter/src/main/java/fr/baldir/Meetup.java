package fr.baldir;

public class Meetup {

    private String data;


    // tag::getter-javadoc[]
    /**
     * gets data <1>
     * @return data as string
     */
    public String getData() {
        return data;
    }
    // end::getter-javadoc[]

    public Meetup data(String data) {
        this.data = data;
        return this;
    }


}
