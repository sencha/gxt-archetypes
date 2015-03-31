package tld.domain.project.client.customappearance;

import tld.domain.project.client.sliced.button.SlicedButtonCellAppearance;

public class SlicedButtonCellAppearanceGreen<C> extends SlicedButtonCellAppearance<C> {

  public interface SlicedButtonCellResourcesRed extends SlicedButtonCellResources {
    @Override
    @Source({ "com/sencha/gxt/theme/base/client/button/ButtonCell.css",
        "tld/domain/project/client/sliced/button/SlicedButtonCell.css",
        "tld/domain/project/client/sliced/button/SlicedToolBarButtonCell.css", "SlicedButtonRed.css" })
    SlicedButtonCellStyleRed style();
  }

  public interface SlicedButtonCellStyleRed extends SlicedButtonCellStyle {
  }

}
