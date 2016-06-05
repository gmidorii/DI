package vegetables;

import com.google.inject.ImplementedBy;

/**
 * Created by midori on 2016/06/05.
 */

// 初期設定
@ImplementedBy(熊本すいか.class)
public interface すいか {
    void printSuica();
}
