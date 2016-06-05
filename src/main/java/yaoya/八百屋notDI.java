package yaoya;

import vegetables.ほうれん草;
import vegetables.キャベツ;
import vegetables.トマト;
import vegetables.大根;

/**
 * Created by midori on 2016/06/05.
 */
public class 八百屋notDI implements 八百屋{
    private トマト tomato;
    private キャベツ kyabetu;
    private 大根 daikon;
    private ほうれん草 hourensou;

    public 八百屋notDI(){
        tomato =  new トマト();
        kyabetu =  new キャベツ();
        daikon =  new 大根();
        hourensou =  new ほうれん草();
    }

    public void print(){
        System.out.println("------- NotDI --------");
        tomato.printName();
        kyabetu.printName();
        daikon.printName();
        hourensou.printName();
        System.out.println("---------------------");
    }

}
