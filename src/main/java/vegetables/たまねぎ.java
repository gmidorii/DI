package vegetables;

/**
 * Created by midori on 2016/06/05.
 */
public class たまねぎ implements 野菜{
    private String name;
    public たまねぎ(String name) {
        this.name  = name;
    }

    public void printName() {
        System.out.println(name);
    }
}
