/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2;

/**
 *
 * @author Top Gun Maverick
 */
public class Info {
    private String Subject, Rate, Ranking;
    private double percentgk, percentck,dgk,dck,mark, mark1;
    private int stc;
    public Info() {
    }

    public Info(String Subject, String Rate, String Ranking, double percentgk, double percentck, double dgk, double dck, double mark, double mark1, int stc) {
        this.Subject = Subject;
        this.Rate = Rate;
        this.Ranking = Ranking;
        this.percentgk = percentgk;
        this.percentck = percentck;
        this.dgk = dgk;
        this.dck = dck;
        this.mark = mark;
        this.mark1 = mark1;
        this.stc = stc;
    }

    public String getSubject() {
        return Subject;
    }

    public String getRate() {
        return Rate;
    }

    public String getRanking() {
        return Ranking;
    }

    public double getPercentgk() {
        return percentgk;
    }

    public double getPercentck() {
        return percentck;
    }

    public double getDgk() {
        return dgk;
    }

    public double getDck() {
        return dck;
    }

    public double getMark() {
        return mark;
    }

    public double getMark1() {
        return mark1;
    }

    public int getStc() {
        return stc;
    }
    
    
}
