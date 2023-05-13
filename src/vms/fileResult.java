package vms;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Vector;

public class fileResult extends fileManagement{
    private Vector<Vector> tableData;
    private String fileName;
   
    public fileResult(Vector<Vector> tableData, String fileName){
        this.tableData = tableData;
        this.fileName = fileName;
    }
    
    private void createFile(String name){
        try{
            FileWriter fw = new FileWriter(name);
            String str = "";
            fw.write(str);
            fw.close();
        }
        catch(IOException e){}
    }
    
    @Override
    public void saveFile(){
        String name = "VotingResult/" + this.fileName + "_result.txt";
        createFile(name);
        try{
            FileWriter fw = new FileWriter(name);
            for(int i = 0; i < this.tableData.size(); i++){
                Vector row = this.tableData.get(i);
                fw.append("Candidate Title: " + row.get(0).toString() + "\nTotal Voter: " + row.get(1).toString() + "\n\n\n");
            }
            fw.close();
        }
        catch(IOException e){}
    }
}
