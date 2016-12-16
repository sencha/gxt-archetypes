#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.client.application.window;

import com.gwtplatform.mvp.client.UiHandlers;

interface WindowUiHandlers extends UiHandlers {

  void onHide();

}
