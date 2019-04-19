import com.dygstudio.studyspring.annotation.AnnotationTest;
import com.dygstudio.studyspring.assemble.AssembleTest;
import com.dygstudio.studyspring.cglib.CglibTest;
import com.dygstudio.studyspring.factorybean.ProxyFactoryBeanTest;
import com.dygstudio.studyspring.instance.TestInstance;
import com.dygstudio.studyspring.ioc.TestIoC;
import com.dygstudio.studyspring.jdk.JdkTest;
import com.dygstudio.studyspring.scope.ScopeTest;

import java.lang.annotation.Annotation;

public class Main {

    public static void main(String[] args) {
        //TestIoC.test();
        //TestInstance.test1();
        //TestInstance.test2();
        //TestInstance.test3();
        //ScopeTest.test();
        //AssembleTest.test();
        //AnnotationTest.test();
        //JdkTest.test();
        //CglibTest.test();
        ProxyFactoryBeanTest.test();
    }
}