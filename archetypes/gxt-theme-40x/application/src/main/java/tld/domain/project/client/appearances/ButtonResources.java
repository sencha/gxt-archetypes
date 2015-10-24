package tld.domain.project.client.appearances;

import tld.domain.project.client.base.button.Css3ButtonCellAppearance.Css3ButtonResources;
import tld.domain.project.client.base.button.Css3ButtonCellAppearance.Css3ButtonStyle;

public class ButtonResources {

  public static interface Css3ButtonResourcesRed extends Css3ButtonResources {
    @Source({ "tld/domain/project/client/base/button/Css3ButtonCell.gss",
        "tld/domain/project/client/base/button/Css3ButtonCellToolBar.gss", "Css3ButtonRed.gss" })
    Css3ButtonStyleRed style();
  }

  public static interface Css3ButtonStyleRed extends Css3ButtonStyle {
  }

  public static interface Css3ButtonResourcesGreen extends Css3ButtonResources {
    @Source({ "tld/domain/project/client/base/button/Css3ButtonCell.gss",
        "tld/domain/project/client/base/button/Css3ButtonCellToolBar.gss", "Css3ButtonGreen.gss" })
    Css3ButtonStyleGreen style();
  }

  public static interface Css3ButtonStyleGreen extends Css3ButtonStyle {
  }

}
