/*
 * Created on Dec 21, 2010
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the
 * License. You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS"
 * BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 * 
 * Copyright @2010-2011 the original author or authors.
 */
package org.fest.assertions.api;

import static org.mockito.Mockito.*;

import java.util.Date;

import org.junit.Before;

import org.fest.assertions.internal.Objects;

/**
 * Tests for {@link DateAssert#isIn(Object...)} with vararg of Date or String.
 * 
 * @author Joel Costigliola
 */
public class DateAssert_isIn_Test_with_vararg_param extends AbstractDateAssertWithDateArg_Test {

  @Override
  @Before
  public void setUp() {
    super.setUp();
    assertions.objects = mock(Objects.class);
  }

  @Override
  protected DateAssert assertionInvocationWithDateArg() {
    return assertions.isIn(otherDate);
  }

  @Override
  protected DateAssert assertionInvocationWithStringArg(String dateAsString) {
    return assertions.isIn(dateAsString);
  }

  @Override
  protected void verifyAssertionInvocation(Date date) {
    verify(assertions.objects).assertIsIn(assertions.info, assertions.actual, new Object[] { date });
  }

}
