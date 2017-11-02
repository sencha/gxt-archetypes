#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.theme.theme2.custom.client.toolbar;

import com.google.gwt.core.client.GWT;

import ${package}.theme.theme2.client.base.toolbar.Css3ToolBarAppearance;

public class TritonToolBarAppearance extends Css3ToolBarAppearance {

  public interface TritonToolBarResources extends Css3ToolBarResources {

    @Override
    @Source({"com/sencha/gxt/theme/base/client/container/BoxLayout.gss",
            "${packageInPathFormat}/theme/theme2/client/base/container/Css3HBoxLayoutContainer.gss",
            "${packageInPathFormat}/theme/theme2/client/base/toolbar/Css3ToolBar.gss", 
            "TritonToolBar.gss"})
    TritonToolBarStyle style();
  }

  public interface TritonToolBarStyle extends Css3ToolBarStyle {
  }

  public TritonToolBarAppearance() {
    super(GWT.<TritonToolBarResources> create(TritonToolBarResources.class));
  }
}
