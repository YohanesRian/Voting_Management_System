package vms;

public class electionCount extends election{
    private int totalVoter;
    private int voted;
    
    public electionCount(String electionName, boolean status, int totalVoter, int voted) {
        super(electionName, status);
        this.totalVoter = totalVoter;
        this.voted = voted;
    }
    
    public int getTotalVoter(){
        return this.totalVoter;
    }
    
    public int getVoted(){
        return this.voted;
    }
    
    public void addTotalVoter(){
        this.totalVoter = this.totalVoter + 1;
    }
    
    public void addVoted(){
        this.voted = this.voted + 1;
    }
    
    public void subTotalVoter(){
        this.totalVoter = this.totalVoter - 1;
    }
}
