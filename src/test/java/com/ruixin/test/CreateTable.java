package com.ruixin.test;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngineConfiguration;
import org.junit.Test;

public class CreateTable {
 
    @Test
    public void createTableTest(){
        //�����ڵĻ�������
        ProcessEngine processEngine = ProcessEngineConfiguration
                .createProcessEngineConfigurationFromResource("activiti.cfg.xml")
                .buildProcessEngine();
        System.out.println("------processEngine:" + processEngine); 
    }
}

