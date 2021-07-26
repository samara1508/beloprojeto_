package br.com.samara.beloprojeto;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

    @Test
    public void mainTest() {

        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        final String[] args = { "oi" };
        App.main(args);
        assertEquals("[oi]" + System.lineSeparator(), outContent.toString());
    }
}
