package vms;

public class electionManagement<x> extends election{
    private x voterName;
            
    public electionManagement(String electionName, x voterName, boolean status) {
        super(electionName, status);
        this.voterName = voterName;
    }
    
    public x getVoterName(){
        return this.voterName;
    }
    
    public boolean isSameVoterName(x name){
        return name.equals(this.voterName);
    }
}
