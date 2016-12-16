#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.client.application.home;

import com.gwtplatform.mvp.client.UiHandlers;

interface HomeUiHandlers extends UiHandlers {

  void onOpenWindowPresenter(String name);
  
  void onOpenWindowWidget(String name);

  void onOpenGrid();

}
