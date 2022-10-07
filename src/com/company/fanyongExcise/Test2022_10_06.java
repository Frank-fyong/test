package com.company.fanyongExcise;

import javax.sql.DataSource;
import java.awt.print.Book;
import java.sql.Connection;

public class Test2022_10_06 {
    public static void main(String[] args) {

    }

}

public class BookService {
    private HikariConfig config = new HikariConfig();
    private DataSource dataSource = new HikariDataSource(config);

    public Book getBook(long bookId) {
        try (Connection conn = dataSource.getConnection()) {
            ...
            return book;
        }
    }
}