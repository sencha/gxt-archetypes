#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.theme.theme1.custom.client.button;


import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.ImageResource;
import com.google.gwt.resources.client.ImageResource.RepeatStyle;

import ${package}.theme.theme1.client.base.button.Css3ButtonCellAppearance;
import ${package}.theme.theme1.client.base.button.Css3ButtonCellAppearance.Css3ButtonResources;
import ${package}.theme.theme1.client.base.button.Css3ButtonCellAppearance.Css3ButtonStyle;

import com.google.gwt.resources.client.ImageResource.ImageOptions;

public class TritonButtonCellAppearance<M> extends Css3ButtonCellAppearance<M> {

  public interface TritonButtonStyle extends Css3ButtonStyle {
  }

  public TritonButtonCellAppearance() {
    this(GWT.<Css3ButtonCellAppearance.Css3ButtonResources> create(Css3ButtonResources.class));
  }

  public TritonButtonCellAppearance(Css3ButtonResources resources) {
    super(resources);
  }

  @Override
  protected boolean applyMenuArrowClass() {
    return true;
  }
}
