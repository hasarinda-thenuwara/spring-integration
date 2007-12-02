/*
 * Copyright 2002-2007 the original author or authors.
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

package org.springframework.integration.message;

/**
 * A simple Message implementation that encapsulates a single Object payload.
 * 
 * @author Mark Fisher
 */
public class DocumentMessage extends AbstractMessage {

	private Object payload;


	public DocumentMessage(Object id, Object payload) {
		super(id);
		this.payload = payload;
	}

	public Object getPayload() {
		return this.payload;
	}

}
