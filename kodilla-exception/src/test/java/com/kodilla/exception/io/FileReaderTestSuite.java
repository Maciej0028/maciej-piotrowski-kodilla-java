package com.kodilla.exception.io;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FileReaderTestSuite {
//    @Test
//    void testReadFile() {
//        //Given
//        FileReader fileReader = new FileReader();
//        //When & then
//        assertDoesNotThrow(() -> fileReader.readFile());
//    }

    @Test
    void readFileByName() {
        //Given
        FileReader fileReader = new FileReader();
        //When & Then
        assertAll(
                () -> assertThrows(FileReaderException.class, () -> fileReader.readFile("nie-ma-takiego-pliku.txt")),
                () -> assertThrows(FileReaderException.class, () -> fileReader.readFile(null)),
                () -> assertDoesNotThrow(() -> fileReader.readFile("names.txt"))
        );
    }
}