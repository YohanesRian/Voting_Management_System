package vms;

public class electionCandidate extends candidate{
    private int sum;
    
    public electionCandidate(String electionName, String title, String content, int sum) {
        super(electionName, title, content);
        this.sum = sum;
    }
    
    public int getSum(){
        return this.sum;
    }
    
    public void addSum(){
        this.sum = this.sum + 1;
    }
}
