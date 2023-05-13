package vms;

public class election {
    private String electionName;
    private boolean status;
    
    public election(String electionName, boolean status){
        this.electionName = electionName;
        this.status = status;
    }
    
    public String getElectionName(){
        return this.electionName;
    }
    
    public boolean getStatus(){
        return this.status;
    }
    
    public boolean closeElection(){
        boolean errorCode = false;//
        if(errorCode == this.status){
            this.status = !this.status;
            errorCode = this.status;
        }
        return errorCode;
    }
    
    public boolean isSameElectionName(String electionName){
        return electionName.equals(this.electionName);
    }
    
    public boolean isEmptyElectionName(){
        return this.electionName.isEmpty();
    }
}
