/*
 * Copyright 2015-2017 the original author or authors.
 *
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v1.0 which
 * accompanies this distribution and is available at
 *
 * http://www.eclipse.org/legal/epl-v10.html
 */

package org.junit.jupiter.api;

import static org.junit.platform.commons.meta.API.Usage.Experimental;

import org.junit.platform.commons.meta.API;
import org.junit.platform.commons.util.Preconditions;
import org.junit.platform.commons.util.ToStringBuilder;

/**
 * A {@code DynamicNode} is the abstract basis class for a container or a test
 * case generated at runtime.
 *
 * @since 5.0
 */
@API(Experimental)
public abstract class DynamicNode {

	private final String displayName;

	DynamicNode(String displayName) {
		this.displayName = Preconditions.notBlank(displayName, "displayName must not be null or blank");
	}

	/**
	 * Get the display name of this {@code DynamicTest}.
	 */
	public String getDisplayName() {
		return this.displayName;
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).append("displayName", displayName).toString();
	}

}
