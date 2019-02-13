#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.theme.tritium.custom.client.button;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ImageResource;
import com.google.gwt.resources.client.ImageResource.ImageOptions;

public class TritiumButtonCellToolBarAppearance<M> extends TritiumButtonCellAppearance<M> {

  public interface TritiumButtonCellResources extends Css3ButtonResources {

    @Override
    @Source({"${packageInPathFormat}/theme/tritium/client/base/button/Css3ButtonCell.gss",
            "${packageInPathFormat}/theme/tritium/client/base/button/Css3ButtonCellToolBar.gss", "TritiumButtonCellToolBar.gss"})
    TritiumButtonCellStyle style();
  }

  public interface TritiumButtonCellStyle extends TritiumButtonStyle {
  }

  public TritiumButtonCellToolBarAppearance() {
    super(GWT.<TritiumButtonCellResources> create(TritiumButtonCellResources.class));
  }
}
