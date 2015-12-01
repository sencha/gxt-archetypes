#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.theme.tritium.custom.client.button;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ImageResource;
import com.google.gwt.resources.client.ImageResource.ImageOptions;

public class TritonButtonCellToolBarAppearance<M> extends TritonButtonCellAppearance<M> {

  public interface TritonButtonCellResources extends Css3ButtonResources {

    @Override
    @Source({"${packageInPathFormat}/theme/tritium/client/base/button/Css3ButtonCell.gss",
            "${packageInPathFormat}/theme/tritium/client/base/button/Css3ButtonCellToolBar.gss", "TritonButtonCellToolBar.gss"})
    TritonButtonCellStyle style();
  }

  public interface TritonButtonCellStyle extends TritonButtonStyle {
  }

  public TritonButtonCellToolBarAppearance() {
    super(GWT.<TritonButtonCellResources> create(TritonButtonCellResources.class));
  }
}
