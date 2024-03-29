/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package books.filters;

import loans.manager.Filter;
import books.LoanedBook;
import books.Person;

/**
 *
 * @author ssoch
 */
public class PersonFilter implements Filter<LoanedBook> {

    private final Person person;

    public PersonFilter(Person person) {
        this.person = person;
    }
    
    @Override
    public boolean isMeetingCriteria(LoanedBook loanedBookInfo) {
        if (person.equals(loanedBookInfo.getPerson())) {
            return true;
        }
        
        return false;
    }

    
}
