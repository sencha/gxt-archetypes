package tld.domain.project.client.customappearance;

import tld.domain.project.client.base.button.Css3ButtonCellAppearance;

public class Css3ButtonCellAppearanceGreen<M> extends Css3ButtonCellAppearance<M> {

  public interface Css3ButtonResourcesGreen extends Css3ButtonResources {
    @Source({ "tld/domain/project/client/base/button/Css3ButtonCell.css",
        "tld/domain/project/client/base/button/Css3ButtonCell.css", "Css3ButtonGreen.css" })
    Css3ButtonStyleGreen style();
  }

  public interface Css3ButtonStyleGreen extends Css3ButtonStyle {
  }

}
