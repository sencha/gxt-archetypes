#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.theme.tritium.custom.client.field;

import com.google.gwt.core.client.GWT;

import ${package}.theme.tritium.client.base.field.Css3CheckBoxAppearance;

public class TritiumCheckBoxAppearance extends Css3CheckBoxAppearance {

  public interface TritiumCheckBoxResources extends Css3CheckBoxResources {
    @Override
    @Source({"${packageInPathFormat}/theme/tritium/client/base/field/Css3ValueBaseField.gss",
            "${packageInPathFormat}/theme/tritium/client/base/field/Css3CheckBox.gss", "TritiumCheckBox.gss"})
    TritiumCheckBoxStyle style();
  }

  public interface TritiumCheckBoxStyle extends Css3CheckBoxStyle {
  }

  public TritiumCheckBoxAppearance() {
    super(GWT.<TritiumCheckBoxResources> create(TritiumCheckBoxResources.class));
  }
}
