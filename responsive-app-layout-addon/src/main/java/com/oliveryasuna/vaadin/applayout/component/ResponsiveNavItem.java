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
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.internal.StateTree;
import com.vaadin.flow.router.RouteConfiguration;
import com.vaadin.flow.router.Router;
import com.vaadin.flow.server.VaadinService;

@Tag("responsive-nav-item")
@NpmPackage(value = "@oliveryasuna/responsive-app-layout", version = "2.3.1")
@JsModule("@oliveryasuna/responsive-app-layout")
public class ResponsiveNavItem extends Component {

  // Static fields
  //--------------------------------------------------

  private static final PropertyDescriptor<String, String> PATH_DESCRIPTOR = PropertyDescriptors.attributeWithDefault("path", "");

  private static final PropertyDescriptor<Boolean, Boolean> DISABLED_DESCRIPTOR = PropertyDescriptors.propertyWithDefault("disabled", false);

  private static final String ICON_SLOT_NAME = "icon";

  // Constructors
  //--------------------------------------------------

  public ResponsiveNavItem() {
    super();
  }

  public ResponsiveNavItem(final Component label, final Component icon, final Class<? extends Component> view) {
    this();

    setLabel(label);
    setIcon(icon);
    setPath(view);
  }

  public ResponsiveNavItem(final String label, final Component icon, final Class<? extends Component> view) {
    this(new Span(label), icon, view);
  }

  public ResponsiveNavItem(final String label, final VaadinIcon icon, final Class<? extends Component> view) {
    this(new Span(label), icon.create(), view);
  }

  // Fields
  //--------------------------------------------------

  private Component label;

  private Component icon;

  // Methods
  //--------------------------------------------------

  private void removeIcon() {
    if(icon != null) ComponentUtils.remove(icon);

    icon = null;
  }

  private void removeLabel() {
    if(label != null) ComponentUtils.remove(label);

    label = null;
  }

  public String getPath() {
    return PATH_DESCRIPTOR.get(this);
  }

  public void setPath(final String path) {
    PATH_DESCRIPTOR.set(this, path);
  }

  public void setPath(final Class<? extends Component> view) {
    final String url = RouteConfiguration.forRegistry(getRouter().getRegistry()).getUrl(view);

    setPath(url);
  }

  private Router getRouter() {
    Router router = null;

    if(getElement().getNode().isAttached()) {
      final StateTree tree = (StateTree)getElement().getNode().getOwner();

      router = tree.getUI().getInternals().getRouter();
    }

    if(router == null) {
      router = VaadinService.getCurrent().getRouter();
    }

    if(router == null) {
      throw new IllegalStateException("Router not found.");
    }

    return router;
  }

  public boolean isDisabled() {
    return DISABLED_DESCRIPTOR.get(this);
  }

  public void setDisabled(final boolean disabled) {
    DISABLED_DESCRIPTOR.set(this, disabled);
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

    ComponentUtils.resetSlot(this.label);
    ComponentUtils.add(this, this.label);
  }

  public Component getIcon() {
    return icon;
  }

  public void setIcon(final Component icon) {
    removeIcon();

    if(icon == null) return;

    this.icon = icon;

    ComponentUtils.addSlotted(this, ICON_SLOT_NAME, this.icon);
  }

}
