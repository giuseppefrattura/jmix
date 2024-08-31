package com.giuseppefrattura.jmix.view.measure;

import com.giuseppefrattura.jmix.entity.Measure;
import com.giuseppefrattura.jmix.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;


@Route(value = "measure", layout = MainView.class)
@ViewController("gf_Measure.list")
@ViewDescriptor("measure-list-view.xml")
@LookupComponent("measureDataGrid")
@DialogMode(width = "64em")
public class MeasureListView extends StandardListView<Measure> {
}