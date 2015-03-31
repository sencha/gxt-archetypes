package tld.domain.project.client.customappearances;

import tld.domain.project.client.base.button.Css3ButtonCellAppearance.Css3ButtonResources;
import tld.domain.project.client.base.button.Css3ButtonCellAppearance.Css3ButtonStyle;
import tld.domain.project.client.sliced.button.SlicedButtonCellAppearance.SlicedButtonCellResources;
import tld.domain.project.client.sliced.button.SlicedButtonCellAppearance.SlicedButtonCellStyle;

public class ButtonResources {

  // Css3
  public static interface Css3ButtonResourcesRed extends Css3ButtonResources {
    @Source({ "tld/domain/project/client/base/button/Css3ButtonCell.gss",
        "tld/domain/project/client/base/button/Css3ButtonCellToolBar.gss", "Css3ButtonRed.gss" })
    Css3ButtonStyleRed style();
  }

  public static interface Css3ButtonResourcesGreen extends Css3ButtonResources {
    @Source({ "tld/domain/project/client/base/button/Css3ButtonCell.gss",
        "tld/domain/project/client/base/button/Css3ButtonCellToolBar.gss", "Css3ButtonGreen.gss" })
    Css3ButtonStyleGreen style();
  }

  public static interface Css3ButtonStyleRed extends Css3ButtonStyle {
  }

  public static interface Css3ButtonStyleGreen extends Css3ButtonStyle {
  }

  // Sliced
  public static interface SlicedButtonResourcesRed extends SlicedButtonCellResources {
    @Override
    @Source({ "com/sencha/gxt/theme/base/client/button/ButtonCell.gss",
        "tld/domain/project/client/sliced/button/SlicedButtonCell.gss",
        "tld/domain/project/client/sliced/button/SlicedToolBarButtonCell.gss", "SlicedButtonRed.gss" })
    SlicedButtonCellStyleRed style();
  }

  public static interface SlicedButtonResourcesGreen extends SlicedButtonCellResources {
    @Override
    @Source({ "com/sencha/gxt/theme/base/client/button/ButtonCell.gss",
        "tld/domain/project/client/sliced/button/SlicedButtonCell.gss",
        "tld/domain/project/client/sliced/button/SlicedToolBarButtonCell.gss", "SlicedButtonGreen.gss" })
    SlicedButtonCellStyleGreen style();
  }

  public static interface SlicedButtonCellStyleRed extends SlicedButtonCellStyle {
  }

  public static interface SlicedButtonCellStyleGreen extends SlicedButtonCellStyle {
  }

}
