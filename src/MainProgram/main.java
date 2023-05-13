package MainProgram;

import vms.fileAdmin;
import vms.user;
import vmsGUI.loginFrame;

public class main {
    private static void createDefaultAdmin(){
        user<String, String, String> v = new user("iF&Sj_W0,xMp%5p51Vd&[9nGQY5E4@", "PrivateAdminElection1234567890", "Password_Admin1234567890");
        fileAdmin fa = new fileAdmin(v.getName(), v.getUname(), v.getPass());
        fa.saveFile();
    }
    
    public static void main(String[] args){
        fileAdmin fa = new fileAdmin();
        user<String, String, String> t = fa.getObj();
        if(t == null || t.getName().isEmpty() || t.getPass().isEmpty() || t.getUname().isEmpty()){
            createDefaultAdmin();
        }
        new loginFrame().setVisible(true);
    }
}
