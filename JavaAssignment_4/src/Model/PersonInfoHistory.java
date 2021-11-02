/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author Krish
 */
public class PersonInfoHistory {

    private ArrayList<Person> personInfoHistory;

    public PersonInfoHistory() {

        this.personInfoHistory = new ArrayList<Person>();
    }

    public ArrayList<Person> getPersonInfoHistory() {
        return personInfoHistory;
    }

    public void setPersonList(ArrayList<Person> PersonInfoHistory) {
        this.personInfoHistory = PersonInfoHistory;
    }

    public Person addPerson() {

        PHouse housing = new PHouse();
        Person newPerson = new Person("", "", 0, 0, housing);
        personInfoHistory.add(newPerson);
        return newPerson;
    }

    public void remove(Person person) {
        personInfoHistory.remove(person);
    }

    public void deletePerson(Person p) {
        personInfoHistory.remove(p);

    }

    public void Update(int tableIndex, Person pi) {
        personInfoHistory.set(tableIndex, pi);
    }

}
