/*******************************************************************************
 * Copyright (c) 2013 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.e4.tools.event.spy.internal.model;

public enum ItemToFilter {
	NotSelected("-- item to filter --"), Topic("Topic"), ParameterName("Parameter name"), ParameterNameAndValue(
			"Parameter name and value"), ParameterValue("Some parameter value"), Publisher(
					"Event publisher"), ChangedElement("Changed element");

	private String text;

	private ItemToFilter(String text) {
		this.text = text;
	}

	@Override
	public String toString() {
		return text;
	}

	public static ItemToFilter toItem(String text) {
		for (ItemToFilter item : values()) {
			if (item.text.equals(text)) {
				return item;
			}
		}
		throw new IllegalArgumentException(
				String.format("%s not found for: %s", ItemToFilter.class.getSimpleName(), text));
	}
}