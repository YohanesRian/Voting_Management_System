package vms;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Vector;

public class fileManagement {
    public Vector<Vector> tableData;
    protected void saveFile(){
        try{
            FileOutputStream file = new FileOutputStream("file.bin");
            ObjectOutputStream output = new ObjectOutputStream(file);
            
            output.writeObject(tableData);
            
            output.close();
            file.close();
        }
        catch(Exception ex){}
    }
    
    public Vector<Vector> recovery(){
        try{
            FileInputStream file = new FileInputStream("file.bin");
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
