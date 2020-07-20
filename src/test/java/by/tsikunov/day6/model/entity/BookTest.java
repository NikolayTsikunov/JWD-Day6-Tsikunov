package by.tsikunov.day6.model.entity;

import by.tsikunov.day6.creator.BookCreator;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.*;

public class BookTest {

    @Test
    public void testTestToString() {
        List<String> list = new ArrayList<String>();
        list.add("Mama");
        System.out.println(list.add("Papa"));
        System.out.println(list.remove("YYYY"));
        Book book = new Book( "MMMM", list, 1999, 500);
        book.toString();
        //String str = null;
        //boolean is = str.isBlank();

        //BookCreator creator = new BookCreator();
        //list = creator.createListAuthors("Mama, Papa,, Tola");
    }
}