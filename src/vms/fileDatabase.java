package vms;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Vector;

public class fileDatabase extends fileManagement{
    private Vector<Vector> tableData;
    private String fileName;
    
    public fileDatabase(String fileName){
        this.fileName = fileName;
    }
    
    public fileDatabase(Vector<Vector> tableData, String fileName){
        this.tableData = tableData;
        this.fileName = fileName;
    }
    
    @Override
    public void saveFile(){
        try{
            String name = "database/" + this.fileName + ".bin";
            FileOutputStream file = new FileOutputStream(name);
            ObjectOutputStream output = new ObjectOutputStream(file);
            
            output.writeObject(this.tableData);
            
            output.close();
            file.close();
        }
        catch(IOException e){}
    }
    
    @Override
    public Vector<Vector> recovery(){
        try{
            String name = "database/" + this.fileName + ".bin";
            FileInputStream file = new FileInputStream(name);
            ObjectInputStream input = new ObjectInputStream(file);
            
            Vector<Vector> temp = (Vector<Vector>)input.readObject();
            
            input.close();
            file.close();
            this.tableData = temp;
            
        }
        catch(Exception ex){}
        return this.tableData;
    }
}
