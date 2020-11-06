/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119081.latihan32.daftarfilm;

/**
 *
 * @author Elza Abiezal
 * NAMA     : Muhammad Elza Abiezal
 * KELAS    : IF2
 * NIM      : 10119081
 * Deskripsi: Daftar Film
 */
public class Film {
 String filmName;
    String filmGenre;
    Double filmRating;
    int filmDuration;
    
    public void nowPlaying () {
        System.out.println("Judul Film :" + filmName);
        System.out.println("Genre Film :" + filmGenre);
        System.out.println("Rating Film :" + filmRating);
        System.out.println("Duration Film :" + filmDuration + "Menit");
        System.out.println();
    }
}
