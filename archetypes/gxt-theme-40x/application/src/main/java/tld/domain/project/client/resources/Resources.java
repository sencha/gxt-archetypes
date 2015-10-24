package tld.domain.project.client.resources;

import com.google.gwt.core.shared.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.CssResource;

public interface Resources extends ClientBundle {
  
  public Resources INSTANCE = GWT.create(Resources.class);

  public interface Css3Styles extends CssResource {

    String buttonColorBrown();
    
    String buttonColorDeepPink();
    
  }
  
  @Source({"Styles.gss"})
  Css3Styles style();
  
}
