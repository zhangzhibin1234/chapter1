package com.junitTest;

import mockit.Expectations;
import mockit.integration.junit4.JMockit;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import java.util.ArrayList;

import static org.mockito.Mockito.when;

/**
 * @className:TestDobaOrderRpcDemo
 * @desc:
 * @author:zzb
 * @date:2020/8/221:04 version:1.0
 **/
@RunWith(JMockit.class)
public class TestDobaOrderRpcDemo {
    @Rule
    public MockitoRule mockitoRule = MockitoJUnit.rule();
    @InjectMocks
    private DobaOrderRPC dobaOrderRPC;
    @Mock
    private  StringUtilTs stringUtilTs;
    @Mock
    private ArrayList list;
    @Test
    public void testGetHello(){
        when(stringUtilTs.getHello()).thenReturn("123456");
        System.out.println(stringUtilTs.getHello());
        when(list.get(0)).thenReturn("1");
        System.out.println(list.get(0));
        String result=dobaOrderRPC.getHello();
        Assert.assertEquals("123456",result);
    }
    @Test
    public void testGetString(){
        mockStaticMethod();
        String result=dobaOrderRPC.getString();
        Assert.assertEquals("我很好",result);
    }

    public void mockStaticMethod(){
        new Expectations(StringUtilTs.class){
            {
                StringUtilTs.getString(anyString);
                result="我很好";
            }
        };
    }



}
