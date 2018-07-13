package com.ruixin.test;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngineConfiguration;
import org.activiti.engine.repository.Deployment;
import org.junit.Test;

public class DeployTest {
	@Test
	public void deployTest1() {
		try {
			// �����ڵĻ�������
			ProcessEngine processEngine = ProcessEngineConfiguration
					.createProcessEngineConfigurationFromResource("activiti.cfg.xml").buildProcessEngine();
			System.out.println("------processEngine:" + processEngine);
			// ��������
			Deployment deployment = processEngine.getRepositoryService().createDeployment().name("��ٳ���")
					.addClasspathResource("diagrams/leave.bpmn").addClasspathResource("diagrams/leave.png").deploy();
			System.out.println(deployment.getId());
			System.out.println(deployment.getName());
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
