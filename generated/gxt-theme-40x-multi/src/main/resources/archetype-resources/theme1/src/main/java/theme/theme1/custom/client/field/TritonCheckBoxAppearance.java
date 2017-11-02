#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.theme.theme1.custom.client.field;

import com.google.gwt.core.client.GWT;

import ${package}.theme.theme1.client.base.field.Css3CheckBoxAppearance;

public class TritonCheckBoxAppearance extends Css3CheckBoxAppearance {

  public interface TritonCheckBoxResources extends Css3CheckBoxResources {
    @Override
    @Source({"${packageInPathFormat}/theme/theme1/client/base/field/Css3ValueBaseField.gss",
            "${packageInPathFormat}/theme/theme1/client/base/field/Css3CheckBox.gss", "TritonCheckBox.gss"})
    TritonCheckBoxStyle style();
  }

  public interface TritonCheckBoxStyle extends Css3CheckBoxStyle {
  }

  public TritonCheckBoxAppearance() {
    super(GWT.<TritonCheckBoxResources> create(TritonCheckBoxResources.class));
  }
}
