#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.client.resources;

import javax.inject.Inject;

public class ResourceLoader {

  @Inject
  public ResourceLoader(AppResources appResources) {
    appResources.style().ensureInjected();
  }
  
}
