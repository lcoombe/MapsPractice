package com.google.gwt.simplemapsv3.client;


import com.google.gwt.layout.client.Layout.Alignment;
import com.google.gwt.simplemapsv3.shared.FieldVerifier;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.KeyCodes;
import com.google.gwt.event.dom.client.KeyUpEvent;
import com.google.gwt.event.dom.client.KeyUpHandler;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.DockLayoutPanel;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.LayoutPanel;
import com.google.gwt.user.client.ui.RootLayoutPanel;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.SplitLayoutPanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;











/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
import java.util.ArrayList;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.dom.client.Document;
import com.google.gwt.dom.client.Style.Unit;
import com.google.maps.gwt.client.InfoWindow;
import com.google.maps.gwt.client.InfoWindowOptions;
import com.google.maps.gwt.client.MapOptions;
//import com.google.maps.gwt.client.MapWidget;
import com.google.maps.gwt.client.LatLng;
import com.google.maps.gwt.client.Marker;
import com.google.maps.gwt.client.Marker.DblClickHandler;
import com.google.maps.gwt.client.MarkerOptions;
import com.google.maps.gwt.client.MouseEvent;
//import com.google.gwt.maps.testing.client.maps.AdvancedLayersWidget;
//import com.google.gwt.maps.testing.client.maps.AutocompletePlacesMapWidget;
//import com.google.gwt.maps.testing.client.maps.BasicMapWidget;
//import com.google.gwt.maps.testing.client.maps.ControlsMapWidget;
//import com.google.gwt.maps.testing.client.maps.CustomControlsMapWidget;
//import com.google.gwt.maps.testing.client.maps.DirectionsServiceMapWidget;
//import com.google.gwt.maps.testing.client.maps.DrawingMapWidget;
//import com.google.gwt.maps.testing.client.maps.ElevationMapWidget;
//import com.google.gwt.maps.testing.client.maps.FusionTablesMapWidget;
//import com.google.gwt.maps.testing.client.maps.HeatMapLayerWidget;
//import com.google.gwt.maps.testing.client.maps.ImageMapTypeWidget;
//import com.google.gwt.maps.testing.client.maps.InfoWindowMapWidget;
//import com.google.gwt.maps.testing.client.maps.KmlMapWidget;
//import com.google.gwt.maps.testing.client.maps.LanguageMapWidget;
//import com.google.gwt.maps.testing.client.maps.MultipleKmlMapWidget;
//import com.google.gwt.maps.testing.client.maps.OpenStreetMapLayerWidget;
//import com.google.gwt.maps.testing.client.maps.OverlayViewMapWidget;
//import com.google.gwt.maps.testing.client.maps.PanoramioMapWidget;
//import com.google.gwt.maps.testing.client.maps.PlaceSearchMapWidget;
//import com.google.gwt.maps.testing.client.maps.PolylineMapWidget;
//import com.google.gwt.maps.testing.client.maps.StreetViewCustomMapWidget;
//import com.google.gwt.maps.testing.client.maps.StreetViewMapWidget;
//import com.google.gwt.maps.testing.client.maps.StreetViewSideBySideMapWidget;
//import com.google.gwt.maps.testing.client.maps.StyledMapWidget;
//import com.google.gwt.maps.testing.client.maps.TransitDirectionsServiceMapWidget;
//import com.google.gwt.maps.testing.client.maps.WeatherLayersWidget;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.Widget;
import com.google.maps.gwt.client.GoogleMap;
import com.google.maps.gwt.client.LatLng;
import com.google.maps.gwt.client.MapTypeId;

public class SimpleMapsv3 implements EntryPoint {

  private final String mapsContainer = "maps";
 // private Map map;
 // private MapWidget amap;
  Label l = new Label();
  

  @Override
  public void onModuleLoad() {
	  	MapOptions options  = MapOptions.create() ;
	  	MarkerOptions markoptions = MarkerOptions.create();
	  	

	    options.setCenter(LatLng.create(49, -123));   
	    options.setZoom( 6 ) ;
	    options.setMapTypeId( MapTypeId.ROADMAP );
	    options.setDraggable(true);
	    options.setMapTypeControl(true);
	    options.setScaleControl(true) ;
	    options.setScrollwheel(true) ;

	    SimplePanel widg = new SimplePanel() ;
	  	//DockLayoutPanel widg = new DockLayoutPanel(Unit.EM);
	  	
	  	l.setText("Testing!");
	  	l.setVisible(true);
	    widg.setSize("70%","70%");
	    //widg.
	    widg.setStyleName("maps");
	   
	    //LayoutPanel vp = new LayoutPanel();
	    
	    
	    DockLayoutPanel vp = new DockLayoutPanel(Unit.EM);
	    TextBox l = new TextBox();
	    TextBox l2 = new TextBox();
	    l.setText("Culture crawl!");
	    l2.setText("Test!");
	    SimplePanel sp = new SimplePanel();
	    sp.add(l);
	    SimplePanel sp2 = new SimplePanel();
	    sp2.add(l2);
	    VerticalPanel vertical = new VerticalPanel();
	    vertical.add(sp);
	    vertical.add(sp2);
	    vp.addWest(vertical, 10);
	    
	    TextBox belowMap = new TextBox();
	    belowMap.setText("I am below the map!");
	    SimplePanel textMap = new SimplePanel();
	    textMap.add(belowMap);
	    
	    
	    //vp.addNorth(new HTML("Header"), 2);
	    vp.addSouth(new HTML("Footer"), 20);
	    //vp.add(l);
	    //labelPanel.
	    

	    final GoogleMap theMap = GoogleMap.create( widg.getElement(), options) ;

	    
	    markoptions.setMap(theMap);
	    //vp.add(widg);
	    vp.add(widg);
	    vp.setStyleName("maps");

	    
	    
	    RootLayoutPanel.get().add( vp ) ;

	    
	    
	    final LatLng vancouver = LatLng.create(49, -123);
	    final LatLng van2 = LatLng.create(49.5, -123.12);
	    //theMap.addMarker(vancouver);
	    final Marker van = Marker.create(markoptions);
	    van.setPosition(vancouver);
	    van.setClickable(true);
	    van.addClickListener(new com.google.maps.gwt.client.Marker.ClickHandler() {


			@Override
			public void handle(MouseEvent event) {
				
				InfoWindowOptions infoWindowOptions = InfoWindowOptions.create();
		        infoWindowOptions.setContent("Testing");
		        infoWindowOptions.setPosition(vancouver);
		        InfoWindow infoWindow = InfoWindow.create(infoWindowOptions);
		        infoWindow.open(theMap, van);
			}
	    	  });
	    
	    final Marker anotherMarker = Marker.create(markoptions);
	    anotherMarker.setPosition(van2);
	    anotherMarker.setClickable(true);
	    anotherMarker.addClickListener(new com.google.maps.gwt.client.Marker.ClickHandler() {


			@Override
			public void handle(MouseEvent event) {
				
				InfoWindowOptions infoWindowOptions = InfoWindowOptions.create();
		        infoWindowOptions.setContent("vancouver!");
		        infoWindowOptions.setPosition(van2);
		        InfoWindow infoWindow = InfoWindow.create(infoWindowOptions);
		        infoWindow.open(theMap, anotherMarker);
			}
	    	  });
	    
	    
	    	
	    //RootPanel.get("cultureSpaces").add(widg);
	    
	    
	    
	  
	  
  }

  
}