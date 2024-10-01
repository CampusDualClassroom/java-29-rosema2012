package com.campusdual.classroom;

import java.io.IOException;

public class Exercise29 {
    public static void main(String[] args) {
        try {
            throw new IOException("Exception throwed");
        } catch (IOException e) {
            System.out.println("Se ha capturado la IOException: " + e.getMessage());
        }

    }
}
