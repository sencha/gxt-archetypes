#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.theme.tritium.custom.client.field;

import com.google.gwt.core.client.GWT;

import ${package}.theme.tritium.client.base.field.Css3RadioAppearance;

public class TritiumRadioAppearance extends Css3RadioAppearance {

  public interface TritiumRadioResources extends Css3RadioResources {

    @Override
    @Source({"${packageInPathFormat}/theme/tritium/client/base/field/Css3ValueBaseField.gss",
            "${packageInPathFormat}/theme/tritium/client/base/field/Css3CheckBox.gss",
            "${packageInPathFormat}/theme/tritium/client/base/field/Css3Radio.gss", "TritiumRadio.gss"})
    TritiumRadioStyle style();
  }

  public interface TritiumRadioStyle extends Css3RadioStyle {
  }

  public TritiumRadioAppearance() {
    super(GWT.<TritiumRadioResources> create(TritiumRadioResources.class));
  }
}
