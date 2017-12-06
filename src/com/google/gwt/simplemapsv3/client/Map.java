package com.google.gwt.simplemapsv3.client;

import com.google.gwt.maps.client.MapWidget;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;
import com.google.maps.gwt.client.GoogleMap;
import com.google.maps.gwt.client.InfoWindow;
import com.google.maps.gwt.client.InfoWindowOptions;
import com.google.maps.gwt.client.LatLng;
import com.google.maps.gwt.client.MapOptions;
import com.google.maps.gwt.client.MapTypeId;
import com.google.maps.gwt.client.Marker;
import com.google.maps.gwt.client.MarkerOptions;
import com.google.maps.gwt.client.MouseEvent;

public class Map {
	MapOptions options  = MapOptions.create() ;
  	MarkerOptions markoptions = MarkerOptions.create();
  	final GoogleMap theMap;
  	MapWidget map;
  	
  	public Map(SimplePanel widg, VerticalPanel hp) {
	    options.setCenter(LatLng.create(49, -123));   
	    options.setZoom( 6 ) ;
	    options.setMapTypeId( MapTypeId.ROADMAP );
	    options.setDraggable(true);
	    options.setMapTypeControl(true);
	    options.setScaleControl(true) ;
	    options.setScrollwheel(true) ;
	    theMap = GoogleMap.create( widg.getElement(), options) ;
	    
	    markoptions.setMap(theMap);
	    hp.add(widg);
  	}
  	public Map(VerticalPanel widg) {
	    options.setCenter(LatLng.create(49, -123));   
	    options.setZoom( 6 ) ;
	    options.setMapTypeId( MapTypeId.ROADMAP );
	    options.setDraggable(true);
	    options.setMapTypeControl(true);
	    options.setScaleControl(true) ;
	    options.setScrollwheel(true) ;
	    //theMap = GoogleMap.create( widg.getElement(), options) ;
	   // map = new MapWidget(options);
	    markoptions.setMap(theMap);
	    //hp.add(widg);
  	}
  	
  	
  	public void addMarker(final LatLng ll) {
  		final Marker van = Marker.create(markoptions);
	    van.setPosition(ll);
	    van.setClickable(true);
	    van.addClickListener(new com.google.maps.gwt.client.Marker.ClickHandler() {


			@Override
			public void handle(MouseEvent event) {
				
				InfoWindowOptions infoWindowOptions = InfoWindowOptions.create();
		        infoWindowOptions.setContent("Testing");
		        infoWindowOptions.setPosition(ll);
		        InfoWindow infoWindow = InfoWindow.create(infoWindowOptions);
		        infoWindow.open(theMap, van);
			}
	    	  });
  	}
  	
  	public Widget getMap() {
  		return theMap;
  	}

}
