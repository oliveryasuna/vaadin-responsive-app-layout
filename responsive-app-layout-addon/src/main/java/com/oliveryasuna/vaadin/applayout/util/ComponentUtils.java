/*
 * Copyright 2022 Oliver Yasuna
 *
 * Redistribution and use in source and binary forms, with or without modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice, this list of conditions and the following disclaimer in the documentation
 *     and/or other materials provided with the distribution.
 * 3. Neither the name of the copyright holder nor the names of its contributors may be used to endorse or promote products derived from this software without
 *      specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE
 * FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 * SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR
 * TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

package com.oliveryasuna.vaadin.applayout.util;

import com.oliveryasuna.commons.language.exception.UnsupportedInstantiationException;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.dom.Element;

/**
 * Utilities for working with slots.
 *
 * @author Oliver Yasuna
 * @since 1.0.0
 */
public final class ComponentUtils {

  // Static methods
  //--------------------------------------------------

  public static void add(final Component parent, final Component... children) {
    final Element parentElement = parent.getElement();

    for(final Component child : children) {
      parentElement.appendChild(child.getElement());
    }
  }

  public static void remove(final Component component) {
    component.getElement().removeFromParent();
  }

  public static void addSlotted(final Component parent, final String slot, final Component... children) {
    final Element parentElement = parent.getElement();

    for(final Component component : children) {
      setSlot(component, slot);
      parentElement.appendChild(component.getElement());
    }
  }

  public static void setSlot(final Component component, final String slot) {
    component.getElement().setAttribute("slot", slot);
  }

  public static void resetSlot(final Component component) {
    component.getElement().removeAttribute("slot");
  }

  // Constructors
  //--------------------------------------------------

  private ComponentUtils() {
    super();

    throw new UnsupportedInstantiationException();
  }

}
