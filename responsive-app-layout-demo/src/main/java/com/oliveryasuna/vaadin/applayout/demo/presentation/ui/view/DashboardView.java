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

package com.oliveryasuna.vaadin.applayout.demo.presentation.ui.view;

import com.oliveryasuna.vaadin.applayout.demo.presentation.ui.layout.MainLayout;
import com.oliveryasuna.vaadin.commons.component.AbstractComposite;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouteAlias;

@PageTitle("Dashboard")
@Route(value = "/", layout = MainLayout.class)
@RouteAlias(value = "/dashboard", layout = MainLayout.class)
public final class DashboardView extends AbstractComposite<VerticalLayout> {

  // Constructors
  //--------------------------------------------------

  public DashboardView() {
    super();
  }

  // Methods
  //--------------------------------------------------

  @Override
  protected VerticalLayout initContent() {
    return new VerticalLayout(
        new Span("DASHBOARD")
//        new Span("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Fermentum et sollicitudin ac orci phasellus egestas. Iaculis at erat pellentesque adipiscing commodo elit at imperdiet dui. Sit amet facilisis magna etiam tempor orci eu lobortis. Euismod elementum nisi quis eleifend quam. Amet consectetur adipiscing elit duis tristique sollicitudin nibh sit amet. Eu sem integer vitae justo eget magna. Diam vel quam elementum pulvinar etiam non quam lacus suspendisse. Viverra vitae congue eu consequat ac felis donec et odio. Massa tincidunt dui ut ornare lectus sit amet. Lacus sed turpis tincidunt id aliquet. Dictum non consectetur a erat nam at lectus. Non enim praesent elementum facilisis leo vel fringilla est. Cursus metus aliquam eleifend mi in."),
//        new Paragraph("Pulvinar etiam non quam lacus suspendisse faucibus. Sed nisi lacus sed viverra tellus. Sit amet facilisis magna etiam. Tempor orci eu lobortis elementum nibh tellus molestie nunc. Eget arcu dictum varius duis at consectetur lorem donec. Fringilla urna porttitor rhoncus dolor purus non enim praesent elementum. Mi proin sed libero enim. Eget sit amet tellus cras. Elementum pulvinar etiam non quam lacus suspendisse faucibus interdum. Integer vitae justo eget magna. Sociis natoque penatibus et magnis dis parturient. Vitae proin sagittis nisl rhoncus mattis rhoncus urna neque viverra. Venenatis lectus magna fringilla urna. Scelerisque in dictum non consectetur. Leo a diam sollicitudin tempor id eu nisl nunc mi. Arcu ac tortor dignissim convallis. Vulputate eu scelerisque felis imperdiet. Eu augue ut lectus arcu bibendum at varius vel. Interdum posuere lorem ipsum dolor."),
//        new Paragraph("At elementum eu facilisis sed odio morbi quis commodo odio. Dolor purus non enim praesent elementum facilisis. Sed felis eget velit aliquet sagittis id consectetur purus ut. Bibendum neque egestas congue quisque egestas diam in. Mauris ultrices eros in cursus. Elit eget gravida cum sociis natoque penatibus. Imperdiet dui accumsan sit amet nulla facilisi morbi. Maecenas accumsan lacus vel facilisis volutpat est. Scelerisque viverra mauris in aliquam sem fringilla ut morbi. Eget nunc lobortis mattis aliquam faucibus purus in massa. Ac tortor vitae purus faucibus. Mi bibendum neque egestas congue. Ac orci phasellus egestas tellus rutrum tellus pellentesque eu tincidunt. Morbi leo urna molestie at. Tellus rutrum tellus pellentesque eu tincidunt. Pellentesque sit amet porttitor eget dolor morbi non arcu risus. Sed augue lacus viverra vitae congue. Blandit volutpat maecenas volutpat blandit. Bibendum ut tristique et egestas quis ipsum. Commodo nulla facilisi nullam vehicula ipsum a."),
//        new Paragraph("Ut consequat semper viverra nam libero justo laoreet. Facilisis volutpat est velit egestas dui. Est ante in nibh mauris cursus mattis. In egestas erat imperdiet sed euismod. Adipiscing elit ut aliquam purus sit amet luctus. Nunc consequat interdum varius sit amet. Lacus vel facilisis volutpat est. Enim nec dui nunc mattis enim ut tellus. Tincidunt dui ut ornare lectus sit. At urna condimentum mattis pellentesque id nibh tortor id."),
//        new Paragraph("Quis imperdiet massa tincidunt nunc pulvinar sapien. At volutpat diam ut venenatis tellus in. Velit laoreet id donec ultrices tincidunt arcu non sodales neque. Mi in nulla posuere sollicitudin aliquam. Sit amet risus nullam eget felis. Vitae congue eu consequat ac felis. Tempor commodo ullamcorper a lacus vestibulum sed arcu non odio. Velit sed ullamcorper morbi tincidunt. Placerat orci nulla pellentesque dignissim enim sit amet venenatis. Turpis egestas maecenas pharetra convallis posuere morbi. Et egestas quis ipsum suspendisse ultrices gravida."),
//        new Paragraph("Amet tellus cras adipiscing enim eu turpis egestas pretium. Purus semper eget duis at tellus at. Ut sem nulla pharetra diam sit amet nisl. Purus in mollis nunc sed id semper risus. Venenatis urna cursus eget nunc. Sagittis vitae et leo duis ut. Viverra adipiscing at in tellus integer. Malesuada fames ac turpis egestas sed tempus. Egestas dui id ornare arcu odio ut sem nulla. Viverra adipiscing at in tellus. Elementum tempus egestas sed sed risus pretium quam vulputate dignissim. Sodales ut eu sem integer. Aenean sed adipiscing diam donec. Cras ornare arcu dui vivamus arcu felis bibendum. Dignissim diam quis enim lobortis. Odio euismod lacinia at quis."),
//        new Paragraph("Eu tincidunt tortor aliquam nulla facilisi. Aenean euismod elementum nisi quis eleifend. Amet mattis vulputate enim nulla aliquet. Arcu vitae elementum curabitur vitae nunc sed velit dignissim. Interdum velit laoreet id donec ultrices tincidunt. Dui vivamus arcu felis bibendum ut tristique et. In eu mi bibendum neque egestas. Id semper risus in hendrerit gravida. Faucibus scelerisque eleifend donec pretium vulputate sapien nec sagittis aliquam. Lectus arcu bibendum at varius vel pharetra vel. Nunc scelerisque viverra mauris in aliquam sem fringilla ut morbi. Tincidunt augue interdum velit euismod. Dolor sed viverra ipsum nunc aliquet bibendum."),
//        new Paragraph("Parturient montes nascetur ridiculus mus mauris. Faucibus ornare suspendisse sed nisi lacus sed viverra. Pretium nibh ipsum consequat nisl vel pretium lectus. Cursus metus aliquam eleifend mi in. Ullamcorper velit sed ullamcorper morbi tincidunt ornare massa. Interdum posuere lorem ipsum dolor sit. Tristique senectus et netus et malesuada fames ac turpis egestas. Sapien pellentesque habitant morbi tristique senectus et. Pulvinar neque laoreet suspendisse interdum consectetur. Sed cras ornare arcu dui vivamus arcu felis. Congue quisque egestas diam in arcu cursus euismod. Nulla facilisi cras fermentum odio eu. Sem viverra aliquet eget sit amet tellus cras adipiscing. Lorem mollis aliquam ut porttitor leo a. Diam vulputate ut pharetra sit amet aliquam. Et ligula ullamcorper malesuada proin."),
//        new Paragraph("Eget nunc lobortis mattis aliquam faucibus purus. Nec nam aliquam sem et tortor. A cras semper auctor neque vitae tempus. Euismod nisi porta lorem mollis aliquam. Vulputate dignissim suspendisse in est ante in nibh mauris. Sed ullamcorper morbi tincidunt ornare massa. Aliquet nec ullamcorper sit amet risus nullam. Purus sit amet volutpat consequat mauris nunc congue nisi. Velit sed ullamcorper morbi tincidunt ornare massa. Orci dapibus ultrices in iaculis nunc sed augue lacus. Justo eget magna fermentum iaculis eu non diam phasellus vestibulum. Turpis massa sed elementum tempus egestas."),
//        new Paragraph("Augue mauris augue neque gravida in fermentum et sollicitudin. Integer feugiat scelerisque varius morbi enim. Id consectetur purus ut faucibus. Morbi blandit cursus risus at ultrices mi tempus imperdiet. Risus in hendrerit gravida rutrum. Ornare suspendisse sed nisi lacus sed viverra tellus. Interdum posuere lorem ipsum dolor sit amet consectetur adipiscing. Amet est placerat in egestas erat imperdiet. Viverra nibh cras pulvinar mattis nunc. Fermentum odio eu feugiat pretium nibh ipsum consequat nisl vel. Ac odio tempor orci dapibus. Consectetur purus ut faucibus pulvinar elementum integer enim. Enim sit amet venenatis urna cursus eget nunc scelerisque viverra. Sapien eget mi proin sed libero enim sed faucibus turpis. Turpis massa tincidunt dui ut ornare lectus sit. Diam sit amet nisl suscipit adipiscing. Commodo odio aenean sed adipiscing diam. Urna nec tincidunt praesent semper. Elit sed vulputate mi sit.")
    );
  }

}
