package pl.zzpj.solid.srp.book.solution;

import java.util.Map;

public class BookPrinter {
    public void printCurrentPage(Book book) {
        System.out.println(book.getCurrentPageContents());
    }

    public String printAllPages(Book book) {
        Map<Integer, String> pages = book.getPages();
        String allPages = new String();
        for (Map.Entry<Integer, String> page : pages.entrySet()) {
            allPages += (page.getKey() + " " + page.getValue());
        }
        return allPages;
    }
}