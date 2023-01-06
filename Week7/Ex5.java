package Week7;

import java.util.HashMap;

public class Ex5 {
    private HashMap<String,String>nickNames;
    public Ex5(){
         this.nickNames = new HashMap<String, String>();
    }

    public void nameToHas(String name, String nickName) {
        this.nickNames.put(name, nickName);
    }

    public void getNickName(String name) {
        System.out.println(this.nickNames.get(name));
    }

    public static void main(String[] args) {
        Ex5 create = new Ex5();
        create.nameToHas("Madis", "Mats");
        create.getNickName("Madis");
    }
}
