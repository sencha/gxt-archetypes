package tld.domain.project.client.customappearances;

import com.google.gwt.core.client.GWT;
import com.sencha.gxt.core.client.BindingPropertySet;
import com.sencha.gxt.core.client.BindingPropertySet.PropertyName;

public class ThemePropertyUtils {

  @PropertyName("gxt.css3.enabled")
  public interface Theme extends BindingPropertySet {
    @PropertyValue("true")
    boolean isCss3Enabled();
  }

  public static Theme themeSettings() {
    return GWT.<Theme> create(Theme.class);
  }

}
