package ireport;

import java.util.ArrayList;
import java.util.Collection;


/**
 * ����JavaBean�Ĺ����ࡣ
 * ��iReport��DataSource�������л��õ���
 *
 * @author by Young.ZHU
 *                on 2012-8-3
 *
 * Package&FileName: ds.javabean.StudentFactory
 */
public class StudentFactory {
    //~ Static fields/initializers *********************************************

    // ����ʵ�����ĸ���
    private static final int RECORD_COUNT = 100;

    //~ Methods ****************************************************************

    /**
     * ���������iReport��DataResource����ʱҲ���õ�
     * �����Ǿ�̬���� static
     *
     * @return
     */
    public static Collection<Student> createBeanCollection() {
        Collection<Student> beanCollection = new ArrayList<Student>();

        for (int i = 0; i < RECORD_COUNT; i++) {
            beanCollection.add(StudentUtil.createStudent(i + 1));
        }

        return beanCollection;
    }
}
