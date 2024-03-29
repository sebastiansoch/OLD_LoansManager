/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package books.filters;

import loans.manager.Filter;
import books.Book;
import books.LoanedBook;

/**
 *
 * @author ssoch
 */
public class BookFilter implements Filter<LoanedBook> {

    private final Book book;

    public BookFilter(Book book) {
        this.book = book;
    }

    @Override
    public boolean isMeetingCriteria(LoanedBook loanedBookInfo) {
        if (book.equals(loanedBookInfo.getBook())) {
            return true;
        }

        return false;
    }
}
