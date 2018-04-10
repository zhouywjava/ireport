package ireport;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @Description: 企业信息工厂类
 * @Author: zyw
 * @Date: 2018/4/10
 */
public class EnterPriseCreditBasicInfoFactory {

    // 生成实体对象的个数 (决定了生成的ireport里面有几条记录)
    private static final int RECORD_COUNT = 1;

    /**
     * 这个方法在iReport的DataResource配置时也会用到
     * 必须是静态方法 static
     *
     * @return
     */
    public static Collection<EnterPriseCreditBasicInfo> createBeanCollection() {
        Collection<EnterPriseCreditBasicInfo> beanCollection = new ArrayList<EnterPriseCreditBasicInfo>();

        for (int i = 0; i < RECORD_COUNT; i++) {
            beanCollection.add(new EnterPriseCreditBasicInfo());
        }

        return beanCollection;
    }
}
