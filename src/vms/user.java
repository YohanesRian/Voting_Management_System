package vms;

public class user<x, y, z> {
    private x name;
    private y uname;
    private z pass;
    
    public user(x name, y uname, z pass){
        this.name = name;
        this.uname = uname;
        this.pass = pass;
    }
    
    public x getName(){
        return this.name;
    }
    
    public y getUname(){
        return this.uname;
    }
    
    public z getPass(){
        return this.pass;
    }
    
    public boolean isSameName(x name){
        return name.equals(this.name);
    }
    
    public boolean isSameUname(y uInput){
        return uInput.equals(this.uname);
    }
    
    public boolean isSamePass(z uInput){
        return uInput.equals(this.pass);
    }
}
