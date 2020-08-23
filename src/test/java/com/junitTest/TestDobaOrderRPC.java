//package com.junitTest;
//
//import mockit.Expectations;
//import mockit.MockUp;
//import mockit.integration.junit4.JMockit;
//import org.junit.Assert;
//import org.junit.Before;
//import org.junit.Rule;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.Mockito;
//import org.mockito.junit.MockitoJUnit;
//import org.mockito.junit.MockitoRule;
//import org.mockito.runners.MockitoJUnitRunner;
//
//import java.lang.reflect.Field;
//import java.lang.reflect.InvocationTargetException;
//import java.lang.reflect.Method;
//
//import static org.mockito.Mockito.when;
//
///**
// * @className:TestDobaOrderRPC
// * @desc:
// * @author:zzb
// * @date:2020/8/217:54 version:1.0
// **/
////@RunWith(MockitoJUnitRunner.class)
//@RunWith(JMockit.class)
//public class TestDobaOrderRPC {
//    @InjectMocks
//    private DobaOrderRPC dobaOrderRPC;
//    @Mock
//    private StringUtilTs stringUtilTs;
////    @Before
//////    public void setUp(){
//////        MockitoAnnotations.initMocks(this);
//////    }
//    @Before
//    public void setUp() throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, InvocationTargetException, InstantiationException {
//        Field fields=DobaOrderRPC.class.getDeclaredField("s");
//        fields.setAccessible(true);
//        fields.set(dobaOrderRPC,"hehehe");
//
//        Method method = StringUtilTs.class.getDeclaredMethod("getString", String.class);
//        method.setAccessible(true);
//        //method.invoke(stringUtilTs,String.class);
//        when(stringUtilTs.getHello()).thenReturn("hahah");
//
//
//    }
////    @Rule
////    public MockitoRule mockitoRule = MockitoJUnit.rule();
//    @Test
//    public void testGetHello(){
//        Assert.assertEquals("hahaa",dobaOrderRPC.getHello());
//    }
//    @Test
//    public void testGetString() throws NoSuchFieldException, IllegalAccessException {
//        mockStaticMethod();
//        String string =dobaOrderRPC.getString();
//        Assert.assertEquals("nihao",string);
//    }
//
//    public void mockStaticMethod(){
//        new Expectations(StringUtilTs.class){
//            {
//                StringUtilTs.getString(anyString);
//                result="nihao";
//            }
//        };
//    }
//}
