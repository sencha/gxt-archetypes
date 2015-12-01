#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;
import com.sencha.gxt.widget.core.client.container.Viewport;

import ${package}.client.application.ApplicationLayout;

public class ${module}EntryPoint implements EntryPoint {

  private ClientFactory clientFactory;
  
  @Override
  public void onModuleLoad() {
    clientFactory = new ClientFactory();
    
    Viewport viewport = new Viewport();
    viewport.add(new ApplicationLayout(clientFactory));

    RootPanel.get().add(viewport);
  }
  
}
