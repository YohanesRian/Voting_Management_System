package vms;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class fileAdmin extends fileManagement{
    String name;
    String uname;
    String pass;
    
    public fileAdmin(){
    }
    
    public fileAdmin(String name, String uname, String pass){
        this.name = name;
        this.uname = uname;
        this.pass = pass;
    }
    
    @Override
    public void saveFile(){
        try{
            FileOutputStream file = new FileOutputStream("database/Admin.bin");
            ObjectOutputStream output = new ObjectOutputStream(file);
            
            ArrayList<String> t = new ArrayList<>();
            t.add(this.name);
            t.add(this.uname);
            t.add(this.pass);
            output.writeObject(t);
            
            output.close();
            file.close();
        }
        catch(IOException e){}
    }
    
    public user getObj(){
        user x = new user("", "", "");
        try{
            FileInputStream file = new FileInputStream("database/Admin.bin");
            ObjectInputStream input = new ObjectInputStream(file);
            
            ArrayList<String> t = (ArrayList<String>)input.readObject();
            
            input.close();
            file.close();
            x = new user(t.get(0), t.get(1), t.get(2));
            
        }
        catch(Exception ex){}
        return x;
    }
}
