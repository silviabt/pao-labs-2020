package com.paolabs;

public class Exemplul1 {

    public static void main(String[] args) {
        // tip identificator
        // byte, short, int, long, float, double, char, boolean
        // String --- nu este primitiv

        byte q1; // declarare zona memorie
        // byte -> 256 ---> [-128, 127]
        q1 = 10; // pentru a da o valoare zonei de memorie se foloseste operatorul "="

        short s1 = 10;
        int i = 10; // 4 bytes
        long a = 10; // 8 bytes

        // Diferenta intre byte, short, int si long o reprezinta cantitatea de date

        int i2 = 054; // baza 8
        int i3 = 0XFF; // baza 16
        int i4 = 0xFF; // baza 16
        int i5 = 0b10110; // baza 2

        long b = 9999999999999L; // L = literal

        double d1 = 10.5;

        float f1 = 10.5F; // diferenta dintre double si float este de precizie (nr zecimale dupa virgula)
        float f2 = (float) 10.5; // In Java orice valoare cu virgula este considerata de tip double => folosim un literal (f,F) sau operatorul de conversie

        int f3 = (int) 10.5;

        boolean k1 = false;
        boolean k2 = true;
        // true, false = cuvinte cheie (keywords)

        char w1 = 'a'; // caracterele in Java se pun intre ghilimele simple ''
        char w2 = '\n';
        char w3 = '\u1011';

        int r1, r2, r3; // se pot declara mai multe zone de memorie cu virgula intre ele
        int r4, r5 = 10, r6;
    }
}
