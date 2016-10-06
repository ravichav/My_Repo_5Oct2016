package com.capgemini.test;

public class Score implements Comparable<Score> {
 private int wins; 
 private int losses;
 
 public Score(int w, int l) { wins = w; losses = l; }
 
 public int getWins() { return wins; }
 
 public int getLosses() { return losses; }
 
 public String toString() {
 return "<" + wins + ","+losses + ">";
 }
 
@Override
public int compareTo(Score o) {
	// TODO Auto-generated method stub
	if(this.wins == o.wins){
		return 0;
	}
	
	return 1;
}
 
 // insert code here
 }

