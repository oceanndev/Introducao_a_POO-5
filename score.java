package entities;

public class score {
    public String name;
    public double score1;
    public double score2;
    public double score3;

    public double sumscore(){
        return score1 + score2 + score3;
    }
    public double missing(){
        if (sumscore()<60.0){
            return 60 - sumscore();
        }
        else{
            return 0.0;
        }
        }
}
