package vms;

public class candidate{
    private String electionName;
    private String title;
    private String content;
    
    public candidate(String electionName, String title, String content){
        this.title = title;
        this.content = content;
        this.electionName = electionName;
    }
    
    public String getElectionName(){
        return this.electionName;
    }
    
    public String getTitle(){
        return this.title;
    }
    
    public String getContent(){
        return this.content;
    }
    
    public boolean isSameElectionName(String electionName){
        return electionName.equals(this.electionName);
    }
    
    public boolean isSameTitle(String title){
        return title.equals(this.title);
    }
    
    public boolean isSameContent(String content){
        return content.equals(this.content);
    }
    
    public boolean isEmptyElectionName(){
        return this.electionName.isEmpty();
    }
    
    public boolean isEmptyTitle(){
        return this.title.isEmpty();
    }
    
    public boolean isEmptyContent(){
        return this.content.isEmpty();
    }
}
