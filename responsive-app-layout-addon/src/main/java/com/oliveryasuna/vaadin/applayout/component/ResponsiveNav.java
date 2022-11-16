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

package com.oliveryasuna.vaadin.applayout.component;

import com.oliveryasuna.vaadin.applayout.util.ComponentUtils;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.PropertyDescriptor;
import com.vaadin.flow.component.PropertyDescriptors;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.dependency.NpmPackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Tag("responsive-nav")
@NpmPackage(value = "@oliveryasuna/responsive-app-layout", version = "2.3.1")
@JsModule("@oliveryasuna/responsive-app-layout")
public class ResponsiveNav extends Component {

  // Static fields
  //--------------------------------------------------

  private static final PropertyDescriptor<Boolean, Boolean> COLLAPSIBLE_DESCRIPTOR = PropertyDescriptors.propertyWithDefault("collapsible", false);

  private static final PropertyDescriptor<Boolean, Boolean> COLLAPSED_DESCRIPTOR = PropertyDescriptors.propertyWithDefault("collapsible", false);

  private static final String LABEL_SLOT_NAME = "label";

  // Constructors
  //--------------------------------------------------

  public ResponsiveNav() {
    super();
  }

  public ResponsiveNav(final Component label) {
    this();

    setLabel(label);
  }

  public ResponsiveNav(final ResponsiveNavItem... items) {
    this();

    addItem(items);
  }

  public ResponsiveNav(final Component label, final ResponsiveNavItem... items) {
    this();

    setLabel(label);
    addItem(items);
  }

  // Fields
  //--------------------------------------------------

  private Component label;

  private final List<ResponsiveNavItem> items = new ArrayList<>();

  // Methods
  //--------------------------------------------------

  private void removeLabel() {
    if(label != null) ComponentUtils.remove(label);

    label = null;
  }

  public void addItem(final ResponsiveNavItem... items) {
    for(final ResponsiveNavItem item : items) {
      this.items.add(item);

      ComponentUtils.add(item);
    }
  }

  public void removeItem(final ResponsiveNavItem... items) {
    for(final ResponsiveNavItem item : items) {
      this.items.remove(item);

      ComponentUtils.remove(item);
    }
  }

  public boolean isCollapsible() {
    return COLLAPSIBLE_DESCRIPTOR.get(this);
  }

  public void setCollapsible(final boolean collapsible) {
    COLLAPSIBLE_DESCRIPTOR.set(this, collapsible);
  }

  public void toggleCollapsed() {
    setCollapsed(!isCollapsed());
  }

  public boolean isCollapsed() {
    return COLLAPSED_DESCRIPTOR.get(this);
  }

  public void setCollapsed(final boolean collapsed) {
    COLLAPSED_DESCRIPTOR.set(this, collapsed);
  }

  // Getters/setters
  //--------------------------------------------------

  public Component getLabel() {
    return label;
  }

  public void setLabel(final Component label) {
    removeLabel();

    if(label == null) return;

    this.label = label;

    ComponentUtils.addSlotted(this, LABEL_SLOT_NAME, this.label);
  }

  public List<ResponsiveNavItem> getItems() {
    return Collections.unmodifiableList(items);
  }

}
