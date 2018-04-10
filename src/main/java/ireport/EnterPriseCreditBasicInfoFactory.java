package ireport;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @Description: ��ҵ��Ϣ������
 * @Author: zyw
 * @Date: 2018/4/10
 */
public class EnterPriseCreditBasicInfoFactory {

    // ����ʵ�����ĸ��� (���������ɵ�ireport�����м�����¼)
    private static final int RECORD_COUNT = 1;

    /**
     * ���������iReport��DataResource����ʱҲ���õ�
     * �����Ǿ�̬���� static
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
