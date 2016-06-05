import vegetables.ほうれん草;
import vegetables.キャベツ;
import vegetables.トマト;
import vegetables.大根;
import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Injector;
import yaoya.八百屋DI;
import yaoya.八百屋DIコンテナ;
import yaoya.八百屋notDI;

/**
 * Created by midori on 2016/05/29.
 */
public class Main {

    public static void main(String[] args) {

        /**
         *  DIをしていない場合
         */
        八百屋notDI yaoyaNotDI = new 八百屋notDI();
        yaoyaNotDI.print();




        /**
         *  DIをしている場合
         */
        トマト tomato = new トマト();
        キャベツ kyabetu = new キャベツ();
        大根 daikon = new 大根();
        ほうれん草 hourensou = new ほうれん草();

        八百屋DI yaoyaDI = new 八百屋DI(tomato, kyabetu, daikon, hourensou);
        yaoyaDI.print();




        /**
         *  DIコンテナを利用している場合(Guice)
         */
        // Inject設定(今回は特に必要なし)
        Injector injector = Guice.createInjector(new AbstractModule() {
            @Override
            protected void configure() {}
        });

        // このタイミングで、@Inject アノテーションが付与されているフィールドに
        // インスタンスがインジェクション(注入)される
        八百屋DIコンテナ yaoyaDIContainer = injector.getInstance(八百屋DIコンテナ.class);
        yaoyaDIContainer.print();

    }
}