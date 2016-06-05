package yaoya;

import vegetables.ほうれん草;
import vegetables.キャベツ;
import vegetables.トマト;
import vegetables.大根;

/**
 * Created by midori on 2016/06/05.
 */
public class 八百屋DI implements 八百屋{
    private トマト tomato;
    private キャベツ kyabetu;
    private 大根 daikon;
    private ほうれん草 hourensou;

    public 八百屋DI(トマト tomato, キャベツ kyabetu, 大根 daikon, ほうれん草 hourensou) {
        this.tomato = tomato;
        this.kyabetu = kyabetu;
        this.daikon = daikon;
        this.hourensou = hourensou;
    }

    public void print(){
        System.out.println("---------- DI ---------");
        tomato.printName();
        kyabetu.printName();
        daikon.printName();
        hourensou.printName();
        System.out.println("-----------------------");
    }
}
