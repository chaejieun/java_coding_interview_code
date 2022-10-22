package main.java.HanoiTowers.coding.challenge;

import java.awt.Point;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import main.java.jukebox.coding.challenge.Jukebox.CD;
import main.java.jukebox.coding.challenge.Jukebox.CDPlayer;
import main.java.jukebox.coding.challenge.Jukebox.Jukebox;
import main.java.jukebox.coding.challenge.Jukebox.Playlist;
import main.java.jukebox.coding.challenge.Jukebox.Song;
import main.java.jukebox.coding.challenge.User.User;


public class Main {
    public static void main(String[] args) {
    	  int n = 3;  // Number of disks

          // A - 원점(또는 원본) 막대
          // B - 중간(또는 보조) 막대
          // C - 대상(또는 목표) 막대
          Hanoi.moveDisks(n, 'A', 'C', 'B');
    }
}