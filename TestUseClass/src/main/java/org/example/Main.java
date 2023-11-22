package org.example;
class Scores{
    int id;
    double chanes;
    double english;
    double math;
    double society;
    double science;
    double sum;
    double avg;
    Scores(int id, double chanes, double english, double math, double society, double science) {
        this.id = id;
        this.chanes = chanes;
        this.english = english;
        this.math=math;
        this.society=society;
        this.science=science;
        sum = chanes + english + math + society + science;
        avg = sum/5;
    }
    void show(){
        System.out.println(id+"\t\t"+chanes+"\t"+english+"\t"+math+"\t"+society+"\t"+science+"\t"+sum+"\t"+avg);
    }
}
public class Main {
    public static void main(String[] args) {
        String[] fieldname = {"座號" , "國文" , "英文" , "數學" , "社會" , "自然","總和","平均"};
        double[][] scores = {{1,71.5,94,32,40,66},
                {2,100,98,90,92.5,88},
                {3,85,100,92,77.5,84},
                {4,95,96,86,87.5,82},
                {5,44.5,90,52,40,52},
                {6,91.5,96,96,92.5,92},
                {7,88,94,84,95,82},
                {8,73.5,90,54,57.5,72},
                {9,56.5,38,40,25,50},
                {10,78,82,78,62.5,72}};

        Scores[] std = new Scores[scores.length];

        for (int i=0;i<scores.length;i++) {
            std[i] = new Scores((int) scores[i][0], scores[i][1], scores[i][2], scores[i][3], scores[i][4], scores[i][5]);
        }

        for (int i=0;i<fieldname.length;i++){
            System.out.print(fieldname[i] + "\t"+"\t");
        }
        System.out.println();
        for (Scores s: std){
            s.show();
        }
    }
}
