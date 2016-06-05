package yaoya;

import vegetables.ほうれん草;
import vegetables.キャベツ;
import vegetables.トマト;
import vegetables.大根;
import com.google.inject.Inject;

/**
 * Created by midori on 2016/06/05.
 */
public class 八百屋DIコンテナ implements 八百屋{
    @Inject
    private トマト tomato;

    @Inject
    private キャベツ kyabetu;

    @Inject
    private 大根 daikon;

    @Inject
    private ほうれん草 hourensou;


    public void print(){
        System.out.println("---------DI container-----------");
        tomato.printName();
        kyabetu.printName();
        daikon.printName();
        hourensou.printName();
        System.out.println("--------------------------------");
    }
}
