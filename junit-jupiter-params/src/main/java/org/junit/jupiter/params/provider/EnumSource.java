/*
 * Copyright 2015-2017 the original author or authors.
 *
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v1.0 which
 * accompanies this distribution and is available at
 *
 * http://www.eclipse.org/legal/epl-v10.html
 */

package org.junit.jupiter.params.provider;

import static org.junit.platform.commons.meta.API.Usage.Experimental;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.junit.platform.commons.meta.API;

/**
 * {@code @EnumSource} is an {@link ArgumentsSource} for constants of a
 * specified {@linkplain #value Enum}.
 *
 * <p>The enum constants will be provided as arguments to a {@code @ParameterizedTest}
 * method using an {@code EnumArgumentsProvider}.
 *
 * <p>The set of enum constants can be restricted by listing the desired values
 * via the {@link #names} attribute.
 *
 * @since 5.0
 * @see org.junit.jupiter.params.provider.ArgumentsSource
 * @see org.junit.jupiter.params.provider.EnumArgumentsProvider
 * @see org.junit.jupiter.params.ParameterizedTest
 */
@Target({ ElementType.ANNOTATION_TYPE, ElementType.METHOD })
@Retention(RetentionPolicy.RUNTIME)
@Documented
@API(Experimental)
@ArgumentsSource(EnumArgumentsProvider.class)
public @interface EnumSource {

	/**
	 * The enum type that serves as the source of the enum constants.
	 *
	 * @see #names
	 */
	Class<? extends Enum<?>> value();

	/**
	 * The names of enum constants to provide.
	 *
	 * <p>If no names are specified, all declared enum constants will be provided.
	 *
	 * @see #value
	 */
	String[] names() default {};

}
