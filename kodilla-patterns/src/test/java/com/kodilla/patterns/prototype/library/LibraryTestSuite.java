package com.kodilla.patterns.prototype.library;

import org.junit.jupiter.api.Test;

import javax.xml.crypto.dsig.keyinfo.KeyValue;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class LibraryTestSuite {

    @Test
    void testGetBooks() {
        //Given
        Library library = new Library("Test Library");

        //When
        library.getBooks().add(new Book("Book1", "Holy Black",
                LocalDate.of(2000, 1, 1)));
        library.getBooks().add(new Book("Book2", "Jhon Smith",
                LocalDate.of(2000, 2, 2)));
        library.getBooks().add(new Book("Book3", "Rick Sanchez",
                LocalDate.of(2000, 3, 3)));
        library.getBooks().add(new Book("Book4", "Rebecca Yarros",
                LocalDate.of(2000, 4, 4)));

        Library swallowClonedLiblary = null;
        try {
            swallowClonedLiblary = library.shallowCopy();
            swallowClonedLiblary.setName("Copy1");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Copy2");

        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }
        assertEquals(4, library.getBooks().size());
        System.out.println(library.getBooks().size());

        library.getBooks().removeAll(library.getBooks());
        //Then

        assertEquals(0, library.getBooks().size());
        System.out.println(library.getBooks().size());

        assertEquals(0, swallowClonedLiblary.getBooks().size());
        System.out.println(swallowClonedLiblary.getBooks().size());

        assertEquals(4, deepClonedLibrary.getBooks().size());
        System.out.println(deepClonedLibrary.getBooks().size());

        assertEquals(library.getBooks(), swallowClonedLiblary.getBooks());
        assertNotEquals(library, deepClonedLibrary);
    }
}
