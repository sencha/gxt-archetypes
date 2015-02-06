package com.sencha.gxt.test.it.tmp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.senchalabs.gwt.gwtdriver.by.ByNearestWidget;
import org.senchalabs.gwt.gwtdriver.by.FasterByChained;
import org.senchalabs.gwt.gwtdriver.models.GwtWidget;
import org.senchalabs.gwt.gwtdriver.models.GwtWidget.ForWidget;
import org.senchalabs.gwt.gwtdriver.models.GwtWidgetFinder;

import com.sencha.gxt.test.it.tmp.PDFormField.PDFormFieldFinder;

@ForWidget(com.sencha.gxt.widget.core.client.form.ValueBaseField.class)
public class PDFormField extends GwtWidget<PDFormFieldFinder> {

  public PDFormField(WebDriver driver, WebElement element) {
    super(driver, element);
  }

  public void clear() {
    getElement().findElement(By.tagName("input")).clear();
  }

  public void sendKeys(CharSequence... keys) {
    getElement().findElement(By.tagName("input")).sendKeys(keys);
  }

  public String getValue() {
    return getElement().findElement(By.tagName("input")).getAttribute("value");
  }

  public static class PDFormFieldFinder extends GwtWidgetFinder<PDFormField> {
    private String _formFieldLabel;

    public PDFormFieldFinder withLabel(String label) {
      this._formFieldLabel = label;
      return this;
    }

    @Override
    public PDFormFieldFinder withDriver(WebDriver driver) {
      return (PDFormFieldFinder) super.withDriver(driver);
    }

    @Override
    public PDFormField done() {
      WebElement elt = this.elt;
      if (_formFieldLabel != null) {
        String escaped = escapeToString(_formFieldLabel);
        WebElement labelElt = elt.findElement(new FasterByChained(By.xpath(".|.//*[contains(text()," + escaped + ")]"),
            new ByNearestWidget(driver, com.google.gwt.user.client.ui.Label.class)));
        elt = labelElt.findElement(new FasterByChained(By.xpath("../../td[2]"), By.tagName("input"),
            new ByNearestWidget(driver, com.sencha.gxt.widget.core.client.form.ValueBaseField.class)));
        return new PDFormField(driver, elt);
      }
      return null;
    }
  }
}