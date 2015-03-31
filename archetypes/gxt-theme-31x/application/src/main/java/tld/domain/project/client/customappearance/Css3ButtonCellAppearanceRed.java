package tld.domain.project.client.customappearance;

import tld.domain.project.client.base.button.Css3ButtonCellAppearance;

public class Css3ButtonCellAppearanceRed<M> extends Css3ButtonCellAppearance<M> {

  public interface Css3ButtonResourcesRed extends Css3ButtonResources {
    @Source({ "tld/domain/project/client/base/button/Css3ButtonCell.css",
        "tld/domain/project/client/base/button/Css3ButtonCell.css", "Css3ButtonRed.css" })
    Css3ButtonStyleRed style();
  }

  public interface Css3ButtonStyleRed extends Css3ButtonStyle {
  }

}
