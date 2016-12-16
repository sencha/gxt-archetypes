#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.theme.tritium.custom.client.field;

import com.google.gwt.core.client.GWT;

import ${package}.theme.tritium.client.base.field.Css3RadioAppearance;

public class TritonRadioAppearance extends Css3RadioAppearance {

  public interface TritonRadioResources extends Css3RadioResources {

    @Override
    @Source({"${packageInPathFormat}/theme/tritium/client/base/field/Css3ValueBaseField.gss",
            "${packageInPathFormat}/theme/tritium/client/base/field/Css3CheckBox.gss",
            "${packageInPathFormat}/theme/tritium/client/base/field/Css3Radio.gss", "TritonRadio.gss"})
    TritonRadioStyle style();
  }

  public interface TritonRadioStyle extends Css3RadioStyle {
  }

  public TritonRadioAppearance() {
    super(GWT.<TritonRadioResources> create(TritonRadioResources.class));
  }
}
