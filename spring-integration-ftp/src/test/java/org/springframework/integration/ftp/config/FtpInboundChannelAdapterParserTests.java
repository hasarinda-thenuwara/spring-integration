/*
 * Copyright 2002-2010 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.integration.ftp.config;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.integration.file.remote.session.Session;
import org.springframework.integration.ftp.session.DefaultFtpClientFactory;

/**
 * @author Oleg Zhurakousky
 */
public class FtpInboundChannelAdapterParserTests {

//	@Test
//	public void testFtpInboundChannelAdapterComplete() throws Exception{
//		ApplicationContext ac = 
//			new ClassPathXmlApplicationContext("FtpInboundChannelAdapterParserTests-context.xml", this.getClass());
//		SourcePollingChannelAdapter adapter = ac.getBean("ftpInbound", SourcePollingChannelAdapter.class);
//		assertEquals("ftpInbound", adapter.getComponentName());
//		assertEquals("ftp:inbound-channel-adapter", adapter.getComponentType());
//		assertNotNull(TestUtils.getPropertyValue(adapter, "poller"));
//		assertEquals(ac.getBean("ftpChannel"), TestUtils.getPropertyValue(adapter, "outputChannel"));
//		FtpInboundFileSynchronizingMessageSource inbound = 
//			(FtpInboundFileSynchronizingMessageSource) TestUtils.getPropertyValue(adapter, "source");
//		
//		FtpInboundFileSynchronizer fisync = 
//			(FtpInboundFileSynchronizer) TestUtils.getPropertyValue(inbound, "synchronizer");
////		CompositeFileListFilter<?> filter = (CompositeFileListFilter<?>) TestUtils.getPropertyValue(fisync, "filter");
////		Set<?> filters = (Set<?>) TestUtils.getPropertyValue(filter, "fileFilters");
////		assertEquals(2, filters.size());
////		assertTrue(filters.contains(ac.getBean("entryListFilter")));
//		
//	}
	
	@Test
	public void testFtpInboundChannelAdapterCompleteNoId() throws Exception{

		ApplicationContext ac = 
			new ClassPathXmlApplicationContext("FtpInboundChannelAdapterParserTests-context.xml", this.getClass());
//		Map<String, SourcePollingChannelAdapter> spcas = ac.getBeansOfType(SourcePollingChannelAdapter.class);
//		SourcePollingChannelAdapter adapter = null;
//		for (String key : spcas.keySet()) {
//			if (!key.equals("ftpInbound")){
//				adapter = spcas.get(key);
//			}
//		}
//		assertNotNull(adapter);
	}

	public static class TestClientFactoryBean implements FactoryBean<DefaultFtpClientFactory>{

		public DefaultFtpClientFactory getObject() throws Exception {
			DefaultFtpClientFactory factory = mock(DefaultFtpClientFactory.class);
			Session session = mock(Session.class);
			when(factory.getSession()).thenReturn(session);
			return factory;
		}

		public Class<?> getObjectType() {
			return DefaultFtpClientFactory.class;
		}

		public boolean isSingleton() {
			return true;
		}
		
	}
}