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
import com.vaadin.flow.component.HasElement;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.dependency.NpmPackage;
import com.vaadin.flow.router.RouterLayout;

@Tag("responsive-app-layout")
@NpmPackage(value = "@oliveryasuna/responsive-app-layout", version = "2.3.1")
@JsModule("@oliveryasuna/responsive-app-layout")
public class ResponsiveAppLayout extends Component implements RouterLayout {

  // Static fields
  //--------------------------------------------------

  private static final String NAVBAR_SLOT_NAME = "navbar";

  private static final String DRAWER_SLOT_NAME = "drawer";

  // Constructors
  //--------------------------------------------------

  public ResponsiveAppLayout() {
    super();
  }

  // Fields
  //--------------------------------------------------

  private Component content;

  // Methods
  //--------------------------------------------------

  public void addToNavbar(final Component... components) {
    ComponentUtils.addSlotted(this, NAVBAR_SLOT_NAME, components);
  }

  public void addToDrawer(final Component... components) {
    ComponentUtils.addSlotted(this, DRAWER_SLOT_NAME, components);
  }

  private void removeContent() {
    if(content != null) ComponentUtils.remove(content);

    content = null;
  }

  @Override
  public void showRouterLayoutContent(final HasElement content) {
    final Component target = content != null
        ? content.getElement().getComponent().orElseThrow(() -> new IllegalArgumentException("The content is not a component."))
        : null;

    setContent(target);
  }

  // Getters/getters
  //--------------------------------------------------

  public Component getContent() {
    return content;
  }

  public void setContent(final Component content) {
    removeContent();

    if(content == null) return;

    this.content = content;

    ComponentUtils.resetSlot(this.content);
    ComponentUtils.add(this, this.content);
  }

}
