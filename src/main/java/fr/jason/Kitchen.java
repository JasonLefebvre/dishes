package fr.jason;

public interface Kitchen {

    void cook() throws StateException;

    void cut() throws StateException;
}
