import java.util.HashMap;
import java.util.ResourceBundle;

public class Principal {

    private static Principal manager;
    //HashMap<String,String> dataES;
    HashMap<String, ResourceBundle> data;

    private Principal(){
        this.data= new HashMap <String, ResourceBundle>();
        //this.dataES.put("l1","hola");
        ResourceBundle ca = ResourceBundle.getBundle("ca");
        ResourceBundle es = ResourceBundle.getBundle("es");
        ResourceBundle en = ResourceBundle.getBundle("en");
        this.data.put("es",es);
        this.data.put("ca",ca);
        this.data.put("en",en);
    }

    public static Principal getInstance(){
        if(manager == null) manager= new Principal();
        return manager;
    }
    public String getText(String idioma, String key){
        String result = null;
        result= this.data.get(idioma).getString(key);

        return result;

    }
    public static void main (String[] args){
        String msg1= Principal.getInstance().getText("ca","l1");
        String msg2= Principal.getInstance().getText("es","l1");
        String msg3= Principal.getInstance().getText("en", "l1");
        String msg4= Principal.getInstance().getText("ca","l2");
        String msg5= Principal.getInstance().getText("es","l2");
        String msg6= Principal.getInstance().getText("en", "l2");

        System.out.println(msg1);
        System.out.println(msg2);
        System.out.println(msg3);
        System.out.println(msg4);
        System.out.println(msg5);
        System.out.println(msg6);



    }




}
