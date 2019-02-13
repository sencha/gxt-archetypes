#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.theme.tritium.custom.client.button;

import com.google.gwt.core.client.GWT;

import ${package}.theme.tritium.client.base.button.Css3ButtonCellAppearance;

/**
 * Used for the subclass TritumButtonCellToolBarAppearance
 */
public class TritiumButtonCellAppearance<M> extends Css3ButtonCellAppearance<M> {

  public interface TritiumButtonStyle extends Css3ButtonStyle {
  }

  public TritiumButtonCellAppearance() {
    this(GWT.<Css3ButtonCellAppearance.Css3ButtonResources>create(Css3ButtonResources.class));
  }

  public TritiumButtonCellAppearance(Css3ButtonResources resources) {
    super(resources);
  }

}
